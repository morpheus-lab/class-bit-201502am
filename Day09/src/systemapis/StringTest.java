package systemapis;

public class StringTest {
	
	public static void main(String[] args) {
		
		char letter;
		letter = 'A';
		System.out.println(letter);
		System.out.println((int) letter);	// char 타입을 정수로 형변환하면,
											// 그 문자의 코드가 됨
		letter = 'B';
		System.out.println(letter);
		System.out.println((int) letter);
		
		letter = 'a';
		System.out.println(letter);
		System.out.println((int) letter);
		
		letter = '가';
		System.out.println(letter);
		System.out.println((int) letter);
		
		letter = '\'';
		
		char[] str;
		
		String hello = "Hello Java!  \'     \"    \\";
		String lineFeed = "\r\n";	// 줄바꿈 (윈도우즈)
		String unixLineFeed = "\n";	// 줄바꿈 (유닉스/리눅스)
		
		// 자바에서는 "\n" 하나만 써주면 각 OS에 맞게 알아서 맞춰줌
		
		System.out.println(hello);
		
		
		String hi = "Hello\r\nWORLD!!!";
		System.out.println(hi);
	}
	
}





















