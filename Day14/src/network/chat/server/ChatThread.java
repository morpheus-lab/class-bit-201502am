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
		
		InputStream in = sock.getInputStream();	// 상대방과 연결(sock)된 입력 스트림
		OutputStream out = sock.getOutputStream();	// 상대방과 연결(sock)된 출력 스트림
		
		// in을 통해 데이터를 읽으면, 상대방이 보낸 데이터 읽음
		// out을 통해 데이터를 쓰면, 상대방에게 데이터를 보냄
		
		reader = new BufferedReader(new InputStreamReader(in));
		writer = new BufferedWriter(new OutputStreamWriter(out));
	}
	
	// 이 스레드가 담당하고 있는 클라이언트에게
	// 메시지를 송신하는 메소드
	public void sendMessage(String msg) throws IOException {
		writer.write(msg + "\n");
		writer.flush();
	}
	
	@Override
	public void run() {
		try {
			// 대화명 처리
			String nick = reader.readLine();
			
			// 모든 클라이언트에게 "nick님이 입장하였습니다." 메시지 보내기
			synchronized (ChatServer.clients) {
				Iterator<ChatThread> iter = ChatServer.clients.iterator();
				while (iter.hasNext()) {
					ChatThread t = iter.next();
					t.sendMessage(nick + "님이 입장하였습니다.");
				}
			}
			
			while (true) {
				// 데이터 읽고
				String recvData = reader.readLine();
				System.out.println("수신: " + recvData);
				// 모든 클라이언트에게 전송
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
				ChatServer.clients.remove(this);	// 스레드가 종료될 때, 자기 자신을 clients 목록으로부터 제거
			}
			if (sock != null) {
				try {
					sock.close();
				} catch (Exception e) {}
			}
		}
	}
	
}
