package stock.manager;

public class Item {
	
	// 멤버 변수
	protected String name;	// 이름
	protected int quantity;	// 수량
	protected String releaseDate;	// 출시일
	
	// 멤버 메소드
	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
}
