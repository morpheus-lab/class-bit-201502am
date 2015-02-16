import java.io.*;	// java.io ��Ű���� �ִ� ��� Ŭ���� import

public class FinallyTest {
	
	static String fileName = "D:\\java.png";
	
	public static void main(String[] args) {
		
		FileInputStream in = null;
		
		try {
			
			in = new FileInputStream(fileName);
			
			int count = 0;	// ������ ũ�� (����Ʈ ��)
			int data = -1;	// ���Ϸκ��� ���� ������ �ӽ� ����
			
			while ((data = in.read()) != -1) {
				count ++;
			}
			
			System.out.println(fileName + " ���� ũ��: " + count + " ����Ʈ");
		} catch (FileNotFoundException e) {
			// FileInputStream ��ü ���� �� �߻� ����
			System.out.println(fileName + " ������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			// FileInputStream ��ü�κ��� read() �� �߻� ����
			System.out.println("���� ����� ���� �߻�.");
		} finally {
			// ���� ����� ���, catch ������ ���� ���ܰ� ó���� ���,
			// catch ������ ���� ���ܰ� ó������ ���� ���
			
			// �����Է½�Ʈ�� �ݱ�
			if (in != null) {
				try {
					in.close();
				} catch(IOException e) {}
			}
		}
		
	}
	
}










