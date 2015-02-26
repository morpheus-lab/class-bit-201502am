package thread;

import java.io.IOException;

public class ThreadSuspendResumeTest {
	
	static class WaitingThread extends Thread {
		@Override
		public void run() {
			int i = 0;
			while (true) {
				System.out.println(i++);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		WaitingThread t = new WaitingThread();
		t.start();
		
		System.out.println("일시정지: W, 재시작: R, 종료: S");
		
		boolean run = true;
		while (run) {
			int keyInput = System.in.read();
			
			switch (keyInput) {
			case 'W':
			case 'w':
				t.suspend();	// 대기상태(NotRunnable)로
				break;
			case 'R':
			case 'r':
				t.resume();		// Runnable 상태로
				break;
			case 'S':
			case 's':
				t.stop();		// Dead 상태로
				run = false;
				break;
			}
		}
		
	}
	
}
