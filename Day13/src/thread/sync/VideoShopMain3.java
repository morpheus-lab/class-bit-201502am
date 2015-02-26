package thread.sync;

import java.util.ArrayList;

public class VideoShopMain3 {
	
	static class VideoShop {
		
		ArrayList videoTapes = new ArrayList();	// 비디오 테이프 보관소
		
		public VideoShop() {
			videoTapes.add("은하철도999-0");
			videoTapes.add("은하철도999-1");
			videoTapes.add("은하철도999-2");
		}
		
		public synchronized String lendVideo() throws InterruptedException {
			Thread t = Thread.currentThread();	// 이 코드를 실행하고 있는 스레드
			while (videoTapes.size() == 0) {
				System.out.println(t.getName() + ": 대기 상태 진입");
				this.wait();	// 이 코드를 실행하고 있는 스레드를 this 객체에 대해 대기하도록
				System.out.println(t.getName() + ": 대기 상태 해제");
			}
			return (String) videoTapes.remove(videoTapes.size() - 1);
		}
		
		public synchronized void returnVideo(String video) {
			videoTapes.add(video);
			this.notifyAll();	// this 객체에 대해 대기하고 있는 스레드 하나를 깨움
		}
		
	}
	
	static class Customer extends Thread {
		@Override
		public void run() {
			try {
				String v = vShop.lendVideo();	// 비디오 빌리기
				System.out.println(getName() + ": " + v + " 대여");
				
				System.out.println(getName() + ": " + v + " 보기 시작");
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + ": " + v + " 보기 끝");
				
				System.out.println(getName() + ": " + v + " 반납");
				vShop.returnVideo(v);	// 비디오 반납
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	static VideoShop vShop = new VideoShop();
	
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
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
		
		System.out.println("main 종료");
		
	}
	
}



















