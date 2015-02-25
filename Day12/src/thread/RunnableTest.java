package thread;

public class RunnableTest {
	
	public static class CountDown implements Runnable {
		public void run() {
			// �� Ŭ������ ��ü�� ������ ������� ������ �� �� ��
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
		
		System.out.println("main �޼ҵ� ����");
		
		// CountDown ��ü ����
		CountDown cd = new CountDown();
		CountDown cd2 = new CountDown();
		
		// �� ��ü�� ������ ����
		Thread t = new Thread(cd);	// cd ��ü�� ������ ������� ������ �غ� �Ϸ�
		Thread t2 = new Thread(cd2);
		
		// ������ ����
		t.start();
		t2.start();
		
		System.out.println("main �޼ҵ� ����");
		
	}
	
}
