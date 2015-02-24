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
			// 원본 파일에 대한 FileInputStream 객체 생성
			in = new FileInputStream("D:\\java-am\\a.txt");
			
			// 사본 파일에 대한 FileOutputStream 객체 생성
			out = new FileOutputStream("D:\\java-am\\b.txt");
			
			// UpperCaseInputStream으로 FileInputStream을 장식(decorate)
			// 소문자 -> 대문자 변환 기능을 추가시킴
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
