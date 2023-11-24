class Time {
	private int hour; // 해당 클래스 외부에서 데이터에 직접 접근하는 것을 막음.
	private int minute;
	private int second;
	
	public void setHour(int hour) { // 해당 클래스 외부에서 데이터에 간접 접근만 가능하도록 함.
		if (hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public void getHour() { System.out.println(hour); }
}
	
	


public class TimeTest {
	public static void main(String[] args) {
			Time time = new Time();
			//time.hour = 10; // 에러 발생 
			
			time.setHour(10);
			time.getHour(); // 10
		}
}


