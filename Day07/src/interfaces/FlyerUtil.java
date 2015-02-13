package interfaces;

public class FlyerUtil {
	
	public void makeToFly(Flyer f) {
		// 객체가 Flyer에 정의되어 있는 fly()와 isAnimal()만 갖고 있으면 됨.
		f.fly();
		System.out.println("동물? " + f.isAnimal());
	}
	
}
