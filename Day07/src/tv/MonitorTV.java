package tv;

public class MonitorTV extends BasicTV {
	
	private int input;
	
	public void selectInput(int input) {
		System.out.println("����Ͱ��TV - �Է¼���: " + input);
		this.input = input;
	}
	
	protected void secret() {
		super.chDown();
	}
	
}
