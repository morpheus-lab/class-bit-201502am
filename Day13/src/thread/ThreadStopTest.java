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
			System.out.println(getName() + ": ����");
			while (flag && all_flag) {
				// �����尡 �ݺ������� �� ��
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
			System.out.println(getName() + ": ����");
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
		
		System.out.println("������ ������ (A/B/C/M): ");
		
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
				AThread.all_flag = false;	// all_flag�� static ����(Ŭ���� ����)�̱� ������
											// ��� AThread ��ü�� �Բ� �����ϴ� ����
				run = false;
				break;
			}
		}
		System.out.println("main ����");
		
	}
	
}
