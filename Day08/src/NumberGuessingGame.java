import java.util.InputMismatchException;
import java.util.Scanner;


public class NumberGuessingGame {
	
	public static void main(String[] args) {
		
		// 1 ~ 100 ������ ����(����)�� ���ߴ� ����
		
		// 1 ~ 100 ������ ���� �ϳ� ���� (����)
		
		// ���� ���� ������� #1
		int answer = (int)(Math.random() * 100) + 1;	// Math.random(): 0�̻� 1�̸��� �Ǽ� ���� �߻�
		
		// ���� ���� ������� #2
//		java.util.Random random = new java.util.Random();
//		answer = random.nextInt(100) + 1;	// nextInt(bound) : bound �̸��� ���� �߻�
		
		// Ű����κ��� �����͸� �Է� ���� �� �ִ� ��ü
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while (true) {
			
			try {
				System.out.print("1 ~ 100 ������ ������ �Է��ϼ���: ");
				input = sc.nextInt();	// ����ڷκ��� ������ �Է� �ޱ�
				
				// �Է��� ���ڿ� answer ��
				if (input > answer) {
					// �Է��� ���ڰ� ũ�ٸ�
					System.out.println("�� ���� ���� �Է��ϼ���.");
				}
				else if (input < answer) {
					// �Է��� ���ڰ� �۴ٸ�
					System.out.println("�� ū ���� �Է��ϼ���.");
				}
				else {
					// �Է��� ���ڿ� ������ ���� ���
					System.out.println("����~!!!");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ� �Է��ϼ���.");
				e.printStackTrace();
			} finally {
//				System.out.println("Input = " + input);
				sc.nextLine();
			}
			
		}
		
	}
	
}






























