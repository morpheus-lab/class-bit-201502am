package modifier.a;

public class A {
	
	private int priI;
	int i;
	protected int proI;
	public int pubI;
	
	private void priM() {
		priI ++; i ++; proI ++; pubI ++;
	}
	
	void m() {
		priI ++; i ++; proI ++; pubI ++;
	}
	
	protected void proM() {
		priI ++; i ++; proI ++; pubI ++;
	}
	
	public void pubM() {
		priI ++; i ++; proI ++; pubI ++;
	}
	
}
