package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		File f = new File("D:\\java-am\\pb.txt");	// D:\java-am\pb.txt 파일에 대한 정보를 갖는 객체
//		System.out.println("canRead()     = " + f.canRead());		// 읽기 권한
//		System.out.println("length()      = " + f.length());		// 파일 크기 (바이트 단위)
//		System.out.println("isFile()      = " + f.isFile());		// 파일인지?
//		System.out.println("isDirectory() = " + f.isDirectory());	// 디렉토리(폴더)인지?
//		System.out.println("exists()      = " + f.exists());		// 이 파일이 존재하는지?
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
			
			while (sc.hasNext()) {
				// 파일로부터 데이터 읽어서
				String name = sc.next();	// 다음 구분자앞(기본 구분자: ' ', '\t', '\r', '\n')까지 읽음
				String tel = sc.next();
				
				// 화면에 출력
				System.out.println(name + " - " + tel);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();	// 반드시 Scanner 객체를 close()하도록
			}
		}
	}
	
}
