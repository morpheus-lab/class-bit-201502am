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
		
		Class clazz;	// Ŭ������ ���� ������ ���� �ִ� ��ü
		
//		Object obj = new String();
//		clazz = obj.getClass();	// obj ��ü�� Ŭ���� ����
		
		clazz = Class.forName("java.lang.Object");
		
		Object obj = clazz.newInstance();
		
		System.out.println(obj);
		
		System.out.println(clazz.getName());	// Ŭ���� �̸� ��ȸ
		
		System.out.println("---- �޼ҵ� ���� ----");
		
		// �޼ҵ� ���� ��ȸ
		Method[] methods = clazz.getMethods();
		for (int i = 0; i < methods.length; i++) {
			String methodName = methods[i].getName();	// �޼ҵ� �̸�
			System.out.println(methodName);
			
			Parameter[] params = methods[i].getParameters();	// �Ķ���� �迭
			for (int j = 0; j < params.length; j++) {
				String paramName = params[j].getName();	// �Ķ���� �̸�
				Class paramType = params[j].getType();	// �Ķ���� Ÿ��
				System.out.println("\t" + paramName + " : " + paramType);
			}
		}
		
		System.out.println("---- �ʵ� ���� ----");
		
		// �ʵ� ���� ��ȸ
		Field[] fields = clazz.getFields();
		for (int i = 0; i < fields.length; i++) {
			String fieldName = fields[i].getName();
			Class fieldType = fields[i].getType();
			
			System.out.println(fieldName + " : " + fieldType);
		}
		
	}
	
}






























