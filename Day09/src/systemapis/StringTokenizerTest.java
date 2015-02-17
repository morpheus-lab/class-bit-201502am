package systemapis;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	
	public static void main(String[] args) {
		
		String s = "Now is the time for all good men (and women)...";
		
//		StringTokenizer t = new StringTokenizer(s);
		StringTokenizer t = new StringTokenizer(s, "al ");	// 두번째 인자: 구분자
		// String.split("al") => "al" 문자열 전체를 구분자로 처리
		// new StringTokenizer(s, "al") => 'a' 또는 'l'을 구분자로 처리
		
		while (t.hasMoreTokens()) {	// 현재 커서 위치 뒤에 읽을 토큰이 남아있나?
			String token = t.nextToken();
			System.out.println(token);
		}
		
	}
	
}
