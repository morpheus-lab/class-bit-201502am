
public class MethodTest {
	
	// �޼ҵ�1
	void m1() {	// �̸�: m1, ��ȯ������Ÿ��: void
		// �ϴ� ��
		System.out.println("���� m1 �޼ҵ�~ ��պ��");
	}
	
	// �޼ҵ�2
	int m2() {	// �̸�: m2, ��ȯ������Ÿ��: int
		// �ϴ� ��
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100���� ���� �Ϸ�");
		return sum;
	}
	
	int m3(int n) {	// ��ȯ������Ÿ��: int
					// �̸�: m3
					// �Ķ����: (1) int�� n
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1~" + n + "���� ���� �Ϸ�");
		return sum;
	}
	
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		mt.m1();	// m1 �޼ҵ� ȣ��
		
		int a = mt.m2();	// m2 �޼ҵ� ȣ��
		
		System.out.println(a);
		
		int b = mt.m3(50);	// m3 �޼ҵ� ȣ��
		
		System.out.println(b);
		
	}
	
}
