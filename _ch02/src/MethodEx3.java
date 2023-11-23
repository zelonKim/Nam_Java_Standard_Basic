
class MyMath3 {
  long add(int a, long b) { return a + b; }
  long add(long a, int b) { return a + b; }
}


public class MethodEx3 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		mm.add(10, 20); // 에러 발생
		mm.add(10, 20L); // 정상 실행
		mm.add(10L, 20); // 정상 실행
		mm.add(10L, 20L); // 에러 발생
	}
}
