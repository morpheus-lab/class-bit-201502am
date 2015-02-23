package collections.list;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		Vector v = new Vector(10);	// 초기용량: 10
		
		System.out.println("용량: " + v.capacity());	// 벡터의 용량 조회
		System.out.println("데이터 크기: " + v.size());	// 벡터에 저장된 데이터 개수
		
		v.addElement("1");
		v.addElement("2");
		
		System.out.println("용량: " + v.capacity());	// 벡터의 용량 조회
		System.out.println("데이터 크기: " + v.size());	// 벡터에 저장된 데이터 개수
		
		System.out.println(v);
		
		v.insertElementAt("3", 1);
		
		System.out.println("용량: " + v.capacity());	// 벡터의 용량 조회
		System.out.println("데이터 크기: " + v.size());	// 벡터에 저장된 데이터 개수
		
		System.out.println(v);
		
		System.out.println();
		
		// a부터 순서대로 10개의 문자 객체를 저장
		for (int i = 0; i < 10; i++) {
//			Character c = new Character((char)('a' + i));
//			v.addElement(c);
			
			v.addElement((char)('a' + i));	// => char 데이터가 자동으로 Wrapper 객체인 Character 객체로 변환되어 저장됨
			
			System.out.println(v);
			
			System.out.println("용량: " + v.capacity());	// 벡터의 용량 조회
			System.out.println("데이터 크기: " + v.size());	// 벡터에 저장된 데이터 개수
			
			System.out.println();
		}
		
		// 개체참조 (저장 데이터 조회)
		// 인덱스로 개체 참조 (조회)
		Object data = v.elementAt(7);
		Character ch = (Character) data;	// 벡터 elementAt 메소드는 기본적으로 Object 타입으로 반환
											// 적당한 타입으로 다시 형변환을 해서 사용
		System.out.println(data);
		
		data = v.elementAt(9);
		System.out.println(data);
		
		// 객체로 인덱스 번호 조회
		int index = v.indexOf(new Character('a'));
		System.out.println(index);
		
		// 개체 삭제	=> remove 메소드
		v.remove(0);	// 인덱스로 개체 삭제
		System.out.println(v);
		
		v.remove(1);
		System.out.println(v);
		
		v.remove(data);		// 참조값으로 개체 삭제
		// data 객체는 'g' Character 객체
		System.out.println(v);
		
		
		// 객체 존재 조회
		boolean exists3 = v.contains("3");
		System.out.println("v.containts(\"3\") = " + exists3);
		
		System.out.println("v.containts(\"2\") = " + v.contains("2"));
		
		System.out.println();
		
		// 벡터 v와 같은 데이터를 갖고 있는 벡터 객체 복사
		Vector v2 = (Vector) v.clone();
		System.out.println("벡터 객체 복사 완료");
		
		System.out.println("v  = " + v);
		System.out.println("v2 = " + v2);
		System.out.println("v == v2: " + (v == v2)); // v와 v2가 다른 객체임을 알 수 있음
	}
	
}































