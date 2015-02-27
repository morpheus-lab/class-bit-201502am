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
		
		// ���� ������ �����ϴ� Socket ��ü ����
		Socket sock = new Socket("121.138.83.1", 3000);
		
		// ���� ����
		System.out.println("���ӵ�");
		
		InputStream in = sock.getInputStream();	// ������ OutputStream�� ����
		OutputStream out = sock.getOutputStream();	// ������ InputStream�� ����
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		//                     (    ���۱���߰�  ( in�� ����ó����� �߰� ))
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
		//                     (    ���۱���߰�  ( out�� ����ó����� �߰� ))
		
		System.out.println("������ �ۼ��� �غ� �Ϸ�");
		
		// Ű���� �Է� �б��
		Scanner scanner = new Scanner(System.in);
		
		// ȭ�� ��¿�
//		System.out;
		
		while (true) {
			// Ű����κ��� ������ �б�
			String inputData = scanner.nextLine();
			// ��Ʈ��ũ ������ ���� ������ ������
			writer.write(inputData + "\n");
			writer.flush();
			// �ǵ��ƿ��� �����͸� �б�
			String returnData = reader.readLine();
			// ȭ�鿡 ���
			System.out.println(">>> " + returnData);
		}
	}
	
}
















