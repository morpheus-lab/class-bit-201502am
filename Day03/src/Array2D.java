import java.util.Random;
import java.util.Scanner;



public class Array2D {

	public static void main(String[] args) {
		/*
		double d = Math.random(); // [0, 1) 범위의 double 값을 이용
		int ranInt = (int) (d * 25 + 1);
		
		System.out.println(ranInt);	// sysout <ctrl>+<space>
		
		Random rand = new Random();
		ranInt = rand.nextInt(25) + 1;	// 0~24사이의 난수 + 1 => 1~25사이의 난수
		
		System.out.println(ranInt);
		*/
		
		int[][] a = new int[5][5];
		
		// 1~25 사이의 난수를 각 칸에 배치
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 25 + 1) /* 1 ~ 25 임의의 정수 */;
				
				// 중복된 값이 나온적이 있는지 검사
				FOR_I2:	// 아래 for 문에 이름표 달기
				for (int i2 = 0; i2 <= i; i2++) {
					for (int j2 = 0; j2 < a[i2].length; j2++) {
						// 검사를 중단 시키는 지점
						if(i == i2 && j == j2) {// 자신과 비교하기 전 검사 중단
//							System.out.println("검사 중단!");
							break FOR_I2;
						}
						if (a[i][j] == a[i2][j2]) {
//							System.out.println("다시!");
							// 난수 다시 발생시킴
							j--;	// 다시 i, j 칸으로 되돌아 오도록
							break FOR_I2;
						}
					}
				}
			}
		}
		
		printBingoBoard(a);
		
		// 사용자로부터 숫자(1~25)를 입력 받고 숫자 지우기
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("삭제할 번호를 입력하세요: ");
			
			int num = sc.nextInt();	// 사용자 입력 값
			
			FOR_DEL:
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] == num) {	// i행 j열의 값이 사용자가 입력한 숫자와 같으면
						a[i][j] = 0;	// 번호 삭제 (0으로 만듦)
						break FOR_DEL;
					}
				}
			}
			
			printBingoBoard(a);
			
			// 빙고 카운트
			int bingoCount = 0;
			// (1) 가로줄 완성
			for (int i = 0; i < a.length; i++) {
				boolean allDeleted = true;
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] != 0) {
						allDeleted = false;
						break;
					}
				}
				if (allDeleted) {	// i번 열이 모두 지워진 경우
					bingoCount ++;
				}
			}
			// (2) 세로줄 완성
			for (int j = 0; j < a[0].length; j++) {
				boolean allDeleted = true;
				for (int i = 0; i < a.length; i++) {
					if (a[i][j] != 0) {
						allDeleted = false;
						break;
					}
				}
				// 한 줄 검사 끝나면
				if (allDeleted) {	// j번 행이 모두 지원진 경우
					bingoCount ++;
				}
			}
			// (3) 왼쪽 위 - 오른쪽 아래 대각선
			boolean allDeleted = true;
			for (int k = 0; k < a.length; k++) {
				// 검사
				if (a[k][k] != 0) {
					allDeleted = false;
					break;
				}
			}
			// allDeleted가 true이면
			if (allDeleted) {
				bingoCount ++;
			}
			// (4) 오른쪽 위 - 왼쪽 아래 대각선
			allDeleted = true;
			for (int k = 0; k < a.length; k++) {
				if (a[k][a.length - 1 - k] != 0) {
					allDeleted = false;
					break;
				}
			}
			// allDeleted가 true이면
			if (allDeleted) {
				bingoCount ++;
			}
			
			if (bingoCount > 0) {
				System.out.println(bingoCount + " 줄 완성!");
			}
			
			if (bingoCount >= 5) {
				System.out.println("승리!! 게임을 종료합니다.");
				break;
			}
		}
		
		// 프로그램 종료
	}
	
	public static void printBingoBoard(int[][] board) {
		// 각 칸의 값 출력
		for (int i = 0; i < board.length ; i++) {
			// a[i]의 내용 출력
			for (int j = 0; j < board[i].length; j++) {
				// a[i][j] 출력
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}

}



















