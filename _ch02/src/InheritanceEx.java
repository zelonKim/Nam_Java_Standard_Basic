class Tv {
	boolean onOff;
	int channel;
	
	void power() { onOff =!onOff; }
	void chUp()  { ++channel; }
}



class smartTv extends Tv {
	boolean narration;
	
	void speakNarration(String text) {
		if(narration) {
			System.out.println(text);
		}
	}
}



public class InheritanceEx {
	public static void main(String[] args) {
		smartTv stv = new smartTv();
		
		stv.channel = 10;
		stv.chUp();
		System.out.println(stv.channel); 
		
		stv.speakNarration("æ»≥Á«œººø‰");
		stv.narration = true;
		stv.speakNarration("π›∞©Ω¿¥œ¥Ÿ");
	}
}
