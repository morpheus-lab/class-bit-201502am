package systemapis;

public class ObjectCloneTest {
	
	public static class A implements Cloneable {
		
		int i;
		int[] arr = {1,2,3,4,5};
		B b = new B(30);
		
		// clone() 메소드를 Object로 부터 상속
		// 재정의
		@Override
		public A clone() throws CloneNotSupportedException {
			// Shallow Copy
			// return (A) super.clone();
			
			// Deep Copy
			A clone = (A) super.clone();
			// arr 변수 deep copy
			clone.arr = new int[arr.length];
			// 배열 초기화
			for (int i = 0; i < clone.arr.length; i++) {
				clone.arr[i] = i + 1;
			}
			// b 변수 deep copy
			clone.b = b.clone();
			return clone;
		}
	}
	
	public static class B {
		int a;
		
		public B(int a) {
			this.a = a;
		}
		
		@Override
		protected B clone() throws CloneNotSupportedException {
			return (B) super.clone();
		}
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		// 객체를 복사하기 위해서는 clone() 메소드 호출
		/*
		Object o1 = new Object();
		Object o2 = o1.clone();		// 직접 호출 불가
									// clone()는 protected
		*/
		A a1 = new A();
		a1.i = 10;
		
		A a2 = a1.clone();
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		
		System.out.println(a1.arr);	// a1.arr 변수가 가리키고 있는 배열 객체의 정보
		System.out.println(a2.arr);	// a2.arr 변수가 가리키고 있는 배열 객체의 정보
		
		a1.arr[2] = 77;
		
		System.out.println(a1.arr[2]);
		System.out.println(a2.arr[2]);
		
		a1.i = 1000;
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		
	}
	
}





















