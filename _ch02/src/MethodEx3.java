
class MyMath3 {
  long add(int a, long b) { return a + b; }
  long add(long a, int b) { return a + b; }
}


public class MethodEx3 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		mm.add(10, 20); // ���� �߻�
		mm.add(10, 20L); // ���� ����
		mm.add(10L, 20); // ���� ����
		mm.add(10L, 20L); // ���� �߻�
	}
}
