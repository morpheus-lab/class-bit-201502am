import java.io.*;	// java.io 패키지에 있는 모든 클래스 import

public class FinallyTest {
	
	static String fileName = "D:\\java.png";
	
	public static void main(String[] args) {
		
		FileInputStream in = null;
		
		try {
			
			in = new FileInputStream(fileName);
			
			int count = 0;	// 파일의 크기 (바이트 수)
			int data = -1;	// 파일로부터 읽은 데이터 임시 저장
			
			while ((data = in.read()) != -1) {
				count ++;
			}
			
			System.out.println(fileName + " 파일 크기: " + count + " 바이트");
		} catch (FileNotFoundException e) {
			// FileInputStream 객체 생성 시 발생 가능
			System.out.println(fileName + " 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// FileInputStream 객체로부터 read() 시 발생 가능
			System.out.println("파일 입출력 에러 발생.");
		} finally {
			// 정상 실행된 경우, catch 구문에 의해 예외가 처리된 경우,
			// catch 구문에 의해 예외가 처리되지 못한 경우
			
			// 파일입력스트림 닫기
			if (in != null) {
				try {
					in.close();
				} catch(IOException e) {}
			}
		}
		
	}
	
}










