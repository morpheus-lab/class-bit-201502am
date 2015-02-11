
public class A {
	
	static int si;
	
	int i;
	
	void m() {
		System.out.println("인스턴스 메소드 실행!!");
		System.out.println(si);
		System.out.println(i);
		System.out.println(this.si);
		System.out.println(this.i);
	}
	
	static void sm() {
		System.out.println("스태틱 메소드 실행!!");
		System.out.println(si);
//		System.out.println(i);			// i가 인스턴스 변수
//		System.out.println(this.si);	// this 키워드
//		System.out.println(this.i);		// this 키워드 및 i가 인스턴스 변수
	}
	
}
