package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest1 {
	
	public static void main(String[] args) {
		
		// 파일 복사 예제
		
		InputStream in = null;		// 추상클래스 - 스타벅스 예제의 Beverage에 해당
		OutputStream out = null;	// 추상클래스 - 스타벅스 예제의 Beverage에 해당
		
		try {
			in = new FileInputStream("D:\\java-am\\IOTest1.txt");// 스타벅스 예제의 Espresso에 해당
											// FileNotFoundException을 발생 시킬 수 있음
			out = new FileOutputStream("D:\\java-am\\output.txt");
			
			// BufferedInputStream 적용
			in = new BufferedInputStream(in);	// FileInputStream 객체(기존 in)에 버퍼 기능을 추가
			// BufferedOutputStream 적용
			out = new BufferedOutputStream(out);	// FileOutputStream 객체(기존 out)에 버퍼 기능을 추가
			
			long startTime = System.currentTimeMillis();
			
			int data = 0;
			while ((data = in.read()) != -1) {	// in.read()는 EOF에 다다르면 -1을 리턴해서 while문을 빠져 나감
//				int data = in.read();	// IOTest1.txt로부터 1바이트 읽어서
				out.write(data);		// 그 읽은 1바이트를 output.txt로 쓰기
			}
			
			long endTime = System.currentTimeMillis();
			
			System.out.println("소요시간: " + (endTime - startTime) + " ms");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();	// 입력 스트림 닫기
				} catch (Exception e) {}
			}
			if (out != null) {
				try {
					out.close();	// 출력 스트림 닫기
				} catch (Exception e) {}
			}
		}
		
	}
	
}
