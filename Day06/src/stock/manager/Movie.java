package stock.manager;

public class Movie extends Multimedia {
	
	// 상속받은 멤버 변수
	// 이름, 수량, 출시일 - from Item
	// 아티스트, 재생시간, 매체타입, 장르 - from Multimedia
	
	// 추가 멤버 변수
	private String[] actors;
	
	// 상속받은 멤버 메소드
	// 이름, 수량, 출시일 getters - from Item
	// 아티스트, 재생시간, 매체타입, 장르 getters - from Multimedia
	
	// 추가 멤버 메소드
	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}
	
}
