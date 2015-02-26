package thread.notsync;

public class NotSyncBankMain {
	
	static class Park extends Thread {
		@Override
		public void run() {
			NotSyncBankMain.myBank.in(3000);	// 3000�� �Ա�
			System.out.println("3000�� �Ա� �� �ܾ�: "
					+ NotSyncBankMain.myBank.getBalance());
		}
	}
	
	static class ParkWife extends Thread {
		@Override
		public void run() {
			NotSyncBankMain.myBank.out(1000);	// 1000�� ���
			System.out.println("1000�� ��� �� �ܾ�: "
					+ NotSyncBankMain.myBank.getBalance());
		}
	}
	
	static class BankAccount {
		private int balance = 10000;	// ���� �ܾ�
		public int getBalance() {	// �ܾ� ��ȸ
			return balance;
		}
		public void setBalance(int balance) {	// �ܾ��� ����
			this.balance = balance;
		}
		public void in(int amount) {	// �Ա�
			int b = getBalance();	// �ܾ� ��ȸ
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setBalance(b + amount);	// �Աݾ� ���ϰ� �ܾ� ����
		}
		public void out(int amount) {	// ���
			int b = getBalance();// �ܾ� ��ȸ
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setBalance(b - amount);// ��ݾ� ���� �ܾ� ����
		}
	}
	
	static BankAccount myBank = new BankAccount();	// �ھ��� �ھ� ������ �����ϴ� ���� ����
	
	public static void main(String[] args) {
		
		System.out.println("���� �ܾ�: " + myBank.getBalance());
		
		Park p = new Park();
		ParkWife w = new ParkWife();
		
		p.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	// try-catch ���� �ڵ��ϼ�: ��� �����ϰ� <Alt>+<Shift>+Z ���� �� "try-catch Block" ����
		w.start();
		
	}
	
}
