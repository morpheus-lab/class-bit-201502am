package network.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoThread extends Thread {
	
	private Socket sock;
	
	public EchoThread(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		try {
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
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sock != null) {
				try {
					sock.close();
				} catch (Exception e) {}
			}
		}
	}
	
}
