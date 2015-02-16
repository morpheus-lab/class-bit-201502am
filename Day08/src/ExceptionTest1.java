

public class ExceptionTest1 {
	
	public void m(int i) {
		int j = 99 / i;
		System.out.println("99�� " + i + "�� ���� ���� " + j);
	}
	
	public static void main(String[] args) { // args = {"hello"}
		
		int i = 1;
		
		try {
			
			i = Integer.parseInt(args[0]);
			// �߻��� �� �ִ� ����
			// (1) args�� �� �迭�� ���, ArrayIndexOutOfBoundsException �߻�
			// (2) args[0]�� ���ڰ� �ƴ� ���ڿ��� ��� �ִ� ���, NumberFormatException �߻�
			
			ExceptionTest1 t = new ExceptionTest1();
			
			t.m(i);
			// �߻��� �� �ִ� ���� - i�� 0�� ���, ArithmeticException �߻�
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("���α׷� �Ű������� �Է��ϼ���.");
			
		} catch (NumberFormatException e) {
			
			System.out.println("�ùٸ� ���� ������ ���α׷� �Ű������� �Է��ϼ���.");
			
		} catch (ArithmeticException e) {
			
			System.out.println("ArithmeticException �߻�! " + e.getMessage());
			
		}
		
		System.out.println("main �޼ҵ� ��~!");
		
	}
	
}
