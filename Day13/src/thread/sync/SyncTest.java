package thread.sync;

public class SyncTest {
	
	static class Resource {
		
		public synchronized void m() {	// 동기화를 신경써서 일 함.
										// 보호막이 있다면 대기했다가 실행.
										// 실행할 때에도 보호막을 씌우고 실행.
			String tName = Thread.currentThread().getName();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tName + ": m()");
		}
		
		public void m2() {	// 동기화를 신경쓰지 않고 일 함.
							// 보호막이 있든 없든 무조건 바로 실행.
			String tName = Thread.currentThread().getName();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tName + ": m2()");
		}
	}
	
	static class AThread extends Thread {
		@Override
		public void run() {
			sharedRes.m();
		}
	}
	
	static class BThread extends AThread {
		@Override
		public void run() {
			sharedRes.m2();
		}
	}
	
	static Resource sharedRes = new Resource();
	
	public static void main(String[] args) {
		
		AThread[] t = new AThread[10];
		for (int i = 0; i < t.length; i++) {
			// i가 짝수이면 AThread
			if (i % 2 == 0)
				t[i] = new AThread();
			// 홀수이면 BThread
			else
				t[i] = new BThread();
		}
		
		for (int i = 0; i < t.length; i++) {
			t[i].start();
		}
	}
	
}
