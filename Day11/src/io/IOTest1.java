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
		
		// ���� ���� ����
		
		InputStream in = null;		// �߻�Ŭ���� - ��Ÿ���� ������ Beverage�� �ش�
		OutputStream out = null;	// �߻�Ŭ���� - ��Ÿ���� ������ Beverage�� �ش�
		
		try {
			in = new FileInputStream("D:\\java-am\\IOTest1.txt");// ��Ÿ���� ������ Espresso�� �ش�
											// FileNotFoundException�� �߻� ��ų �� ����
			out = new FileOutputStream("D:\\java-am\\output.txt");
			
			// BufferedInputStream ����
			in = new BufferedInputStream(in);	// FileInputStream ��ü(���� in)�� ���� ����� �߰�
			// BufferedOutputStream ����
			out = new BufferedOutputStream(out);	// FileOutputStream ��ü(���� out)�� ���� ����� �߰�
			
			long startTime = System.currentTimeMillis();
			
			int data = 0;
			while ((data = in.read()) != -1) {	// in.read()�� EOF�� �ٴٸ��� -1�� �����ؼ� while���� ���� ����
//				int data = in.read();	// IOTest1.txt�κ��� 1����Ʈ �о
				out.write(data);		// �� ���� 1����Ʈ�� output.txt�� ����
			}
			
			long endTime = System.currentTimeMillis();
			
			System.out.println("�ҿ�ð�: " + (endTime - startTime) + " ms");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();	// �Է� ��Ʈ�� �ݱ�
				} catch (Exception e) {}
			}
			if (out != null) {
				try {
					out.close();	// ��� ��Ʈ�� �ݱ�
				} catch (Exception e) {}
			}
		}
		
	}
	
}
