
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
		if (s.equals("¾È³ç")) {
			throw new MyException("¹ö¸©¾øÀ½");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			m("¾È³ç");
		} catch (MyException e) {
			System.out.println("¿¹¿Ü ¹ß»ý: " + e.getMessage());
		}
		
	}
	
}
