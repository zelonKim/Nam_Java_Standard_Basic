public class MethodCallEx {
	void instanceMethod1() {}
	static void staticMethod1() {}
	
	void instanceMethod2() {
		instanceMethod1(); // 정상 실행
		staticMethod1(); // 정상 실행
	}
	
	static void staticMethod2() {
		instanceMethod1(); // 에러 발생
		staticMethod1(); // 정상 실행
	}
}
