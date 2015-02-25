package thread;

public class NotRunnableMain {
	
	static class NotRunnableThread extends Thread {
		@Override
		public void run() {
			int i = 0;
			while (i < 10) {
				System.out.println(i++ + ": " + System.currentTimeMillis());
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		System.out.println("main 시작");
		
		long start = System.currentTimeMillis();	// 현재 시간을 start 변수에 기록
		// EPOCH 시간 (1970-01-01 00:00:00.000 으로부터 몇 ms 흘렀는지)
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();	// Thread.sleep 이후의 시간을 end 변수에 기록
		
		System.out.println("main 종료");
		
		System.out.println("지난 시간: " + (end - start));
		*/
		
		NotRunnableThread t = new NotRunnableThread();
		t.start();
	}
	
}
