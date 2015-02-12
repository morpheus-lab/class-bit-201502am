package stock.manager;

public class Multimedia extends Item {
	
	// 상속받은 멤버 변수
	// 이름, 수량, 출시일
	
	// 추가 멤버 변수
	protected String artist;	// 아티스트
	protected int playTime;		// 재생시간 (초 단위)
	protected int mediaType;	// 매체타입 (0: CD, 1: DVD, 2: BR, 3: etc.)
	protected String genre;		// 장르
	
	// 상속받은 멤버 메소드
	// 이름, 수량, 출시일의 Getter들
	
	// 추가 멤버 메소드
	public String getArtist() {
		return artist;
	}
	
	public int getPlayTime() {
		return playTime;
	}
	
	public int getMediaType() {
		return mediaType;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public void setMediaType(int mediaType) {
		this.mediaType = mediaType;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
