package java_eclipse;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		try{
		ServerSocket server=new ServerSocket(9999);
		System.out.println("��ʼ�Զ˿�9999���м���");
		while(true){
		Socket sc=server.accept();
		DataInputStream din=new DataInputStream(sc.getInputStream());
		DataOutputStream dout=new DataOutputStream(sc.getOutputStream());
		  System.out.println("�ͻ���ip��ַ�ǣ�"+sc.getInetAddress());
		System.out.println("�ͻ��˶˿ں��ǣ�"+sc.getPort());
		  System.out.println("���ض˿ں��ǣ�"+sc.getLocalPort());

		//System.out.println("�ͻ�����Ϣ�ǣ�"+ din.readUTF());
		dout.writeUTF("11111111111222");
		byte[] b = new byte[10];
		System.out.println(din.read(b));
		System.out.println(new String(b));
		System.out.println("�ѷ�����Ϣ");
		
		din.close();
		dout.close();
		sc.close();
		//server.close();//����ע�͵�
		}
		}catch(Exception e){
		e.printStackTrace();
		}
		}

}


