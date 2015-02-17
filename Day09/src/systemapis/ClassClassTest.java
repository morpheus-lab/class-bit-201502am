package systemapis;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ClassClassTest {
	
	static Object newInstance(String className) throws Exception {
		Class c = Class.forName(className);
		return c.newInstance();
	}
	
	public static void main(String[] args) throws Exception {
		
		Class clazz;	// 클래스에 대한 정보를 갖고 있는 객체
		
//		Object obj = new String();
//		clazz = obj.getClass();	// obj 객체의 클래스 정보
		
		clazz = Class.forName("java.lang.Object");
		
		Object obj = clazz.newInstance();
		
		System.out.println(obj);
		
		System.out.println(clazz.getName());	// 클래스 이름 조회
		
		System.out.println("---- 메소드 정보 ----");
		
		// 메소드 정보 조회
		Method[] methods = clazz.getMethods();
		for (int i = 0; i < methods.length; i++) {
			String methodName = methods[i].getName();	// 메소드 이름
			System.out.println(methodName);
			
			Parameter[] params = methods[i].getParameters();	// 파라미터 배열
			for (int j = 0; j < params.length; j++) {
				String paramName = params[j].getName();	// 파라미터 이름
				Class paramType = params[j].getType();	// 파라미터 타입
				System.out.println("\t" + paramName + " : " + paramType);
			}
		}
		
		System.out.println("---- 필드 정보 ----");
		
		// 필드 정보 조회
		Field[] fields = clazz.getFields();
		for (int i = 0; i < fields.length; i++) {
			String fieldName = fields[i].getName();
			Class fieldType = fields[i].getType();
			
			System.out.println(fieldName + " : " + fieldType);
		}
		
	}
	
}






























