package systemapis;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	
	public static void main(String[] args) {
		
		String s = "Now is the time for all good men (and women)...";
		
//		StringTokenizer t = new StringTokenizer(s);
		StringTokenizer t = new StringTokenizer(s, "al ");	// �ι�° ����: ������
		// String.split("al") => "al" ���ڿ� ��ü�� �����ڷ� ó��
		// new StringTokenizer(s, "al") => 'a' �Ǵ� 'l'�� �����ڷ� ó��
		
		while (t.hasMoreTokens()) {	// ���� Ŀ�� ��ġ �ڿ� ���� ��ū�� �����ֳ�?
			String token = t.nextToken();
			System.out.println(token);
		}
		
	}
	
}
