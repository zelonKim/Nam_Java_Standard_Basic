class Time {
	private int hour; // �ش� Ŭ���� �ܺο��� �����Ϳ� ���� �����ϴ� ���� ����.
	private int minute;
	private int second;
	
	public void setHour(int hour) { // �ش� Ŭ���� �ܺο��� �����Ϳ� ���� ���ٸ� �����ϵ��� ��.
		if (hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public void getHour() { System.out.println(hour); }
}
	
	


public class TimeTest {
	public static void main(String[] args) {
			Time time = new Time();
			//time.hour = 10; // ���� �߻� 
			
			time.setHour(10);
			time.getHour(); // 10
		}
}


