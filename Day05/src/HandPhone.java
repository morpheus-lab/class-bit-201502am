
public class HandPhone {
	
	// ��� ���� (�Ӽ�) ����
	String myNumber;
	String[] photos;
	String[] apps;
	
	// ������ ����
	public HandPhone() {
		// �� HandPhone Ÿ���� ��ü�� ������ ��
		// �ؾ��ϴ� �ʱ�ȭ �۾�
		myNumber = "�������� ����";
		photos = new String[100];	// ���� ���� ������ 100���� �ʱ�ȭ
		apps = new String[200];		// �� ���� ������ 200���� �ʱ�ȭ
	}
	
	// �޼ҵ� ����
	void call(String recvNumber) {
		System.out.println(recvNumber + "������ ��ȭ�� �̴ϴ�.");
	}
	
	void takePhoto() {
		System.out.println("�����Կ��� �մϴ�.");
		System.out.println("��Ĭ...");
		// photos�� �� ���� �߰�
		System.out.println("����Ǿ����ϴ�.");
	}
	
	void installApp(String appName) {
		System.out.println(appName + " ���� ��ġ�մϴ�.");
		// apps�� �� ��(appName) �߰�
	}
	
	void runApp(String appName) {
		System.out.println(appName + "�� �����մϴ�.");
	}
	
}
