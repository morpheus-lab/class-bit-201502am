
public class StaticMethodTest {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.sm();
		a1.m();
		
		A.sm();
		// A.m();	// m()�� static�� �ƴ϶� Ŭ���� �̸����� ���� �Ұ�
		
		A a2 = new A();
		a2.m();
		
	}
	
}
