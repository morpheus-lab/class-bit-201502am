package stock.manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Item> itemList = new ArrayList<Item>();
	
//	static ArrayList<Book> bookList = new ArrayList<Book>();
	
	public static void main(String[] args) {
		
//		Item item = new Item();
//		bookList.add((Book) item);	// item�� Book ��ü���� �����ϸ�..
		
		
		Scanner sc = new Scanner(System.in);	// System.in(ǥ�� �Է� ��ġ: Ű����)�κ���
												// �����͸� �д� ��ü
		
		// ȯ�� �޽��� ���
		System.out.println("==============================");
		System.out.println("        Stock Manager");
		System.out.println("==============================");
		
		boolean isRunning = true;
		
		while (isRunning) {
			
			// �޴� ���
			System.out.println("[ ���� �޴� ]");
			System.out.println("  1. ��ȸ");
			System.out.println("  2. ���");
			System.out.println("  3. ����");
			System.out.println("  4. ����");
			System.out.println("  5. ����");
			
			System.out.print("�޴�: ");
			
			// ����ڷκ��� �޴� ������ �Է� �ޱ�
			int menu = sc.nextInt();	// Ű����� �Է��� ���ڸ� int Ÿ������ �о����
			
			// menu�� ���� ���� �ٸ� �۾�
			switch (menu) {
			case 1:
				// ��ȸ ���� �۾�
				// ȭ�鿡 itemList ������ ������
				
				System.out.println();
				System.out.println("-------------------------------------");
				System.out.println("��ȣ    ����    ����");
				System.out.println("-------------------------------------");
				
				for (int i = 0; i < itemList.size(); i++) {
					Item item = itemList.get(i);
					
					String itemType = "";
					if (item instanceof Book) {
						itemType = "����";
					}
					else if (item instanceof Music) {
						itemType = "����";
					}
					else if (item instanceof Movie) {
						itemType = "��ȭ";
					}
					
					System.out.println(String.format("%4d    %s    %s", i, itemType, item.getName()));
				}
				
				System.out.println("-------------------------------------");
				System.out.println();
				
				break;
			case 2:
				sc.nextLine();	// ���ۿ� �����ִ� �ٹٲ� ���ڸ� �о ����
				
				// ��� ���� �۾�
				// itemList�� ���ο� Item ��ü �߰�
				// ����ڷκ��� �����͸� �Է� �ް�
				// �� �����͸� ������� ��ü �����
				// ��ü�� itemList�� �߰�
				
				System.out.print("����� ������ ���� (1: ����, 2: ����, 3: ��ȭ): ");
				int itemType = sc.nextInt();
				sc.nextLine();	// �Է� ���ۿ� �������� �ٹٲ� ���� �о ����
				
				switch (itemType) {
				case 1:	// ���� ���
					System.out.print("����  : ");
					String title = sc.nextLine();
					
					System.out.print("���ǻ�: ");
					String publisher = sc.nextLine();
					
					System.out.print("����  : ");
					String author = sc.nextLine();
					
					System.out.print("ISBN  : ");
					String isbn = sc.nextLine();
					
					// �� �Է� �����ͷ� Book ��ü �����
					Book book = new Book();
					book.setName(title);
					book.setPublisher(publisher);
					book.setAuthor(author);
					book.setIsbn(isbn);
					
					itemList.add(book);	// itemList�� Book ��ü ����
					
					break;
				case 2:	// ���� ���
					System.out.print("����             : ");
					title = sc.nextLine();
					
					System.out.print("��Ƽ��Ʈ         : ");
					String artist = sc.nextLine();
					
					System.out.print("����ð�(��)     : ");
					int playTime = sc.nextInt();
					sc.nextLine();	// �Է� ���� ����
					
					System.out.print("�帣             : ");
					String genre = sc.nextLine();
					
					System.out.print("�� ���(/�� ����): ");
					String songList = sc.nextLine();		// "a/b/c"
					String[] songs = songList.split("/");	// songs[0] = "a";
															// songs[1] = "b";
															// songs[2] = "c";
					// �Է� �����ͷ� Music ��ü ����
					Music music = new Music();
					music.setName(title);
					music.setArtist(artist);
					music.setPlayTime(playTime);
					music.setGenre(genre);
					music.setSongs(songs);
					
					// Music ��ü ����
					itemList.add(music);
					
					break;
				case 3:
					break;
				}
				
				
				System.out.println("�����Ͽ����ϴ�.");
				
				break;
			case 3:
				// ���� ���� �۾�
				System.out.println("�����ߴ�ġ��...");
				break;
			case 4:
				// ���� ���� �۾�
				System.out.println("�����ߴ�Ĩ�ô�..");
				break;
			case 5:
				// ���� �۾�
				System.out.println("���α׷��� �����մϴ�.");
				isRunning = false;
				break;
			default:
				System.out.println("��?");
				break;
			}
			
		}
		
	}
	
}
