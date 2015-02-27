package network.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Iterator;

public class ChatThread extends Thread {
	
	private Socket sock;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public ChatThread(Socket sock) throws IOException {
		this.sock = sock;
		
		InputStream in = sock.getInputStream();	// ����� ����(sock)�� �Է� ��Ʈ��
		OutputStream out = sock.getOutputStream();	// ����� ����(sock)�� ��� ��Ʈ��
		
		// in�� ���� �����͸� ������, ������ ���� ������ ����
		// out�� ���� �����͸� ����, ���濡�� �����͸� ����
		
		reader = new BufferedReader(new InputStreamReader(in));
		writer = new BufferedWriter(new OutputStreamWriter(out));
	}
	
	// �� �����尡 ����ϰ� �ִ� Ŭ���̾�Ʈ����
	// �޽����� �۽��ϴ� �޼ҵ�
	public void sendMessage(String msg) throws IOException {
		writer.write(msg + "\n");
		writer.flush();
	}
	
	@Override
	public void run() {
		try {
			// ��ȭ�� ó��
			String nick = reader.readLine();
			
			// ��� Ŭ���̾�Ʈ���� "nick���� �����Ͽ����ϴ�." �޽��� ������
			synchronized (ChatServer.clients) {
				Iterator<ChatThread> iter = ChatServer.clients.iterator();
				while (iter.hasNext()) {
					ChatThread t = iter.next();
					t.sendMessage(nick + "���� �����Ͽ����ϴ�.");
				}
			}
			
			while (true) {
				// ������ �а�
				String recvData = reader.readLine();
				System.out.println("����: " + recvData);
				// ��� Ŭ���̾�Ʈ���� ����
				synchronized (ChatServer.clients) {
					Iterator<ChatThread> iter = ChatServer.clients.iterator();
					while (iter.hasNext()) {
						ChatThread t = iter.next();
						t.sendMessage(nick + ": " + recvData);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			synchronized (ChatServer.clients) {
				ChatServer.clients.remove(this);	// �����尡 ����� ��, �ڱ� �ڽ��� clients ������κ��� ����
			}
			if (sock != null) {
				try {
					sock.close();
				} catch (Exception e) {}
			}
		}
	}
	
}
