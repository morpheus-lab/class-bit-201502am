package systemapis;

public class StringExercise {
	
	public static void main(String[] args) {
		
		// 1) "aBcAbCabcABC" ���ڿ� String ��ü�� ����
		String s = "aBcAbCabcABC";
//		String s = new String("aBcAbCabcABC");
		
		// 2) 3��° ���ڸ� ���
		System.out.println(s.charAt(2));
		
		// 3) "abc" ���ڿ��� ó������ ��Ÿ���� �ε����� ���
		System.out.println(s.indexOf("abc"));
		
		// 4) �� ���ڿ��� ���� ������ ���
		System.out.println(s.length());
		
		// 5) 'a'�� 'R'�� ��ü�� ����� ���
		System.out.println(s.replace('a', 'R'));
		
		// 6) "abc" ���ڿ��� "123" ���ڿ��� ��ü�� ����� ���
		System.out.println(s.replace("abc", "123"));
		
		// 7) ó�� 3���� ���ڿ����� ���
		System.out.println(s.substring(0, 3));
		
		// 8) ���ڿ��� ��� �빮�ڷ� �����Ͽ� ���
		System.out.println(s.toUpperCase());
		
		System.out.println("-----------------------------");
		
		String fruits = "apple,mango,orange,strawberry";
		String[] splited = fruits.split("an");	// ������ ���ڿ��� ���ڿ��� �ڸ�
		for (int i = 0; i < splited.length; i++) {
			System.out.println(splited[i]);
		}
	}
	
}






























