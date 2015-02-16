import java.util.InputMismatchException;
import java.util.Scanner;


public class NumberGuessingGame {
	
	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 숫자(정수)를 맞추는 게임
		
		// 1 ~ 100 사이의 정수 하나 생성 (정답)
		
		// 랜덤 정수 생성방법 #1
		int answer = (int)(Math.random() * 100) + 1;	// Math.random(): 0이상 1미만의 실수 랜덤 발생
		
		// 랜덤 정수 생성방법 #2
//		java.util.Random random = new java.util.Random();
//		answer = random.nextInt(100) + 1;	// nextInt(bound) : bound 미만의 정수 발생
		
		// 키보드로부터 데이터를 입력 받을 수 있는 객체
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while (true) {
			
			try {
				System.out.print("1 ~ 100 사이의 정수를 입력하세요: ");
				input = sc.nextInt();	// 사용자로부터 데이터 입력 받기
				
				// 입력한 숫자와 answer 비교
				if (input > answer) {
					// 입력한 숫자가 크다면
					System.out.println("더 작은 수를 입력하세요.");
				}
				else if (input < answer) {
					// 입력한 숫자가 작다면
					System.out.println("더 큰 수를 입력하세요.");
				}
				else {
					// 입력한 숫자와 정답이 같은 경우
					System.out.println("정답~!!!");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("입력값이 잘못되었습니다. 다시 입력하세요.");
				e.printStackTrace();
			} finally {
//				System.out.println("Input = " + input);
				sc.nextLine();
			}
			
		}
		
	}
	
}






























