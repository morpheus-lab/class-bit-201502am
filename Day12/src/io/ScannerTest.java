package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		File f = new File("D:\\java-am\\pb.txt");	// D:\java-am\pb.txt ���Ͽ� ���� ������ ���� ��ü
//		System.out.println("canRead()     = " + f.canRead());		// �б� ����
//		System.out.println("length()      = " + f.length());		// ���� ũ�� (����Ʈ ����)
//		System.out.println("isFile()      = " + f.isFile());		// ��������?
//		System.out.println("isDirectory() = " + f.isDirectory());	// ���丮(����)����?
//		System.out.println("exists()      = " + f.exists());		// �� ������ �����ϴ���?
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
			
			while (sc.hasNext()) {
				// ���Ϸκ��� ������ �о
				String name = sc.next();	// ���� �����ھ�(�⺻ ������: ' ', '\t', '\r', '\n')���� ����
				String tel = sc.next();
				
				// ȭ�鿡 ���
				System.out.println(name + " - " + tel);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();	// �ݵ�� Scanner ��ü�� close()�ϵ���
			}
		}
	}
	
}
