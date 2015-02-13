package inheritance.constructor;

public class D extends C {
	
	public D() {
		this(1);	// �갡 super ������ ȣ�� -> ����, super()�� this() ���� ����
		System.out.println("D �⺻ ������");
	}
	
	public D(int i) {
		super(i);
		System.out.println("D ������ (2)");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		System.out.println("--------------------");
		
		D d = new D();
		
	}
	
}
