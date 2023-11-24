package pkg2;
class Time {
	private int hour; // 해당 클래스 외부에서 데이터에 직접 접근하는 것을 막음.
	private int minute;
	private int second;
	
	public int getHour() { return hour; }
	
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) return;
		this.hour = hour;
	
}
	
	
public class TimeTest {
	public static void main(String[] args) {
			Time time = new Time();
			//time.hour = 10; // 에러 발생 
			time.setHour(10);
			time.getHour();
		}
}


