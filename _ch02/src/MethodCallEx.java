public class MethodCallEx {
	void instanceMethod1() {}
	static void staticMethod1() {}
	
	void instanceMethod2() {
		instanceMethod1(); // ���� ����
		staticMethod1(); // ���� ����
	}
	
	static void staticMethod2() {
		instanceMethod1(); // ���� �߻�
		staticMethod1(); // ���� ����
	}
}
