package interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		Airplane a = new Airplane();
		
		FlyerUtil fu = new FlyerUtil();
		
		fu.makeToFly(a);	// Airplane ��ü�� Flyer Ÿ������ ���
		
//		fu.makeToFly(new Bird());
		
		
		
		
		Vehicle v = a;	// Airplane ��ü�� Vehicle Ÿ������ ���
		
		v.rideOn();
		
		v.getOff();
		
	}
	
}
