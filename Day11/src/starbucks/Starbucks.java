package starbucks;

public class Starbucks {
	
	public static void main(String[] args) {
		
		// 기본 음료, 에스프레소
		Beverage b = new Espresso();
//		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
		// 모카 시럽 추가
		b = new MochaSyrup(b);
//		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
		// 스팀 밀크 추가
		b = new SteamedMilk(b);
//		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
		// 휘핑 크림 추가
		b = new WhippingCream(b);
//		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
	}
	
}
