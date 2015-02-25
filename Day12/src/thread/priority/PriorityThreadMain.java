package thread.priority;

public class PriorityThreadMain {
	
	static class PriorityThread extends Thread {
		@Override
		public void run() {
			System.out.println(getName() + " ������ ���� [�켱��: " + getPriority() + "]");
			int i = 0;
			while (i < 10000) {
				i ++;
				try {
					Thread.sleep(1);
				} catch (Exception e) {}
			}
			System.out.println(getName() + " ������ ���� [�켱��: " + getPriority() + "]");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main ����");
		
		PriorityThread[] threads = new PriorityThread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new PriorityThread();	// ������ ��ü ����
			threads[i].setPriority(i + 1);			// �켱�� ����
		}
		
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		
		System.out.println("main ����");
		
	}
	
}
