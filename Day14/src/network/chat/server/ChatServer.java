package network.chat.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {	// [tip] 이름바꾸기: 이름에 커서를 두고 <Alt>+<Shift>+R
	
	// 모든 ChatThread의 목록
	static List<ChatThread> clients = new ArrayList<ChatThread>();
	
	public static void main(String[] args) throws Exception {
		
		// 연결 요청을 받아들이기 위해
		ServerSocket serverSock = new ServerSocket(3000);
		
		while (true) {
			// 연결 요청 대기
			Socket sock = serverSock.accept();	// 연결 요청 대기하고 있다가
												// -> 요청 오면 상대방과 연결된
												//    Socket 객체를 만들어서 리턴
			
			// 여기에 도달하면 연결 수립이 이뤄진 경우
			
			ChatThread t = new ChatThread(sock);
			synchronized (clients) {
				clients.add(t);	// 클라이언트 목록에 담기
			}
			t.start();
		}
		
		
	}
	
}
