package thread;

import java.io.IOException;

public class ThreadStopTest {
	static class AThread extends Thread {
		static boolean all_flag = true;
		
		private boolean flag = true;
		public void setFlag(boolean flag) {
			this.flag = flag;
		}
		
		@Override
		public void run() {
			System.out.println(getName() + ": 시작");
			while (flag && all_flag) {
				// 스레드가 반복적으로 할 일
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
			System.out.println(getName() + ": 종료");
		}
	}
	public static void main(String[] args) throws IOException {
		AThread a = new AThread();
		AThread b = new AThread();
		AThread c = new AThread();
		a.setName("Thread-A");
		b.setName("Thread-B");
		c.setName("Thread-C");
		a.start();
		b.start();
		c.start();
		
		System.out.println("종료할 스레드 (A/B/C/M): ");
		
		boolean run = true;
		while (run) {
			int keyInput = System.in.read();
			switch (keyInput) {
			case 'A':
			case 'a':
				a.setFlag(false);
				break;
			case 'B':
			case 'b':
				b.setFlag(false);
				break;
			case 'C':
			case 'c':
				c.setFlag(false);
				break;
			case 'M':
			case 'm':
				AThread.all_flag = false;	// all_flag는 static 변수(클래스 변수)이기 때문에
											// 모든 AThread 객체가 함께 공유하는 변수
				run = false;
				break;
			}
		}
		System.out.println("main 종료");
		
	}
	
}
