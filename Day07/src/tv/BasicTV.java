package tv;

public class BasicTV {
	
	private int ch;				// ä��
	private int vol;			// ����
	private boolean isPowerOn;	// ���� ���� ����
	
	public void chUp() {
		System.out.println("�⺻TV ä�� UP");
		ch ++;
	}
	
	public void chDown() {
		System.out.println("�⺻TV ä�� DOWN");
		ch --;
	}
	
	public void volUp() {
		System.out.println("�⺻TV ���� UP");
		vol ++;
	}
	
	public void volDown() {
		System.out.println("�⺻TV ���� DOWN");
		vol --;
	}
	
	public void powerOn() {
		System.out.println("�⺻TV ���� ON");
		isPowerOn = true;
	}
	
	public void powerOff() {
		System.out.println("�⺻TV ���� OFF");
		isPowerOn = false;
	}
	
}
