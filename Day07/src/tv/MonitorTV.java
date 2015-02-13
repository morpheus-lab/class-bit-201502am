package tv;

public class MonitorTV extends BasicTV {
	
	private int input;
	
	public void selectInput(int input) {
		System.out.println("모니터겸용TV - 입력선택: " + input);
		this.input = input;
	}
	
	protected void secret() {
		super.chDown();
	}
	
}
