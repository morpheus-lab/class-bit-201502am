package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class UpperCaseInputStreamTest {
	
	public static void main(String[] args) {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			// ���� ���Ͽ� ���� FileInputStream ��ü ����
			in = new FileInputStream("D:\\java-am\\a.txt");
			
			// �纻 ���Ͽ� ���� FileOutputStream ��ü ����
			out = new FileOutputStream("D:\\java-am\\b.txt");
			
			// UpperCaseInputStream���� FileInputStream�� ���(decorate)
			// �ҹ��� -> �빮�� ��ȯ ����� �߰���Ŵ
			in = new UpperCaseInputStream(in);
			
			int d = 0;
			while ((d = in.read()) != -1) {
				out.write(d);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {}
			}
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {}
			}
		}
		
	}
	
}
