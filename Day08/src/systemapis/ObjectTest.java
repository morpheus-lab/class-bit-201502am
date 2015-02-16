package systemapis;

public class ObjectTest {
	
	public static class B {
		int i;
		public B() {}
		public B(int i) { this.i = i; }
		
		// toString() => Object�κ��� ���
		// equals() => Object�κ��� ���
		
		@Override
		public String toString() {	// ��ü�� ������ ������ ����ϴ� �뵵
			return String.valueOf(i);	// i + ""
		}
		
		@Override
		public boolean equals(Object obj) {	// ���� API���� �� ��ü�� ���ϼ��� �׽�Ʈ�ϴµ� ����
			if (!(obj instanceof B)) {
				return false;
			}
			return (this.i == ((B) obj).i);
		}
	}
	
	public static void print(Object o) {
		System.out.println(o);	// o.toString()�� ��µ�
	}
	
	public static void equalsTest(Object o1, Object o2) {
		System.out.println(o1 == o2);	// �������� "==" �����ڷ� ��
		System.out.println(o1.equals(o2));	// equals() �޼ҵ�� ��
	}
	
	public static void main(String[] args) {
		
		B b1 = new B(10);	B b2 = new B(10);
		Object o1 = new Object();	Object o2 = new Object();
		
		print(b1); print(b2); print(o1);
		equalsTest(b1, b2); equalsTest(o1, o2); equalsTest(b1, o1);
		
		o1 = b1;
		
		print(b1); print(b2); print(o1);
		equalsTest(b1, b2); equalsTest(o1, o2); equalsTest(b1, o1);
		
	}
	
}
