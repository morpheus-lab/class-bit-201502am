
public class HandPhone {
	
	// 멤버 변수 (속성) 정의
	String myNumber;
	String[] photos;
	String[] apps;
	
	// 생성자 정의
	public HandPhone() {
		// 이 HandPhone 타입의 객체가 생성될 때
		// 해야하는 초기화 작업
		myNumber = "설정되지 않음";
		photos = new String[100];	// 사진 저장 공간을 100개로 초기화
		apps = new String[200];		// 앱 저장 공간을 200개로 초기화
	}
	
	// 메소드 정의
	void call(String recvNumber) {
		System.out.println(recvNumber + "번으로 전화를 겁니다.");
	}
	
	void takePhoto() {
		System.out.println("사진촬영을 합니다.");
		System.out.println("찰칵...");
		// photos에 새 사진 추가
		System.out.println("저장되었습니다.");
	}
	
	void installApp(String appName) {
		System.out.println(appName + " 앱을 설치합니다.");
		// apps에 새 앱(appName) 추가
	}
	
	void runApp(String appName) {
		System.out.println(appName + "을 실행합니다.");
	}
	
}
