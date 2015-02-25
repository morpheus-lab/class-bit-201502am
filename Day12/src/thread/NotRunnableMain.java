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
		System.out.println("main ����");
		
		long start = System.currentTimeMillis();	// ���� �ð��� start ������ ���
		// EPOCH �ð� (1970-01-01 00:00:00.000 ���κ��� �� ms �귶����)
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();	// Thread.sleep ������ �ð��� end ������ ���
		
		System.out.println("main ����");
		
		System.out.println("���� �ð�: " + (end - start));
		*/
		
		NotRunnableThread t = new NotRunnableThread();
		t.start();
	}
	
}
