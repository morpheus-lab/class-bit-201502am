
public class Employee {
	
	// ��� ���� (�ʵ�; fields), �ν��Ͻ� ����
	String name;
	String no;
	String dept;
	
	// ������ - new Ű����� �ν��Ͻ��� ������ ���� �ڵ� ȣ��Ǵ�
	//        Ư�� �޼ҵ�
	public Employee() {
		this("�̸�����", "�ӽû��", "�ӽúμ�");
		System.out.println("����(�Ķ����)���� ������ ȣ���!");
	}
	
	public Employee(String na, String n, String d) {
		name = na; no = n; dept = d;
		System.out.println("���� �� ��¥�� ������ ȣ���!");
	}
	
	// �޼ҵ�
	public void print() {
		System.out.println(name + ", " + no + ", " + dept);
	}
	
}










