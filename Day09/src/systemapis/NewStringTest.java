package systemapis;

public class NewStringTest {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);	// ���� ��ü�ΰ�?
		
		String s3 = "hello";
		
		System.out.println(s1 == s3);
		
		System.out.println("s3 ���ڿ� ����: " + s3.length());
		
		System.out.println("-----------------------------------------------");
		
		// + �����ڴ� String�� ���ؼ��� �����ε�� ����
		String greet = "Hello";
		String name = "JAVA";
		System.out.println(greet + name + "!");
		System.out.println(greet + " " + name + "!");
		
		System.out.println("-----------------------------------------------");
		
		// equals()	=> ���ڿ��� ���� ��ġ ����
		System.out.println("s1 == s2      : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		
		System.out.println("-----------------------------------------------");
		
		// equalsIgnoreCase()	=> ��ҹ��� ���� ���� ���� ��ġ ����
		s3 = "HEllo";
		System.out.println("s1 == s3                : " + (s1 == s3));
		System.out.println("s1.equals(s3)           : " + s1.equals(s3));
		System.out.println("s1.equalsIgnoreCase(s3) : " + s1.equalsIgnoreCase(s3));
		
		
		System.out.println("-----------------------------------------------");
		
		// compareTo()	=> ���������� �ռ����� �ڼ�����?
		System.out.println(s1.compareTo(s3));	// => 32	=> s1�� s3���� ���������� �ڼ���
		System.out.println(s1.compareTo(s2));	// => 0		=> s1�� s2�� ������ ����
		System.out.println(s3.compareTo(s1));	// => -32	=> s3�� s1���� ���������� �ռ���
		System.out.println(s3.compareTo(s2));	// => -32	=> s3�� s2���� ���������� �ռ���
		
		System.out.println("-----------------------------------------------");
		
		// regionMatches()
		System.out.println(s1.regionMatches(true, 0, s3, 2, 2));
		
		String s4 = "Hello World!";
		String s5 = "Hi word";
		System.out.println(s4.regionMatches(true, 6, s5, 3, 3));	// s4�� "Wor" vs. s5�� "wor"
		
		System.out.println("-----------------------------------------------");
		
		String s6 = "hello JAVA";
		System.out.println(s6.substring(3, 7));	// 3�� �ε��� ���� (7 - 1) �ε��� ����
		System.out.println(s6.substring(3));	// 3�� �ε��� ���� ������
		
		System.out.println("-----------------------------------------------");
		
		String s7 = "            	id       ashlgia    \r\n  ";
		s7 = s7.trim();	// ���ڿ� ��/�ڿ� �ִ� ���鹮�� ����
		System.out.println("[" + s7 + "]");
		
		System.out.println("-----------------------------------------------");
		// toUpperCase()	=> ��� ���ڸ� �빮�ڷ�
		// toLowerCase()	=> ��� ���ڸ� �ҹ��ڷ�
		String s8 = s1.toUpperCase();	// "hello".toUpperCase()
		System.out.println(s8);
		
		s8 = s8.toLowerCase();
		System.out.println(s8);
		
		// s.equalsIgnoreCase(another) => s.toUpperCase().equals(another.toUpperCase())
		//							   => s.toLowerCase().equals(another.toLowerCase())
		
		System.out.println("-----------------------------------------------");
		// concat()	=> concatenate (�罽ó�� �մ�), + �����ڿ� ������ ���
		s8 = s8.concat("!").concat(" adgagas");
		System.out.println(s8);
		
		System.out.println("-----------------------------------------------");
		// indexOf()
		s8 = "hello JAVA";
		s8.indexOf("");
		
	}
	
}



















