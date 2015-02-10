import java.util.Random;
import java.util.Scanner;



public class Array2D {

	public static void main(String[] args) {
		/*
		double d = Math.random(); // [0, 1) ������ double ���� �̿�
		int ranInt = (int) (d * 25 + 1);
		
		System.out.println(ranInt);	// sysout <ctrl>+<space>
		
		Random rand = new Random();
		ranInt = rand.nextInt(25) + 1;	// 0~24������ ���� + 1 => 1~25������ ����
		
		System.out.println(ranInt);
		*/
		
		int[][] a = new int[5][5];
		
		// 1~25 ������ ������ �� ĭ�� ��ġ
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 25 + 1) /* 1 ~ 25 ������ ���� */;
				
				// �ߺ��� ���� �������� �ִ��� �˻�
				FOR_I2:	// �Ʒ� for ���� �̸�ǥ �ޱ�
				for (int i2 = 0; i2 <= i; i2++) {
					for (int j2 = 0; j2 < a[i2].length; j2++) {
						// �˻縦 �ߴ� ��Ű�� ����
						if(i == i2 && j == j2) {// �ڽŰ� ���ϱ� �� �˻� �ߴ�
//							System.out.println("�˻� �ߴ�!");
							break FOR_I2;
						}
						if (a[i][j] == a[i2][j2]) {
//							System.out.println("�ٽ�!");
							// ���� �ٽ� �߻���Ŵ
							j--;	// �ٽ� i, j ĭ���� �ǵ��� ������
							break FOR_I2;
						}
					}
				}
			}
		}
		
		printBingoBoard(a);
		
		// ����ڷκ��� ����(1~25)�� �Է� �ް� ���� �����
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("������ ��ȣ�� �Է��ϼ���: ");
			
			int num = sc.nextInt();	// ����� �Է� ��
			
			FOR_DEL:
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] == num) {	// i�� j���� ���� ����ڰ� �Է��� ���ڿ� ������
						a[i][j] = 0;	// ��ȣ ���� (0���� ����)
						break FOR_DEL;
					}
				}
			}
			
			printBingoBoard(a);
			
			// ���� ī��Ʈ
			int bingoCount = 0;
			// (1) ������ �ϼ�
			for (int i = 0; i < a.length; i++) {
				boolean allDeleted = true;
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] != 0) {
						allDeleted = false;
						break;
					}
				}
				if (allDeleted) {	// i�� ���� ��� ������ ���
					bingoCount ++;
				}
			}
			// (2) ������ �ϼ�
			for (int j = 0; j < a[0].length; j++) {
				boolean allDeleted = true;
				for (int i = 0; i < a.length; i++) {
					if (a[i][j] != 0) {
						allDeleted = false;
						break;
					}
				}
				// �� �� �˻� ������
				if (allDeleted) {	// j�� ���� ��� ������ ���
					bingoCount ++;
				}
			}
			// (3) ���� �� - ������ �Ʒ� �밢��
			boolean allDeleted = true;
			for (int k = 0; k < a.length; k++) {
				// �˻�
				if (a[k][k] != 0) {
					allDeleted = false;
					break;
				}
			}
			// allDeleted�� true�̸�
			if (allDeleted) {
				bingoCount ++;
			}
			// (4) ������ �� - ���� �Ʒ� �밢��
			allDeleted = true;
			for (int k = 0; k < a.length; k++) {
				if (a[k][a.length - 1 - k] != 0) {
					allDeleted = false;
					break;
				}
			}
			// allDeleted�� true�̸�
			if (allDeleted) {
				bingoCount ++;
			}
			
			if (bingoCount > 0) {
				System.out.println(bingoCount + " �� �ϼ�!");
			}
			
			if (bingoCount >= 5) {
				System.out.println("�¸�!! ������ �����մϴ�.");
				break;
			}
		}
		
		// ���α׷� ����
	}
	
	public static void printBingoBoard(int[][] board) {
		// �� ĭ�� �� ���
		for (int i = 0; i < board.length ; i++) {
			// a[i]�� ���� ���
			for (int j = 0; j < board[i].length; j++) {
				// a[i][j] ���
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}

}



















