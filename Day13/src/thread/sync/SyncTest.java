package thread.sync;

public class SyncTest {
	
	static class Resource {
		
		public synchronized void m() {	// ����ȭ�� �Ű�Ἥ �� ��.
										// ��ȣ���� �ִٸ� ����ߴٰ� ����.
										// ������ ������ ��ȣ���� ����� ����.
			String tName = Thread.currentThread().getName();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tName + ": m()");
		}
		
		public void m2() {	// ����ȭ�� �Ű澲�� �ʰ� �� ��.
							// ��ȣ���� �ֵ� ���� ������ �ٷ� ����.
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
			// i�� ¦���̸� AThread
			if (i % 2 == 0)
				t[i] = new AThread();
			// Ȧ���̸� BThread
			else
				t[i] = new BThread();
		}
		
		for (int i = 0; i < t.length; i++) {
			t[i].start();
		}
	}
	
}
