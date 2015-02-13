package interfaces;

public class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("³¯°³Áþ...");
	}

	@Override
	public boolean isAnimal() {
		return true;
	}

}
