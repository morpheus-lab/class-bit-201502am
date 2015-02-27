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
	
	// mainThread: Ű���� �Է� �ް�, �� �޽����� ������ ����
	// ����Thread: �����κ��� �޽����� ����, �� �޽����� ȭ�鿡 ���
	
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
					// ������ ������ �޽��� �б�
					String returnData = reader.readLine();
					// ȭ�鿡 ���
					System.out.println(">>> " + returnData);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			// [tip] try-catch �ڵ����� ����:
			// ���� �κ��� ������ ����,
			// <Alt>+<Shift>+Z ���� �� "Try/catch block" ����
		}
	}
	
	public static void main(String[] args) throws Exception {
		// Ű���� �Է� �б��
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ȭ��:");
		String nick = scanner.nextLine();
		
		// ä�� ������ �����ϴ� Socket ��ü ����
		sock = new Socket("121.138.83.1", 3000);
		in = sock.getInputStream();
		out = sock.getOutputStream();
		reader = new BufferedReader(new InputStreamReader(in));
		writer = new BufferedWriter(new OutputStreamWriter(out));
		
		// ��ȭ���� ������ ����
		writer.write(nick + "\n");
		writer.flush();
		
		MsgReadThread t = new MsgReadThread();	// ���� �޽��� �д� ������
		t.start();	// ���� �޽��� �б� ����
		
		while (true) {
			// Ű����κ��� ������ �б�
			String inputData = scanner.nextLine();
			// ��Ʈ��ũ ������ ���� ������ ������
			writer.write(inputData + "\n");
			writer.flush();
		}
	}
	
}
















