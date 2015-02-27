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
		
		// 연결 요청을 받아들이기 위해
		ServerSocket serverSock = new ServerSocket(3000);
		
		// 연결 요청 대기
		Socket sock = serverSock.accept();	// 연결 요청 대기하고 있다가
											// -> 요청 오면 상대방과 연결된
											//    Socket 객체를 만들어서 리턴
		
		// 여기에 도달하면 연결 수립이 이뤄진 경우
		
		InputStream in = sock.getInputStream();	// 상대방과 연결(sock)된 입력 스트림
		OutputStream out = sock.getOutputStream();	// 상대방과 연결(sock)된 출력 스트림
		
		// in을 통해 데이터를 읽으면, 상대방이 보낸 데이터 읽음
		// out을 통해 데이터를 쓰면, 상대방에게 데이터를 보냄
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
		
		while (true) {
			// 데이터 읽고
			String recvData = reader.readLine();
			System.out.println("수신: " + recvData);
			// 그대로 다시 내보냄
			writer.write(recvData + "\n");
			writer.flush();	// 버퍼가 가득 차지 않아도 데이터를 내보내도록
		}
		
	}
	
}
