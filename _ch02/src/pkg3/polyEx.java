package pkg3;

class Tv {
	boolean onOff;
	int channel;
	void power() { onOff =!onOff; }
	void chUp()  { ++channel; }
	
	void tvOn(Tv tv) {
		if (tv instanceof Tv) {
			System.out.println("Tv works");
		}
	}
}



class SmartTv extends Tv {  // ���
	void speakNarration() {
			System.out.println("Hello, How are you.");
		}
	
	void smartTvOn(Tv tv) {
		if (tv instanceof SmartTv) {
			System.out.println("smartTv works");
		}
	}
}




public class polyEx {
	public static void main(String[] args) {
	/*
		Tv tv = new Tv();
		SmartTv stv = (SmartTv)tv;  // ���� �߻� // java.lang.ClassCastException: Tv cannot be cast to SmartTv
       // �ڽ� Ÿ���� ���� �����δ� �θ� Ÿ���� ��ü�� �ٷ� �� ����. 
*/
/*
		SmartTv stv = new SmartTv();
		Tv tv = (Tv)stv; // ���� ����
		// �θ� Ÿ���� ���������� �ڽ� Ÿ���� ��ü�� �ٷ� �� ����.
*/
		
		
/*
		Tv tv = null;
		SmartTv stv = new SmartTv();
		SmartTv stv2 = null;
		
		
		tv = stv; // �θ� Ŭ���� Ÿ���� Tv�� �ڵ� ����ȯ ��.
	 	tv.speakNarration(); // ���� �߻�  // The method speakNarration() is undefined for the type Tv
		
		stv2 = (SmartTv)tv; // �ڽ� Ŭ���� Ÿ���� SmartTv���� ���� ����ȯ ��.
		stv2.speakNarration(); // ���� ����
*/
		

/*
		Tv tv = new Tv();
		SmartTv stv = new SmartTv();

		System.out.println(tv instanceof Tv); // true
		System.out.println(stv instanceof Tv); // true

		System.out.println(tv instanceof SmartTv); // false
		System.out.println(stv instanceof SmartTv); // true
		
		
		 tv.tvOn(tv);  // Tv works
		 tv.tvOn(stv); // Tv works
		
		 stv.smartTvOn(tv); // �ƹ��͵� ��� �ȵ�.
		 stv.smartTvOn(stv); // smartTv works
*/
	}
}
