package thread;

public class ThreadTest {
	
	public static class CountDown extends Thread {
		@Override
		public void run() {
			for (int i = 10; i >= 0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(500);	// ms 단위의 시간 만큼 스레드를 잠시 멈춤
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
		// CountDown 객체 생성
		CountDown cd = new CountDown();
		
		// 별도로 바깥 Thread 생성 불필요
		
		// Thread의 start() 호출
		cd.start();
		
		System.out.println("main 종료");
		
	}
	
}
