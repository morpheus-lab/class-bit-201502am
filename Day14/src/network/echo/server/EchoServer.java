package network.echo.server;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	public static void main(String[] args) throws Exception {
		
		// 연결 요청을 받아들이기 위해
		ServerSocket serverSock = new ServerSocket(3000);
		
		while (true) {
			// 연결 요청 대기
			Socket sock = serverSock.accept();	// 연결 요청 대기하고 있다가
												// -> 요청 오면 상대방과 연결된
												//    Socket 객체를 만들어서 리턴
			
			// 여기에 도달하면 연결 수립이 이뤄진 경우
			
			EchoThread t = new EchoThread(sock);
			t.start();
		}
		
		
	}
	
}
