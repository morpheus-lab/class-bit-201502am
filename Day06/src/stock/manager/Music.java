package stock.manager;

public class Music extends Multimedia {
	
	// Multimedia가 Item으로부터 상속받은 멤버 변수
	// 이름, 수량, 출시일
	
	// Multimedia로 부터 상속받는 멤버 변수
	// 아티스트, 재생시간, 매체타입, 장르
	
	/*
	void m() {
		this.name = "";
		this.quantity = 0;
		this.releaseDate = "2015-01-01";
		
		this.artist = "";
		this.playTime = 100;
		this.mediaType = 1;
		this.genre = "R&B";
	}
	*/
	
	// 추가 멤버 변수
	private String[] songs;	// 수록 곡 목록
	
	// 상속받은 멤버 메소드
	// Item의 getters
	// Multimedia의 getters
	
	// 추가 멤버 메소드
	public String[] getSongs() {
		return songs;
	}

	public void setSongs(String[] songs) {
		this.songs = songs;
	}
	
}
