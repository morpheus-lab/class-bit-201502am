package stock.manager;

public class Music extends Multimedia {
	
	// Multimedia�� Item���κ��� ��ӹ��� ��� ����
	// �̸�, ����, �����
	
	// Multimedia�� ���� ��ӹ޴� ��� ����
	// ��Ƽ��Ʈ, ����ð�, ��üŸ��, �帣
	
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
	
	// �߰� ��� ����
	private String[] songs;	// ���� �� ���
	
	// ��ӹ��� ��� �޼ҵ�
	// Item�� getters
	// Multimedia�� getters
	
	// �߰� ��� �޼ҵ�
	public String[] getSongs() {
		return songs;
	}

	public void setSongs(String[] songs) {
		this.songs = songs;
	}
	
}
