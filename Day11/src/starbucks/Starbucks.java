package starbucks;

public class Starbucks {
	
	public static void main(String[] args) {
		
		// �⺻ ����, ����������
		Beverage b = new Espresso();
//		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
		// ��ī �÷� �߰�
		b = new MochaSyrup(b);
//		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
		// ���� ��ũ �߰�
		b = new SteamedMilk(b);
//		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
		// ���� ũ�� �߰�
		b = new WhippingCream(b);
//		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
	}
	
}
