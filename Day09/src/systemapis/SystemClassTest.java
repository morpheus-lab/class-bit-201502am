package systemapis;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SystemClassTest {
	
	public static void main(String[] args) {
		
		// 표준 출력 스트림 (데이터가 흐르는 통로; 단방향)
		PrintStream outStream = System.out;	// 콘솔(커맨드창)
		
		// 표준 입력 스트림
		InputStream inStream = System.in;	// 키보드 입력
		
		// 현재 시간 (1970-01-01 00:00:00.000 기준, 경과 시간(ms 단위))
		long currentTime = System.currentTimeMillis();
//		System.out.println(currentTime);
//		System.out.println(currentTime / 1000 / 3600 / 24 / 365);
		
		// 가비지 컬렉터 실행
		System.gc();
		
		// System.getenv() => 시스템 환경 변수를 Map형태로 제공
		Map env = System.getenv();	// Map: key-value 쌍으로 이루어진 데이터를 저장하는 자료구조
		Set keys = env.keySet();	// Map의 key만 추출
		Iterator keyIter = keys.iterator();	// 위에서 추출한 key값들을 하나씩 순회할 수 있는 자료구조
		while (keyIter.hasNext()) {	// 순회할 것이 남아있는 동안 반복
			Object key = keyIter.next();
			Object value = env.get(key);
			
			System.out.println(key + " = " + value);
		}
		
	}
	
}














