package stock.manager;

public class Movie extends Multimedia {
	
	// ��ӹ��� ��� ����
	// �̸�, ����, ����� - from Item
	// ��Ƽ��Ʈ, ����ð�, ��üŸ��, �帣 - from Multimedia
	
	// �߰� ��� ����
	private String[] actors;
	
	// ��ӹ��� ��� �޼ҵ�
	// �̸�, ����, ����� getters - from Item
	// ��Ƽ��Ʈ, ����ð�, ��üŸ��, �帣 getters - from Multimedia
	
	// �߰� ��� �޼ҵ�
	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}
	
}
