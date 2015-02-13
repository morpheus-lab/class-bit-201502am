package inheritance.constructor;

public class D extends C {
	
	public D() {
		this(1);	// 얘가 super 생성자 호출 -> 따라서, super()와 this() 같이 못씀
		System.out.println("D 기본 생성자");
	}
	
	public D(int i) {
		super(i);
		System.out.println("D 생성자 (2)");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		System.out.println("--------------------");
		
		D d = new D();
		
	}
	
}
