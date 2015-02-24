package enumeration_and_iterator;

import java.util.*;

public class EnumerationExcercise {
	
	public static void main(String[] args) {
		
		Hashtable<String, Double> scoreTable = new Hashtable<String, Double>();
		
		// ������ ����
		scoreTable.put("ȫ�浿",	new Double(76.5));
		scoreTable.put("��û",		new Double(83.7));
		scoreTable.put("����",		new Double(80.0));
		scoreTable.put("�̸���",	new Double(95.6));
		scoreTable.put("������",	new Double(80.2));
		
		double sum = 0.0;	// �����հ�� ����
		int count = 0;		// ������ ���� ī��Ʈ�� ����
		
		// key�� ���� Enumeration ��ü
		Enumeration<String> keys = scoreTable.keys();
		while (keys.hasMoreElements()) {
			String name = keys.nextElement();
			Double score = scoreTable.get(name);
			
			System.out.println(name + ": " + score);
			
			sum += score;
			count ++;
		}
		
		System.out.println("===========================");
		
//		System.out.println("�����հ�: " + sum);
//		System.out.println("�������: " + (sum / count));
		
		System.out.printf("�����հ�: %.2f\n", sum);
		System.out.println(String.format("�������: %.2f", (sum / count)));
		
	}
	
}
