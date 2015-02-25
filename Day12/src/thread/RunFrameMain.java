package thread;

import java.awt.Frame;

import thread.ThreadTest.CountDown;

public class RunFrameMain {
	
	static class RunFrame extends Frame implements Runnable {	// java.awt.Frame�� ��ӹ޾Ƽ� GUI �����츦 ���� Ŭ������ ������� ��
		
		public RunFrame() {
			(new Thread(this)).start();
		}
		
		@Override
		public void run() {
			int i = 0;
			System.out.println("������ ����");
			while (i < 20) {
				System.out.print(i + "\t");
				setTitle("������ ������ " + i++);
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
		
		RunFrame rf = new RunFrame();
		
		// Frame ��ü�μ�
		rf.setSize(300, 200);	// â ũ�� ����
		rf.show();	// â�� ���̵��� ����
		
		// Runnable ��ü�μ�
//		Thread t = new Thread(rf);
//		t.start();
		
	}
	
}
