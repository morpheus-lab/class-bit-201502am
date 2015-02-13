package tv;

public class MrSimpson {
	
	public void watchMudo(BasicTV tv) {
		tv.chUp();
		tv.volUp();
	}
	
	public void watchRunningMan(BasicTV tv) {
		tv.chUp();
		tv.volUp();
		
		if (tv instanceof SmartTV) {
			// 스마트 TV인 경우
			SmartTV sTv = (SmartTV) tv;	// downcasting - 자동 아님
			sTv.browseInternet("http://www.sbs.co.kr");
		}
		else if (tv instanceof MonitorTV) {
			// 모니터 겸용 TV인 경우
			MonitorTV mTv = (MonitorTV) tv;	// downcasting - 자동 아님
			mTv.selectInput(2);	// 입력선택 기능 사용
		}
	}
	
	public static void main(String[] args) {
		
		MrSimpson simpson = new MrSimpson();
		
		simpson.watchMudo(new BasicTV());
		simpson.watchMudo(new MonitorTV());	// upcasting - 자동
		simpson.watchMudo(new SmartTV());	// upcasting - 자동
		
	}
	
}
