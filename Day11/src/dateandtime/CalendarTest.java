package dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar();	// 현재 컴퓨터 시간을 기준으로 한 Calendar 객체 생성
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal.getClass().getName());
		System.out.println(cal2.getClass().getName());
		
		int year = cal.get(Calendar.YEAR);			// 년
		int month = cal.get(Calendar.MONTH) + 1;	// 월 (1월: 0, 2월: 1, 3월: 2, ...)
		int day = cal.get(Calendar.DAY_OF_MONTH);	// 일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);	// 요일 (일: 1, 월: 2, 화: 3, ..., 토: 7)
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + dayOfWeek);
		
		System.out.println(cal);
		
		cal.add(Calendar.WEEK_OF_YEAR, 30);
		
		System.out.println(cal);
	}
	
}
