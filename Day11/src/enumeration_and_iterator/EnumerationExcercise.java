package enumeration_and_iterator;

import java.util.*;

public class EnumerationExcercise {
	
	public static void main(String[] args) {
		
		Hashtable<String, Double> scoreTable = new Hashtable<String, Double>();
		
		// 데이터 저장
		scoreTable.put("홍길동",	new Double(76.5));
		scoreTable.put("심청",		new Double(83.7));
		scoreTable.put("뺑덕",		new Double(80.0));
		scoreTable.put("이몽룡",	new Double(95.6));
		scoreTable.put("성춘향",	new Double(80.2));
		
		double sum = 0.0;	// 점수합계용 변수
		int count = 0;		// 데이터 개수 카운트용 변수
		
		// key에 대한 Enumeration 객체
		Enumeration<String> keys = scoreTable.keys();
		while (keys.hasMoreElements()) {
			String name = keys.nextElement();
			Double score = scoreTable.get(name);
			
			System.out.println(name + ": " + score);
			
			sum += score;
			count ++;
		}
		
		System.out.println("===========================");
		
//		System.out.println("점수합계: " + sum);
//		System.out.println("평균점수: " + (sum / count));
		
		System.out.printf("점수합계: %.2f\n", sum);
		System.out.println(String.format("평균점수: %.2f", (sum / count)));
		
	}
	
}
