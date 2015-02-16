

public class ExceptionTest1 {
	
	public void m(int i) {
		int j = 99 / i;
		System.out.println("99를 " + i + "로 나눈 몫은 " + j);
	}
	
	public static void main(String[] args) { // args = {"hello"}
		
		int i = 1;
		
		try {
			
			i = Integer.parseInt(args[0]);
			// 발생할 수 있는 예외
			// (1) args가 빈 배열인 경우, ArrayIndexOutOfBoundsException 발생
			// (2) args[0]에 숫자가 아닌 문자열이 들어 있는 경우, NumberFormatException 발생
			
			ExceptionTest1 t = new ExceptionTest1();
			
			t.m(i);
			// 발생할 수 있는 예외 - i가 0인 경우, ArithmeticException 발생
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("프로그램 매개변수를 입력하세요.");
			
		} catch (NumberFormatException e) {
			
			System.out.println("올바른 숫자 형식의 프로그램 매개변수를 입력하세요.");
			
		} catch (ArithmeticException e) {
			
			System.out.println("ArithmeticException 발생! " + e.getMessage());
			
		}
		
		System.out.println("main 메소드 끝~!");
		
	}
	
}
