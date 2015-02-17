package systemapis;

public class NewStringTest {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);	// 같은 객체인가?
		
		String s3 = "hello";
		
		System.out.println(s1 == s3);
		
		System.out.println("s3 문자열 길이: " + s3.length());
		
		System.out.println("-----------------------------------------------");
		
		// + 연산자는 String에 대해서만 오버로드돼 있음
		String greet = "Hello";
		String name = "JAVA";
		System.out.println(greet + name + "!");
		System.out.println(greet + " " + name + "!");
		
		System.out.println("-----------------------------------------------");
		
		// equals()	=> 문자열의 내용 일치 여부
		System.out.println("s1 == s2      : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		
		System.out.println("-----------------------------------------------");
		
		// equalsIgnoreCase()	=> 대소문자 구분 없이 내용 일치 여부
		s3 = "HEllo";
		System.out.println("s1 == s3                : " + (s1 == s3));
		System.out.println("s1.equals(s3)           : " + s1.equals(s3));
		System.out.println("s1.equalsIgnoreCase(s3) : " + s1.equalsIgnoreCase(s3));
		
		
		System.out.println("-----------------------------------------------");
		
		// compareTo()	=> 사전순서로 앞서는지 뒤서는지?
		System.out.println(s1.compareTo(s3));	// => 32	=> s1이 s3보다 사전순으로 뒤선다
		System.out.println(s1.compareTo(s2));	// => 0		=> s1과 s2의 내용이 같다
		System.out.println(s3.compareTo(s1));	// => -32	=> s3가 s1보다 사전순으로 앞선다
		System.out.println(s3.compareTo(s2));	// => -32	=> s3가 s2보다 사전순으로 앞선다
		
		System.out.println("-----------------------------------------------");
		
		// regionMatches()
		System.out.println(s1.regionMatches(true, 0, s3, 2, 2));
		
		String s4 = "Hello World!";
		String s5 = "Hi word";
		System.out.println(s4.regionMatches(true, 6, s5, 3, 3));	// s4의 "Wor" vs. s5의 "wor"
		
		System.out.println("-----------------------------------------------");
		
		String s6 = "hello JAVA";
		System.out.println(s6.substring(3, 7));	// 3번 인덱스 부터 (7 - 1) 인덱스 까지
		System.out.println(s6.substring(3));	// 3번 인덱스 부터 끝까지
		
		System.out.println("-----------------------------------------------");
		
		String s7 = "            	id       ashlgia    \r\n  ";
		s7 = s7.trim();	// 문자열 앞/뒤에 있는 공백문자 제거
		System.out.println("[" + s7 + "]");
		
		System.out.println("-----------------------------------------------");
		// toUpperCase()	=> 모든 문자를 대문자로
		// toLowerCase()	=> 모든 문자를 소문자로
		String s8 = s1.toUpperCase();	// "hello".toUpperCase()
		System.out.println(s8);
		
		s8 = s8.toLowerCase();
		System.out.println(s8);
		
		// s.equalsIgnoreCase(another) => s.toUpperCase().equals(another.toUpperCase())
		//							   => s.toLowerCase().equals(another.toLowerCase())
		
		System.out.println("-----------------------------------------------");
		// concat()	=> concatenate (사슬처럼 잇다), + 연산자와 동일한 기능
		s8 = s8.concat("!").concat(" adgagas");
		System.out.println(s8);
		
		System.out.println("-----------------------------------------------");
		// indexOf()
		s8 = "hello JAVA";
		s8.indexOf("");
		
	}
	
}



















