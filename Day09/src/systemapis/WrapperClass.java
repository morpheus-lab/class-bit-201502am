package systemapis;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);		// 10이라는 int형 데이터를 갖는 Integer 객체
		Character c = new Character('c');	// 'c'라는 char형 데이터를 갖는 Character 객체
		Float f = new Float(3.14f);			// 3.14f라는 float형 데이터를 갖는 Float 객체
		Boolean b = new Boolean(true);		// true라는 boolean형 데이터를 갖는 Boolean 객체
		
		// 문자열 데이터로 Wrapper 객체를 만드는 방법도 함께 제공
		Integer i2 = new Integer("100");	// "100" -> 100 바꾸고, 그 데이터를 갖는 Integer 객체
		Double d = new Double("3.14");
		Boolean b2 = new Boolean("true");
		
		System.out.println("----------------------------------------");
		
		System.out.println(Character.toLowerCase('A'));
		char ch = '4';
		if (Character.isDigit(ch)) {	// ch가 숫자 문자이면 (0-9에 해당하는 문자라면 true)
			System.out.println(Character.getNumericValue(ch));	// char형 데이터를 int형 데이터로 변환
		}
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("10", 16));	// "10"이라는 숫자를 16진수로 분석, int로 변환
		System.out.println(Integer.toBinaryString(28));	// 28이라는 데이터를 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28));		// 28이라는 정수를 2진수로 변환했을 때, 1의 개수
		System.out.println(Integer.toHexString(28));	// 28이라는 정수를 16진수 문자열로 변환
		
	}
	
}
