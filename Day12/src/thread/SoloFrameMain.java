package thread;

import java.awt.Frame;

public class SoloFrameMain {
	
	static class SoloFrame extends Frame {
		public SoloFrame() {
			// SoloThread 생성 및 시작
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
			System.out.println("스레드 시작");
			while (i < 20) {
				System.out.print(i + "\t");
				f.setTitle("스레드 동작중 " + i++);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("스레드 종료");
		}
	}
	
	public static void main(String[] args) {
		
		SoloFrame f = new SoloFrame();	// 생성자에서 SoloThread 객체 생성 및 시작
		
		f.setSize(300, 300);
		f.show();
		
	}
	
}
