package network.echo.server;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	public static void main(String[] args) throws Exception {
		
		// ���� ��û�� �޾Ƶ��̱� ����
		ServerSocket serverSock = new ServerSocket(3000);
		
		while (true) {
			// ���� ��û ���
			Socket sock = serverSock.accept();	// ���� ��û ����ϰ� �ִٰ�
												// -> ��û ���� ����� �����
												//    Socket ��ü�� ���� ����
			
			// ���⿡ �����ϸ� ���� ������ �̷��� ���
			
			EchoThread t = new EchoThread(sock);
			t.start();
		}
		
		
	}
	
}