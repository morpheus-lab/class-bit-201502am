package interfaces;

public class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("������...");
	}

	@Override
	public boolean isAnimal() {
		return true;
	}

}
