package interfaces;

public class Airplane extends Machine implements Flyer, Vehicle {

	@Override
	public void fly() {
		startEngine();
		accelEngine();
		System.out.println("Airplane.fly()");
	}

	@Override
	public boolean isAnimal() {
		return false;
	}

	@Override
	public void rideOn() {
		System.out.println("����⿡ �ö�Ž");
	}

	@Override
	public void getOff() {
		System.out.println("����⿡�� �پ� ����");
	}
	
	
	
}
