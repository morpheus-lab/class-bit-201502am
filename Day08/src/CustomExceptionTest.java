
public class CustomExceptionTest {
	
	public static class MyException extends Exception {
		public MyException() {
			super();
		}
		
		public MyException(String message) {
			super(message);
		}
	}
	
	static void m(String s) throws MyException {
		if (s.equals("�ȳ�")) {
			throw new MyException("��������");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			m("�ȳ�");
		} catch (MyException e) {
			System.out.println("���� �߻�: " + e.getMessage());
		}
		
	}
	
}
