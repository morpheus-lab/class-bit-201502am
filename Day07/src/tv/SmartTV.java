package tv;

public class SmartTV extends MonitorTV {
	
	public void watchYouTube() {
		System.out.println("����ƮTV - YouTube�� ���ϴ�.");
	}
	
	public void browseInternet(String url) {
		System.out.println("����ƮTV - �� ������ �մϴ�.");
	}
	
	public void playFileOnUSB() {
		System.out.println("����ƮTV - USB�� ����� ������ ���.");
		
		super.secret();
	}
	
	
	
}
