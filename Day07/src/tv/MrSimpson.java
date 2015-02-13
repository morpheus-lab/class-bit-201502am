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
			// ����Ʈ TV�� ���
			SmartTV sTv = (SmartTV) tv;	// downcasting - �ڵ� �ƴ�
			sTv.browseInternet("http://www.sbs.co.kr");
		}
		else if (tv instanceof MonitorTV) {
			// ����� ��� TV�� ���
			MonitorTV mTv = (MonitorTV) tv;	// downcasting - �ڵ� �ƴ�
			mTv.selectInput(2);	// �Է¼��� ��� ���
		}
	}
	
	public static void main(String[] args) {
		
		MrSimpson simpson = new MrSimpson();
		
		simpson.watchMudo(new BasicTV());
		simpson.watchMudo(new MonitorTV());	// upcasting - �ڵ�
		simpson.watchMudo(new SmartTV());	// upcasting - �ڵ�
		
	}
	
}
