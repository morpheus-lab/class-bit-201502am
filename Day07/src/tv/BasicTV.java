package tv;

public class BasicTV {
	
	private int ch;				// 채널
	private int vol;			// 음량
	private boolean isPowerOn;	// 전원 켜짐 여부
	
	public void chUp() {
		System.out.println("기본TV 채널 UP");
		ch ++;
	}
	
	public void chDown() {
		System.out.println("기본TV 채널 DOWN");
		ch --;
	}
	
	public void volUp() {
		System.out.println("기본TV 음량 UP");
		vol ++;
	}
	
	public void volDown() {
		System.out.println("기본TV 음량 DOWN");
		vol --;
	}
	
	public void powerOn() {
		System.out.println("기본TV 전원 ON");
		isPowerOn = true;
	}
	
	public void powerOff() {
		System.out.println("기본TV 전원 OFF");
		isPowerOn = false;
	}
	
}
