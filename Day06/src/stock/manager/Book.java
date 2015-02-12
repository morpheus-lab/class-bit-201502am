package stock.manager;

public class Book extends Item {
	
	// ��ӹ��� ��� ����
	// String name;		// �̸�
	// int quantity;	// ����
	// String releaseDate;	// �����
	
	// �߰� ��� ����
	private String publisher;	// ���ǻ�
	private String author;		// ����
	private String isbn;		// ISBN
	
	// ��ӹ��� ��� �޼ҵ�
	// public String getName()
	// public int getQuantity()
	// public String getReleaseDate()
	
	// �߰� ��� �޼ҵ�
	public String getPublisher() {
		return publisher;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
