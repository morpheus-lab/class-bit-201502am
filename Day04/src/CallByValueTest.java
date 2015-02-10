
public class CallByValueTest {
	
	public static void m() {}
	
	public static void m(int i) {
		i = 99;	// m 메소드의 지역변수 i의 값을 99로 변경
	}
	
	public static void m(int[] arr) {
		arr[0] = 99;	// m 메소드의 지역변수 arr이 가리키는 배열의
						// 0번 인덱스의 값을 99로 변경
	}
	
	public static void main(String[] args) {
		
		m();
		
		int i = 10;
		m(i);	// i 변수가 갖고 있는 "값(정수 값)"을 메소드 m에 전달
		System.out.println(i);
		
		int[] arr = {10, 20, 30};
		m(arr);	// arr 변수가 갖고 있는 "값(참조값)"을 메소드 m에 전달
		System.out.println(arr[0]);
		
	}
	
}
