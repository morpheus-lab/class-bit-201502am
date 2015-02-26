package thread.notsync;

public class NotSyncBankMain {
	
	static class Park extends Thread {
		@Override
		public void run() {
			NotSyncBankMain.myBank.in(3000);	// 3000원 입금
			System.out.println("3000원 입금 후 잔액: "
					+ NotSyncBankMain.myBank.getBalance());
		}
	}
	
	static class ParkWife extends Thread {
		@Override
		public void run() {
			NotSyncBankMain.myBank.out(1000);	// 1000원 출금
			System.out.println("1000원 출금 후 잔액: "
					+ NotSyncBankMain.myBank.getBalance());
		}
	}
	
	static class BankAccount {
		private int balance = 10000;	// 예금 잔액
		public int getBalance() {	// 잔액 조회
			return balance;
		}
		public void setBalance(int balance) {	// 잔액을 저장
			this.balance = balance;
		}
		public void in(int amount) {	// 입금
			int b = getBalance();	// 잔액 조회
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setBalance(b + amount);	// 입금액 더하고 잔액 저장
		}
		public void out(int amount) {	// 출금
			int b = getBalance();// 잔액 조회
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setBalance(b - amount);// 출금액 빼고 잔액 저장
		}
	}
	
	static BankAccount myBank = new BankAccount();	// 박씨와 박씨 부인이 공유하는 은행 계좌
	
	public static void main(String[] args) {
		
		System.out.println("은행 잔액: " + myBank.getBalance());
		
		Park p = new Park();
		ParkWife w = new ParkWife();
		
		p.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	// try-catch 구문 자동완성: 블록 지정하고 <Alt>+<Shift>+Z 누른 후 "try-catch Block" 선택
		w.start();
		
	}
	
}
