
public class A {
	
	static int si;
	
	int i;
	
	void m() {
		System.out.println("�ν��Ͻ� �޼ҵ� ����!!");
		System.out.println(si);
		System.out.println(i);
		System.out.println(this.si);
		System.out.println(this.i);
	}
	
	static void sm() {
		System.out.println("����ƽ �޼ҵ� ����!!");
		System.out.println(si);
//		System.out.println(i);			// i�� �ν��Ͻ� ����
//		System.out.println(this.si);	// this Ű����
//		System.out.println(this.i);		// this Ű���� �� i�� �ν��Ͻ� ����
	}
	
}
