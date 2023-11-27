package poly1;

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



class SmartTv extends Tv {  // 상속
	void speakNarration() {
			System.out.println("Hello, How are you.");
		}
	
	void smartTvOn(Tv tv) {
		if (tv instanceof SmartTv) {
			System.out.println("smartTv works");
		}
	}
}




public class polyEx1 {
	public static void main(String[] args) {
	/*
		Tv tv = new Tv();
		SmartTv stv = (SmartTv)tv;  // 에러 발생 // java.lang.ClassCastException: Tv cannot be cast to SmartTv
       // 자식 타입의 참조 변수로는 부모 타입의 객체를 다룰 수 없음. 
*/
/*
		SmartTv stv = new SmartTv();
		Tv tv = (Tv)stv; // 정상 실행
		// 부모 타입의 참조변수로 자식 타입의 객체를 다룰 수 있음.
*/
		
		
/*
		Tv tv = null;
		SmartTv stv = new SmartTv();
		SmartTv stv2 = null;
		
		
		tv = stv; // 부모 클래스 타입인 Tv로 자동 형변환 됨.
	 	tv.speakNarration(); // 에러 발생  // The method speakNarration() is undefined for the type Tv
		
		stv2 = (SmartTv)tv; // 자식 클래스 타입인 SmartTv으로 수동 형변환 함.
		stv2.speakNarration(); // 정상 실행
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
		
		 stv.smartTvOn(tv); // 아무것도 출력 안됨.
		 stv.smartTvOn(stv); // smartTv works
*/
	}
}
