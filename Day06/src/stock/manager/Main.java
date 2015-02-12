package stock.manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Item> itemList = new ArrayList<Item>();
	
//	static ArrayList<Book> bookList = new ArrayList<Book>();
	
	public static void main(String[] args) {
		
//		Item item = new Item();
//		bookList.add((Book) item);	// item이 Book 객체임을 보증하마..
		
		
		Scanner sc = new Scanner(System.in);	// System.in(표준 입력 장치: 키보드)로부터
												// 데이터를 읽는 객체
		
		// 환영 메시지 출력
		System.out.println("==============================");
		System.out.println("        Stock Manager");
		System.out.println("==============================");
		
		boolean isRunning = true;
		
		while (isRunning) {
			
			// 메뉴 출력
			System.out.println("[ 메인 메뉴 ]");
			System.out.println("  1. 조회");
			System.out.println("  2. 등록");
			System.out.println("  3. 수정");
			System.out.println("  4. 삭제");
			System.out.println("  5. 종료");
			
			System.out.print("메뉴: ");
			
			// 사용자로부터 메뉴 선택을 입력 받기
			int menu = sc.nextInt();	// 키보드로 입력한 문자를 int 타입으로 읽어들임
			
			// menu에 따라 각기 다른 작업
			switch (menu) {
			case 1:
				// 조회 관련 작업
				// 화면에 itemList 내용을 보여줌
				
				System.out.println();
				System.out.println("-------------------------------------");
				System.out.println("번호    구분    제목");
				System.out.println("-------------------------------------");
				
				for (int i = 0; i < itemList.size(); i++) {
					Item item = itemList.get(i);
					
					String itemType = "";
					if (item instanceof Book) {
						itemType = "서적";
					}
					else if (item instanceof Music) {
						itemType = "음반";
					}
					else if (item instanceof Movie) {
						itemType = "영화";
					}
					
					System.out.println(String.format("%4d    %s    %s", i, itemType, item.getName()));
				}
				
				System.out.println("-------------------------------------");
				System.out.println();
				
				break;
			case 2:
				sc.nextLine();	// 버퍼에 남아있는 줄바꿈 문자를 읽어서 없앰
				
				// 등록 관련 작업
				// itemList에 새로운 Item 객체 추가
				// 사용자로부터 데이터를 입력 받고
				// 그 데이터를 기반으로 객체 만들고
				// 객체를 itemList에 추가
				
				System.out.print("등록할 아이템 종류 (1: 서적, 2: 음반, 3: 영화): ");
				int itemType = sc.nextInt();
				sc.nextLine();	// 입력 버퍼에 남아있을 줄바꿈 문자 읽어서 없앰
				
				switch (itemType) {
				case 1:	// 서적 등록
					System.out.print("제목  : ");
					String title = sc.nextLine();
					
					System.out.print("출판사: ");
					String publisher = sc.nextLine();
					
					System.out.print("저자  : ");
					String author = sc.nextLine();
					
					System.out.print("ISBN  : ");
					String isbn = sc.nextLine();
					
					// 위 입력 데이터로 Book 객체 만들기
					Book book = new Book();
					book.setName(title);
					book.setPublisher(publisher);
					book.setAuthor(author);
					book.setIsbn(isbn);
					
					itemList.add(book);	// itemList에 Book 객체 저장
					
					break;
				case 2:	// 음반 등록
					System.out.print("제목             : ");
					title = sc.nextLine();
					
					System.out.print("아티스트         : ");
					String artist = sc.nextLine();
					
					System.out.print("재생시간(초)     : ");
					int playTime = sc.nextInt();
					sc.nextLine();	// 입력 버퍼 비우기
					
					System.out.print("장르             : ");
					String genre = sc.nextLine();
					
					System.out.print("곡 목록(/로 구분): ");
					String songList = sc.nextLine();		// "a/b/c"
					String[] songs = songList.split("/");	// songs[0] = "a";
															// songs[1] = "b";
															// songs[2] = "c";
					// 입력 데이터로 Music 객체 생성
					Music music = new Music();
					music.setName(title);
					music.setArtist(artist);
					music.setPlayTime(playTime);
					music.setGenre(genre);
					music.setSongs(songs);
					
					// Music 객체 저장
					itemList.add(music);
					
					break;
				case 3:
					break;
				}
				
				
				System.out.println("저장하였습니다.");
				
				break;
			case 3:
				// 수정 관련 작업
				System.out.println("수정했다치고...");
				break;
			case 4:
				// 삭제 관련 작업
				System.out.println("삭제했다칩시다..");
				break;
			case 5:
				// 종료 작업
				System.out.println("프로그램을 종료합니다.");
				isRunning = false;
				break;
			default:
				System.out.println("읭?");
				break;
			}
			
		}
		
	}
	
}
