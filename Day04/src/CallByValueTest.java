
public class CallByValueTest {
	
	public static void m() {}
	
	public static void m(int i) {
		i = 99;	// m �޼ҵ��� �������� i�� ���� 99�� ����
	}
	
	public static void m(int[] arr) {
		arr[0] = 99;	// m �޼ҵ��� �������� arr�� ����Ű�� �迭��
						// 0�� �ε����� ���� 99�� ����
	}
	
	public static void main(String[] args) {
		
		m();
		
		int i = 10;
		m(i);	// i ������ ���� �ִ� "��(���� ��)"�� �޼ҵ� m�� ����
		System.out.println(i);
		
		int[] arr = {10, 20, 30};
		m(arr);	// arr ������ ���� �ִ� "��(������)"�� �޼ҵ� m�� ����
		System.out.println(arr[0]);
		
	}
	
}
