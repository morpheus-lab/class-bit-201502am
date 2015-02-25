package thread.priority;

public class PriorityThreadMain {
	
	static class PriorityThread extends Thread {
		@Override
		public void run() {
			System.out.println(getName() + " 스레드 시작 [우선권: " + getPriority() + "]");
			int i = 0;
			while (i < 10000) {
				i ++;
				try {
					Thread.sleep(1);
				} catch (Exception e) {}
			}
			System.out.println(getName() + " 스레드 종료 [우선권: " + getPriority() + "]");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
		PriorityThread[] threads = new PriorityThread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new PriorityThread();	// 스레드 객체 생성
			threads[i].setPriority(i + 1);			// 우선권 설정
		}
		
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		
		System.out.println("main 종료");
		
	}
	
}
