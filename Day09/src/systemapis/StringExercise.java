package systemapis;

public class StringExercise {
	
	public static void main(String[] args) {
		
		// 1) "aBcAbCabcABC" 문자열 String 객체를 생성
		String s = "aBcAbCabcABC";
//		String s = new String("aBcAbCabcABC");
		
		// 2) 3번째 문자를 출력
		System.out.println(s.charAt(2));
		
		// 3) "abc" 문자열이 처음으로 나타나는 인덱스를 출력
		System.out.println(s.indexOf("abc"));
		
		// 4) 위 문자열의 문자 개수를 출력
		System.out.println(s.length());
		
		// 5) 'a'를 'R'로 대체한 결과를 출력
		System.out.println(s.replace('a', 'R'));
		
		// 6) "abc" 문자열을 "123" 문자열로 대체한 결과를 출력
		System.out.println(s.replace("abc", "123"));
		
		// 7) 처음 3개의 문자열만을 출력
		System.out.println(s.substring(0, 3));
		
		// 8) 문자열을 모두 대문자로 변경하여 출력
		System.out.println(s.toUpperCase());
		
		System.out.println("-----------------------------");
		
		String fruits = "apple,mango,orange,strawberry";
		String[] splited = fruits.split("an");	// 지정된 문자열로 문자열을 자름
		for (int i = 0; i < splited.length; i++) {
			System.out.println(splited[i]);
		}
	}
	
}






























