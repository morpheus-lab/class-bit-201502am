package thread.sync;

import java.util.ArrayList;

public class VideoShopMain {
	
	static class VideoShop {
		
		ArrayList videoTapes = new ArrayList();	// 비디오 테이프 보관소
		
		public VideoShop() {
			videoTapes.add("은하철도999-0");
			videoTapes.add("은하철도999-1");
			videoTapes.add("은하철도999-2");
		}
		
		public synchronized String lendVideo() {
			if (videoTapes.size() > 0) {
				// 맨 마지막 비디오 테이프 꺼내서 빌려줌
				return (String) videoTapes.remove(videoTapes.size() - 1);
			}
			return null;
		}
		
		public synchronized void returnVideo(String video) {
			videoTapes.add(video);
		}
		
	}
	
	static class Customer extends Thread {
		@Override
		public void run() {
//			synchronized (vShop) {
				String v = vShop.lendVideo();	// 비디오 빌리기
				if (v == null) {	// 비디오 못 빌려온 경우
					System.out.println(getName() + ": 비디오가 없네. 안봐.");
				} else {
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
				}
//			}
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
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
		System.out.println("main 종료");
		
	}
	
}



















