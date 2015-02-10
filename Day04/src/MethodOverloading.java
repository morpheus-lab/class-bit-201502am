
public class MethodOverloading {
	// �޼ҵ� ���� ����: �����ε�(overloading)
	
	static void f(char c) {
		System.out.println("f(char) ȣ���!");
	}
	
	static void f(short i) {
		System.out.println("f(short) ȣ���!");
	}
	
	static void f(int i) {
		System.out.println("f(int) ȣ���!");
	}
	
	static void f(int i, int j) {
		System.out.println("f(int, int) ȣ���!");
	}
	
	static void f(int i, String s) {
		System.out.println("f(int, String) ȣ���!");
	}
	
	static void f(double l) {
		System.out.println("f(double) ȣ���!");
	}
	
	public static void main(String[] args) {
		
		f('c');
		
		byte b = 2;
		f(b);
		
		short s = 3;
		f(s);
		
		int i = 5;
		f(i);
		
		long l = 500L;
		f(l);
		
		f(2.0);
		
		f(3, 4);
		
		f(5, "hello");
		
	}
	
}













