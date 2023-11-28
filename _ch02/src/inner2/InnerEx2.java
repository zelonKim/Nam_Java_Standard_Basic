package inner2;

public class InnerEx2 {
	
	class InstanceInner {
		int iv1 = 100; // 인스턴스 변수 선언 가능
		// static int cv1 = 100; // 스태틱 변수 선언 불가
	}
	
	static class StaticInner {
		int iv2 = 200; // 인스턴스 변수 선언 가능
		static int cv2 = 200; // 스태틱 변수 선언 가능
	}
	
	void myMethod() {
		class LocalInner {
			int iv3 = 300; // 인스턴스 변수 선언 가능
			// static int cv3 = 300; // 스태틱 변수 선언 불가
		}
	}	
}	

///////////////////////


class Outer {
	private int outerIv = 0;
	private static int outerCv = 0;
	
	// 외부 클래스의 private 멤버이더라도 내부 클래스에서 접근 가능
	class InstanceInner { 
		int iiv = outerIv; 
		int iiv2 = outerCv; 
	}
	
	static class StaticInner {
		int siv = outerIv; // 에러 발생  // 스태틱 내부 클래스에서 외부 클래스의 인스턴스 변수에 접근 불가
		static int scv = outerCv;
	}


	void myMEthod() {
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
		}
	}
}




























	
