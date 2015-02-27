package network.chat.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	
	// mainThread: 키보드 입력 받고, 그 메시지를 서버에 전송
	// 별도Thread: 서버로부터 메시지를 수신, 그 메시지를 화면에 출력
	
	static Socket sock;
	
	static InputStream in;
	static OutputStream out;
	
	static BufferedReader reader;
	static BufferedWriter writer;
	
	static boolean continueRead = true;
	
	static class MsgReadThread extends Thread {
		@Override
		public void run() {
			try {
				while (continueRead) {
					// 서버가 보내는 메시지 읽기
					String returnData = reader.readLine();
					// 화면에 출력
					System.out.println(">>> " + returnData);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			// [tip] try-catch 자동으로 묶기:
			// 묶을 부분을 선택한 다음,
			// <Alt>+<Shift>+Z 누른 후 "Try/catch block" 선택
		}
	}
	
	public static void main(String[] args) throws Exception {
		// 키보드 입력 읽기용
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("대화명:");
		String nick = scanner.nextLine();
		
		// 채팅 서버에 접속하는 Socket 객체 생성
		sock = new Socket("121.138.83.1", 3000);
		in = sock.getInputStream();
		out = sock.getOutputStream();
		reader = new BufferedReader(new InputStreamReader(in));
		writer = new BufferedWriter(new OutputStreamWriter(out));
		
		// 대화명을 서버에 전송
		writer.write(nick + "\n");
		writer.flush();
		
		MsgReadThread t = new MsgReadThread();	// 서버 메시지 읽는 스레드
		t.start();	// 서버 메시지 읽기 시작
		
		while (true) {
			// 키보드로부터 데이터 읽기
			String inputData = scanner.nextLine();
			// 네트워크 소켓을 통해 데이터 보내기
			writer.write(inputData + "\n");
			writer.flush();
		}
	}
	
}
















