package systemapis;

public class ObjectCloneTest {
	
	public static class A implements Cloneable {
		
		int i;
		int[] arr = {1,2,3,4,5};
		B b = new B(30);
		
		// clone() �޼ҵ带 Object�� ���� ���
		// ������
		@Override
		public A clone() throws CloneNotSupportedException {
			// Shallow Copy
			// return (A) super.clone();
			
			// Deep Copy
			A clone = (A) super.clone();
			// arr ���� deep copy
			clone.arr = new int[arr.length];
			// �迭 �ʱ�ȭ
			for (int i = 0; i < clone.arr.length; i++) {
				clone.arr[i] = i + 1;
			}
			// b ���� deep copy
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
		
		// ��ü�� �����ϱ� ���ؼ��� clone() �޼ҵ� ȣ��
		/*
		Object o1 = new Object();
		Object o2 = o1.clone();		// ���� ȣ�� �Ұ�
									// clone()�� protected
		*/
		A a1 = new A();
		a1.i = 10;
		
		A a2 = a1.clone();
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		
		System.out.println(a1.arr);	// a1.arr ������ ����Ű�� �ִ� �迭 ��ü�� ����
		System.out.println(a2.arr);	// a2.arr ������ ����Ű�� �ִ� �迭 ��ü�� ����
		
		a1.arr[2] = 77;
		
		System.out.println(a1.arr[2]);
		System.out.println(a2.arr[2]);
		
		a1.i = 1000;
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		
	}
	
}





















