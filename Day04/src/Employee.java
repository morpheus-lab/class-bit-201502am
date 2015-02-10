
public class Employee {
	
	// 멤버 변수 (필드; fields), 인스턴스 변수
	String name;
	String no;
	String dept;
	
	// 생성자 - new 키워드로 인스턴스가 생성된 직후 자동 호출되는
	//        특수 메소드
	public Employee() {
		this("이름없음", "임시사번", "임시부서");
		System.out.println("인자(파라미터)없는 생성자 호출됨!");
	}
	
	public Employee(String na, String n, String d) {
		name = na; no = n; dept = d;
		System.out.println("인자 세 개짜리 생성자 호출됨!");
	}
	
	// 메소드
	public void print() {
		System.out.println(name + ", " + no + ", " + dept);
	}
	
}










