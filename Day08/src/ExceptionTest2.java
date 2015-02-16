import java.io.IOException;


public class ExceptionTest2 {
	
	static void m(int i) throws Exception {
		
		i ++;
//		try {
			throw new Exception();	// 예외 객체를 만들어서 던진다(알린다)
//		} catch(Exception e) {
//			// 예외 처리
//		}
		
	}
	
	static int calc(int a, int b) throws IOException, Exception {
		if (b == 0) {
			throw new Exception("b가 0");
		}
		if (a == 0) {
			throw new IOException();
		}
		return a / b;
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			m(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
