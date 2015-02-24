package dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar();	// ���� ��ǻ�� �ð��� �������� �� Calendar ��ü ����
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal.getClass().getName());
		System.out.println(cal2.getClass().getName());
		
		int year = cal.get(Calendar.YEAR);			// ��
		int month = cal.get(Calendar.MONTH) + 1;	// �� (1��: 0, 2��: 1, 3��: 2, ...)
		int day = cal.get(Calendar.DAY_OF_MONTH);	// ��
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);	// ���� (��: 1, ��: 2, ȭ: 3, ..., ��: 7)
		
		System.out.println(year + "�� " + month + "�� " + day + "�� " + dayOfWeek);
		
		System.out.println(cal);
		
		cal.add(Calendar.WEEK_OF_YEAR, 30);
		
		System.out.println(cal);
	}
	
}
