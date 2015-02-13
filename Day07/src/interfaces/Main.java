package interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		Airplane a = new Airplane();
		
		FlyerUtil fu = new FlyerUtil();
		
		fu.makeToFly(a);	// Airplane 객체를 Flyer 타입으로 사용
		
//		fu.makeToFly(new Bird());
		
		
		
		
		Vehicle v = a;	// Airplane 객체를 Vehicle 타입으로 사용
		
		v.rideOn();
		
		v.getOff();
		
	}
	
}
