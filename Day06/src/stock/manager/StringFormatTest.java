package stock.manager;

public class StringFormatTest {
	
	public static void main(String[] args) {
		
		String s = String.format("abcd %04d %d %s", 23, 5, "hello");
		
		
		System.out.println(s);
		
	}
	
}
