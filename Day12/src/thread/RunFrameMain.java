package thread;

import java.awt.Frame;

import thread.ThreadTest.CountDown;

public class RunFrameMain {
	
	static class RunFrame extends Frame implements Runnable {	// java.awt.Frame을 상속받아서 GUI 윈도우를 갖는 클래스로 만드려고 함
		
		public RunFrame() {
			(new Thread(this)).start();
		}
		
		@Override
		public void run() {
			int i = 0;
			System.out.println("스레드 시작");
			while (i < 20) {
				System.out.print(i + "\t");
				setTitle("스레드 동작중 " + i++);
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
		
		RunFrame rf = new RunFrame();
		
		// Frame 객체로서
		rf.setSize(300, 200);	// 창 크기 설정
		rf.show();	// 창을 보이도록 만듦
		
		// Runnable 객체로서
//		Thread t = new Thread(rf);
//		t.start();
		
	}
	
}
