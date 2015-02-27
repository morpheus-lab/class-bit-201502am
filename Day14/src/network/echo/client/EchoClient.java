package network.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	
	public static void main(String[] args) throws Exception {
		
		// 에코 서버에 접속하는 Socket 객체 생성
		Socket sock = new Socket("121.138.83.1", 3000);
		
		// 접속 성공
		System.out.println("접속됨");
		
		InputStream in = sock.getInputStream();	// 서버의 OutputStream과 연결
		OutputStream out = sock.getOutputStream();	// 서버의 InputStream과 연결
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		//                     (    버퍼기능추가  ( in에 문자처리기능 추가 ))
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
		//                     (    버퍼기능추가  ( out에 문자처리기능 추가 ))
		
		System.out.println("데이터 송수신 준비 완료");
		
		// 키보드 입력 읽기용
		Scanner scanner = new Scanner(System.in);
		
		// 화면 출력용
//		System.out;
		
		while (true) {
			// 키보드로부터 데이터 읽기
			String inputData = scanner.nextLine();
			// 네트워크 소켓을 통해 데이터 보내기
			writer.write(inputData + "\n");
			writer.flush();
			// 되돌아오는 데이터를 읽기
			String returnData = reader.readLine();
			// 화면에 출력
			System.out.println(">>> " + returnData);
		}
	}
	
}
















