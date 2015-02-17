package systemapis;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);		// 10�̶�� int�� �����͸� ���� Integer ��ü
		Character c = new Character('c');	// 'c'��� char�� �����͸� ���� Character ��ü
		Float f = new Float(3.14f);			// 3.14f��� float�� �����͸� ���� Float ��ü
		Boolean b = new Boolean(true);		// true��� boolean�� �����͸� ���� Boolean ��ü
		
		// ���ڿ� �����ͷ� Wrapper ��ü�� ����� ����� �Բ� ����
		Integer i2 = new Integer("100");	// "100" -> 100 �ٲٰ�, �� �����͸� ���� Integer ��ü
		Double d = new Double("3.14");
		Boolean b2 = new Boolean("true");
		
		System.out.println("----------------------------------------");
		
		System.out.println(Character.toLowerCase('A'));
		char ch = '4';
		if (Character.isDigit(ch)) {	// ch�� ���� �����̸� (0-9�� �ش��ϴ� ���ڶ�� true)
			System.out.println(Character.getNumericValue(ch));	// char�� �����͸� int�� �����ͷ� ��ȯ
		}
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("10", 16));	// "10"�̶�� ���ڸ� 16������ �м�, int�� ��ȯ
		System.out.println(Integer.toBinaryString(28));	// 28�̶�� �����͸� 2���� ���ڿ��� ��ȯ
		System.out.println(Integer.bitCount(28));		// 28�̶�� ������ 2������ ��ȯ���� ��, 1�� ����
		System.out.println(Integer.toHexString(28));	// 28�̶�� ������ 16���� ���ڿ��� ��ȯ
		
	}
	
}
