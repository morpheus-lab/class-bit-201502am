package finals;

public class FinalVariable {
	
//	public static final int finalInt;	// The blank final field finalInt may not have been initialized
	
	public final int finalInt = 10;	// final 변수는 선언과 동시에 초기화 해야함.
									// 이후에 값을 변경할 수 없기 때문에..
	
	public void testFinalVar() {
//		finalInt = 20;	// The final field FinalVariable.finalInt cannot be assigned
	}
	
}
