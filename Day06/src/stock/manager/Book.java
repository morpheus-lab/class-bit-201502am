package stock.manager;

public class Book extends Item {
	
	// 상속받은 멤버 변수
	// String name;		// 이름
	// int quantity;	// 수량
	// String releaseDate;	// 출시일
	
	// 추가 멤버 변수
	private String publisher;	// 출판사
	private String author;		// 저자
	private String isbn;		// ISBN
	
	// 상속받은 멤버 메소드
	// public String getName()
	// public int getQuantity()
	// public String getReleaseDate()
	
	// 추가 멤버 메소드
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
