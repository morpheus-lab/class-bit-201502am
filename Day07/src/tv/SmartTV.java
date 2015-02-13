package tv;

public class SmartTV extends MonitorTV {
	
	public void watchYouTube() {
		System.out.println("스마트TV - YouTube를 봅니다.");
	}
	
	public void browseInternet(String url) {
		System.out.println("스마트TV - 웹 서핑을 합니다.");
	}
	
	public void playFileOnUSB() {
		System.out.println("스마트TV - USB에 저장된 파일을 재생.");
		
		super.secret();
	}
	
	
	
}
