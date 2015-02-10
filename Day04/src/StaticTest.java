
public class StaticTest {
	
	public static void main(String[] args) {
		
		A a1, a2;
		System.out.println(A.si);
//		System.out.println(A.i);	// 사용 불가
		a1 = new A();
		a1.si++;
		a1.i++;
		
		a2 = new A();
		System.out.println(a2.si);
		System.out.println(a2.i);
		
		
		
	}
	
}
