package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputTest {
	
	public static void main(String[] args) {
		
		try {
			
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("아침에 먹은 계란 개수: ");
			String morningEggs = kb.readLine();
			System.out.println("아침에 계란을 " + morningEggs + "개 드셨군요.");
			System.out.println();
			
			System.out.print("점심에 먹은 계란 개수: ");
			String lunchEggs = kb.readLine();
			System.out.println("점심에 계란을 " + lunchEggs + "개 드셨군요.");
			System.out.println();
			
			System.out.print("저녁에 먹은 계란 개수: ");
			String dinnerEggs = kb.readLine();
			System.out.println("저녁에 계란을 " + dinnerEggs + "개 드셨군요.");
			System.out.println();
			
			// 문자 -> 숫자로 파싱해야하는데.. 어떻게???
//			int i = Integer.parseInt("1");
			
			int totalEggs = Integer.parseInt(morningEggs)
					+ Integer.parseInt(lunchEggs)
					+ Integer.parseInt(dinnerEggs);
			
			System.out.println("총 " + totalEggs + "개 드셨군요!!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
