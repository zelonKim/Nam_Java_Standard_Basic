class Tv {
	int channel;
	boolean onOff;
	
	void channelUp() { ++channel; }
	void channelDown() { --channel;}
	void power() { onOff = !onOff; }
	
}


public class ClassEx {
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		tv.channel = 9;
		tv.channelDown();
		System.out.println(tv.channel); // 8
		
		tv.onOff = true;
		tv.power();
		System.out.println(tv.onOff); // false
	}
}











