package network.chat.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {	// [tip] �̸��ٲٱ�: �̸��� Ŀ���� �ΰ� <Alt>+<Shift>+R
	
	// ��� ChatThread�� ���
	static List<ChatThread> clients = new ArrayList<ChatThread>();
	
	public static void main(String[] args) throws Exception {
		
		// ���� ��û�� �޾Ƶ��̱� ����
		ServerSocket serverSock = new ServerSocket(3000);
		
		while (true) {
			// ���� ��û ���
			Socket sock = serverSock.accept();	// ���� ��û ����ϰ� �ִٰ�
												// -> ��û ���� ����� �����
												//    Socket ��ü�� ���� ����
			
			// ���⿡ �����ϸ� ���� ������ �̷��� ���
			
			ChatThread t = new ChatThread(sock);
			synchronized (clients) {
				clients.add(t);	// Ŭ���̾�Ʈ ��Ͽ� ���
			}
			t.start();
		}
		
		
	}
	
}
