package calendar1;

import java.util.Calendar;
import java.util.Date;



public class CalendarEx1 {

	public static void main(String[] args) {
		
		Date d = new Date(); // 현재 날짜와 시간을 반환함.
		System.out.println(d); // Fri Dec 01 11:40:58 KST 2023
		
		
		
		/////////////////////////////
		
		
		
		Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간이 담긴 달력을 반환함.
		System.out.println(cal); // java.util.GregorianCalendar[time=1701394153518,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=11,WEEK_OF_YEAR=48,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=335,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=29,SECOND=13,MILLISECOND=518,ZONE_OFFSET=32400000,DST_OFFSET=0]

		
		Date thisWhen = new Date(cal.getTimeInMillis()); 
		System.out.println(thisWhen); // Fri Dec 01 11:39:23 KST 2023
		
		int thisYear = cal.get(Calendar.YEAR);
		System.out.println(thisYear); // 2023
		
		int thisMonth = cal.get(Calendar.MONTH) + 1;  // 0 = 1월  
		System.out.println(thisMonth); // 12
		
		int thisDate = cal.get(Calendar.DATE);
		System.out.println(thisDate); // 1
		
		int maxDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(maxDate); // 31
		
		int thisDay = cal.get(Calendar.DAY_OF_WEEK);  // 1 = 일요일 
		System.out.println(thisDay); // 6 
		
		
		
		int thisHour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(thisHour); // 10
		
		int thisMinute = cal.get(Calendar.MINUTE);
		System.out.println(thisMinute); // 38
		
		int thisSecond = cal.get(Calendar.SECOND);
		System.out.println(thisSecond); // 52
		
		
		
		///////////////////////////////////////
		
		
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2002, 5, 11);
		cal2.set(Calendar.HOUR_OF_DAY, 13);
		cal2.set(Calendar.MINUTE, 30);
		cal2.set(Calendar.SECOND, 45);
		
		Date theWhen = new Date(cal2.getTimeInMillis()); 
		System.out.println(theWhen); // Tue Jun 11 13:30:45 KST 2002
		
		int theYear = cal2.get(Calendar.YEAR);
		System.out.println(theYear); // 2002
		
		int theMonth = cal2.get(Calendar.MONTH) + 1;  
		System.out.println(theMonth); // 6
		
		int theDate = cal2.get(Calendar.DATE);
		System.out.println(theDate); // 11
		
		
		
		int theHour = cal2.get(Calendar.HOUR_OF_DAY);
		System.out.println(theHour); // 13
		
		int theMinute = cal2.get(Calendar.MINUTE);
		System.out.println(theMinute); // 30
		
		int theSecond = cal2.get(Calendar.SECOND);
		System.out.println(theSecond); // 45
		
		
		
		///////////////////////////////////////
		
		
		
		Calendar cal3 = Calendar.getInstance();
				
		cal3.add(Calendar.YEAR, 2);
		int afterYear = cal3.get(Calendar.YEAR);
		System.out.println(afterYear); // 2025
				
				
		cal3.add(Calendar.YEAR, -2);
		int beforeYear = cal3.get(Calendar.YEAR);
		System.out.println(beforeYear); // 2023
		
		
		
	}

}
