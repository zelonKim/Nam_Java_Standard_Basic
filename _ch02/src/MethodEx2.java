class MyMath2 {
	int a, b;
	
	int add1() {
		return a + b; // 인스턴스 변수 사용
	}

	static int add2(int a, int b) { 
		return a + b; // 지역 변수 사용
	}
}



public class MethodEx2 {
	public static void main(String[] args) {
				
		MyMath2 mm = new MyMath2();
		mm.a = 100;
		mm.b = 200;
		System.out.println(mm.add1()); // 300 // 인스턴스 메서드 호출
		
		System.out.println(MyMath2.add2(100, 200)); // 300 // 클래스 메서드 호출
	}
}
