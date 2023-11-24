
public class InitializationEx {

	int x;
	int y = x; // 정상 실행
	
	void method1() {
		int a;
		int b = a; // 에러 발생 (The local variable may not have been initialized)
	}
}
