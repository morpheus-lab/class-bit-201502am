package thread;

import java.awt.Frame;

public class SoloFrameMain {
	
	static class SoloFrame extends Frame {
		public SoloFrame() {
			// SoloThread ���� �� ����
			new SoloThread(this).start();
		}
	}
	
	static class SoloThread extends Thread {
		private Frame f = null;
		
		public SoloThread(Frame f) {
			this.f = f;
		}
		
		@Override
		public void run() {
			int i = 0;
			System.out.println("������ ����");
			while (i < 20) {
				System.out.print(i + "\t");
				f.setTitle("������ ������ " + i++);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("������ ����");
		}
	}
	
	public static void main(String[] args) {
		
		SoloFrame f = new SoloFrame();	// �����ڿ��� SoloThread ��ü ���� �� ����
		
		f.setSize(300, 300);
		f.show();
		
	}
	
}
