package stock.manager;

public class Item {
	
	// ��� ����
	protected String name;	// �̸�
	protected int quantity;	// ����
	protected String releaseDate;	// �����
	
	// ��� �޼ҵ�
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
