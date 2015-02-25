package thread;

public class RunnableTest {
	
	public static class CountDown implements Runnable {
		public void run() {
			// 이 클래스의 객체가 별도의 스레드로 동작할 때 할 일
			for (int i = 10; i >= 0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main 메소드 시작");
		
		// CountDown 객체 생성
		CountDown cd = new CountDown();
		CountDown cd2 = new CountDown();
		
		// 위 객체로 스레드 생성
		Thread t = new Thread(cd);	// cd 객체가 별도의 스레드로 동작할 준비 완료
		Thread t2 = new Thread(cd2);
		
		// 스레드 시작
		t.start();
		t2.start();
		
		System.out.println("main 메소드 종료");
		
	}
	
}
