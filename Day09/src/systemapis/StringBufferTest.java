package systemapis;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
//		StringBuffer sb = new StringBuffer();		// 빈 버퍼 생성
		StringBuffer sb = new StringBuffer("apple");	// 초기값 지정하는 생성자
//		StringBuffer sb = new StringBuffer(100);	// 버퍼의 크기를 지정하는 생성자
		
		sb.append(1);			// + 1
		sb.append(",banana");	// + ",banana"
		sb.append(",");			// + ","
		sb.append(true);		// + true
		
		sb.setCharAt(1, 'z');	// 첫번째 파라미터 인덱스 문자를
								// 두번째 파라미터 문자로 변경
		
		sb.insert(2, "ZZZ");	// 첫번째 파라미터 인덱스 위치에
								// 두번째 파라미터 문자를 삽입
		
		// toString()으로 String 객체 생성
		String s = sb.toString();
		
		System.out.println(s);
		
		System.out.println("----------------------------------");
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("mango").append(",").append("orange");
		
	}
	
}































