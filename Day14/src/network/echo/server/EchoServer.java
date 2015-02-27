package network.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	public static void main(String[] args) throws Exception {
		
		// ���� ��û�� �޾Ƶ��̱� ����
		ServerSocket serverSock = new ServerSocket(3000);
		
		// ���� ��û ���
		Socket sock = serverSock.accept();	// ���� ��û ����ϰ� �ִٰ�
											// -> ��û ���� ����� �����
											//    Socket ��ü�� ���� ����
		
		// ���⿡ �����ϸ� ���� ������ �̷��� ���
		
		InputStream in = sock.getInputStream();	// ����� ����(sock)�� �Է� ��Ʈ��
		OutputStream out = sock.getOutputStream();	// ����� ����(sock)�� ��� ��Ʈ��
		
		// in�� ���� �����͸� ������, ������ ���� ������ ����
		// out�� ���� �����͸� ����, ���濡�� �����͸� ����
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
		
		while (true) {
			// ������ �а�
			String recvData = reader.readLine();
			System.out.println("����: " + recvData);
			// �״�� �ٽ� ������
			writer.write(recvData + "\n");
			writer.flush();	// ���۰� ���� ���� �ʾƵ� �����͸� ����������
		}
		
	}
	
}
