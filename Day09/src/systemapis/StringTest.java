package systemapis;

public class StringTest {
	
	public static void main(String[] args) {
		
		char letter;
		letter = 'A';
		System.out.println(letter);
		System.out.println((int) letter);	// char Ÿ���� ������ ����ȯ�ϸ�,
											// �� ������ �ڵ尡 ��
		letter = 'B';
		System.out.println(letter);
		System.out.println((int) letter);
		
		letter = 'a';
		System.out.println(letter);
		System.out.println((int) letter);
		
		letter = '��';
		System.out.println(letter);
		System.out.println((int) letter);
		
		letter = '\'';
		
		char[] str;
		
		String hello = "Hello Java!  \'     \"    \\";
		String lineFeed = "\r\n";	// �ٹٲ� (��������)
		String unixLineFeed = "\n";	// �ٹٲ� (���н�/������)
		
		// �ڹٿ����� "\n" �ϳ��� ���ָ� �� OS�� �°� �˾Ƽ� ������
		
		System.out.println(hello);
		
		
		String hi = "Hello\r\nWORLD!!!";
		System.out.println(hi);
	}
	
}





















