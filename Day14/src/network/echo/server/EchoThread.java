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
