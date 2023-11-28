package inner3;

class Outer {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}


public class InnerEx3 {
	public static void main(String[] args) {
		Outer oc = new Outer(); // 외부 클래스 타입명   외부 참조변수명 = new 외부 클래스 생성자()
		Outer.InstanceInner ii = oc.new InstanceInner(); // 외부 클래스 타입명.인스턴스 내부 클래스 타입명    내부 참조변수명 = 외부 참조변수명.new 인스턴스 내부 클래스 생성자명()
		System.out.println(ii.iv); // 100
		
		Outer.StaticInner si = new Outer.StaticInner(); // 외부 클래스 타입명.스태틱 내부 클래스 타입명   내부 참조변수명 = new 외부 클래스 타입명.스태틱 내부 클래스 생성자명()
		System.out.println(si.iv); // 200
		System.out.println(si.cv); // 300

	}

}
