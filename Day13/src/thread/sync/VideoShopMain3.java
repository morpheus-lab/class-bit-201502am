package thread.sync;

import java.util.ArrayList;

public class VideoShopMain3 {
	
	static class VideoShop {
		
		ArrayList videoTapes = new ArrayList();	// ���� ������ ������
		
		public VideoShop() {
			videoTapes.add("����ö��999-0");
			videoTapes.add("����ö��999-1");
			videoTapes.add("����ö��999-2");
		}
		
		public synchronized String lendVideo() throws InterruptedException {
			Thread t = Thread.currentThread();	// �� �ڵ带 �����ϰ� �ִ� ������
			while (videoTapes.size() == 0) {
				System.out.println(t.getName() + ": ��� ���� ����");
				this.wait();	// �� �ڵ带 �����ϰ� �ִ� �����带 this ��ü�� ���� ����ϵ���
				System.out.println(t.getName() + ": ��� ���� ����");
			}
			return (String) videoTapes.remove(videoTapes.size() - 1);
		}
		
		public synchronized void returnVideo(String video) {
			videoTapes.add(video);
			this.notifyAll();	// this ��ü�� ���� ����ϰ� �ִ� ������ �ϳ��� ����
		}
		
	}
	
	static class Customer extends Thread {
		@Override
		public void run() {
			try {
				String v = vShop.lendVideo();	// ���� ������
				System.out.println(getName() + ": " + v + " �뿩");
				
				System.out.println(getName() + ": " + v + " ���� ����");
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + ": " + v + " ���� ��");
				
				System.out.println(getName() + ": " + v + " �ݳ�");
				vShop.returnVideo(v);	// ���� �ݳ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	static VideoShop vShop = new VideoShop();
	
	public static void main(String[] args) {
		
		System.out.println("main ����");
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();
		Customer c6 = new Customer();
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
		
		System.out.println("main ����");
		
	}
	
}



















