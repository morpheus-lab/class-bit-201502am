package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBookMain {
	
	public static void main(String[] args) throws IOException {
		
		// Ű����� ���� �Է� ���� Scanner ��ü ����
		Scanner sc = new Scanner(System.in);
		
		// ���Ͽ� �����͸� ����� ��Ʈ�� ��ü ����
		FileWriter writer = new FileWriter("D:\\java-am\\pb.txt");
		
		for (int i = 0; i < 3; i++) {
			// ����ڷκ��� �Է� ����
			System.out.print("�̸�: ");
			String name = sc.nextLine();
			System.out.print("��ȭ��ȣ: ");
			String tel = sc.nextLine();
			writer.write(name + "\t" + tel + "\r\n");	// ȫ�浿<TAB>12345667<�ٹٲ�>
		}
		
		writer.close();
		sc.close();
		
	}
	
}
