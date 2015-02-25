package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBookMain {
	
	public static void main(String[] args) throws IOException {
		
		// 키보드로 부터 입력 받을 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 파일에 데이터를 기록할 스트림 객체 생성
		FileWriter writer = new FileWriter("D:\\java-am\\pb.txt");
		
		for (int i = 0; i < 3; i++) {
			// 사용자로부터 입력 받음
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("전화번호: ");
			String tel = sc.nextLine();
			writer.write(name + "\t" + tel + "\r\n");	// 홍길동<TAB>12345667<줄바꿈>
		}
		
		writer.close();
		sc.close();
		
	}
	
}
