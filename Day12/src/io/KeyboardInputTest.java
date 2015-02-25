package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputTest {
	
	public static void main(String[] args) {
		
		try {
			
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("��ħ�� ���� ��� ����: ");
			String morningEggs = kb.readLine();
			System.out.println("��ħ�� ����� " + morningEggs + "�� ��̱���.");
			System.out.println();
			
			System.out.print("���ɿ� ���� ��� ����: ");
			String lunchEggs = kb.readLine();
			System.out.println("���ɿ� ����� " + lunchEggs + "�� ��̱���.");
			System.out.println();
			
			System.out.print("���ῡ ���� ��� ����: ");
			String dinnerEggs = kb.readLine();
			System.out.println("���ῡ ����� " + dinnerEggs + "�� ��̱���.");
			System.out.println();
			
			// ���� -> ���ڷ� �Ľ��ؾ��ϴµ�.. ���???
//			int i = Integer.parseInt("1");
			
			int totalEggs = Integer.parseInt(morningEggs)
					+ Integer.parseInt(lunchEggs)
					+ Integer.parseInt(dinnerEggs);
			
			System.out.println("�� " + totalEggs + "�� ��̱���!!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
