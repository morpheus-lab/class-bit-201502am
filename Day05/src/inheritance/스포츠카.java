package inheritance;

public class 스포츠카 extends 자동차 {
	
	void 뚜껑열기() {
		System.out.println("뚜껑을 엽니다~ 스르르륵~~~");
	}
	
	// 오버라이드(override)
	void 가속() {
		System.out.println("후륜구동으로 자동차를 가속시킵니다. 부르릉~");
	}
	
}
