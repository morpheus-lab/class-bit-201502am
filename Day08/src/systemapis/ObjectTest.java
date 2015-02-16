package systemapis;

public class ObjectTest {
	
	public static class B {
		int i;
		public B() {}
		public B(int i) { this.i = i; }
		
		// toString() => Object로부터 상속
		// equals() => Object로부터 상속
		
		@Override
		public String toString() {	// 객체의 간단한 정보를 출력하는 용도
			return String.valueOf(i);	// i + ""
		}
		
		@Override
		public boolean equals(Object obj) {	// 각종 API에서 두 객체의 동일성을 테스트하는데 사용됨
			if (!(obj instanceof B)) {
				return false;
			}
			return (this.i == ((B) obj).i);
		}
	}
	
	public static void print(Object o) {
		System.out.println(o);	// o.toString()이 출력됨
	}
	
	public static void equalsTest(Object o1, Object o2) {
		System.out.println(o1 == o2);	// 참조값을 "==" 연산자로 비교
		System.out.println(o1.equals(o2));	// equals() 메소드로 비교
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
