package interfaces;

public class FlyerUtil {
	
	public void makeToFly(Flyer f) {
		// ��ü�� Flyer�� ���ǵǾ� �ִ� fly()�� isAnimal()�� ���� ������ ��.
		f.fly();
		System.out.println("����? " + f.isAnimal());
	}
	
}
