
public class InitializationEx {

	int x;
	int y = x; // ���� ����
	
	void method1() {
		int a;
		int b = a; // ���� �߻� (The local variable may not have been initialized)
	}
}
