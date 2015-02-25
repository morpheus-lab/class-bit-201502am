package thread;

public class ThreadTest {
	
	public static class CountDown extends Thread {
		@Override
		public void run() {
			for (int i = 10; i >= 0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(500);	// ms ������ �ð� ��ŭ �����带 ��� ����
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main ����");
		
		// CountDown ��ü ����
		CountDown cd = new CountDown();
		
		// ������ �ٱ� Thread ���� ���ʿ�
		
		// Thread�� start() ȣ��
		cd.start();
		
		System.out.println("main ����");
		
	}
	
}
