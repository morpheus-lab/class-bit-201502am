package stock.manager;

public class Multimedia extends Item {
	
	// ��ӹ��� ��� ����
	// �̸�, ����, �����
	
	// �߰� ��� ����
	protected String artist;	// ��Ƽ��Ʈ
	protected int playTime;		// ����ð� (�� ����)
	protected int mediaType;	// ��üŸ�� (0: CD, 1: DVD, 2: BR, 3: etc.)
	protected String genre;		// �帣
	
	// ��ӹ��� ��� �޼ҵ�
	// �̸�, ����, ������� Getter��
	
	// �߰� ��� �޼ҵ�
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
