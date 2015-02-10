
public class MethodTest {
	
	// 메소드1
	void m1() {	// 이름: m1, 반환데이터타입: void
		// 하는 일
		System.out.println("나는 m1 메소드~ 빈둥빈둥");
	}
	
	// 메소드2
	int m2() {	// 이름: m2, 반환데이터타입: int
		// 하는 일
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지 덧셈 완료");
		return sum;
	}
	
	int m3(int n) {	// 반환데이터타입: int
					// 이름: m3
					// 파라미터: (1) int형 n
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1~" + n + "까지 덧셈 완료");
		return sum;
	}
	
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		mt.m1();	// m1 메소드 호출
		
		int a = mt.m2();	// m2 메소드 호출
		
		System.out.println(a);
		
		int b = mt.m3(50);	// m3 메소드 호출
		
		System.out.println(b);
		
	}
	
}
