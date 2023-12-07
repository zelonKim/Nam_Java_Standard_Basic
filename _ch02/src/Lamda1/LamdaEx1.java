package Lamda1;

@FunctionalInterface
interface MyFunc {  // 함수형 인터페이스
	public abstract int sum(int a, int b);
} 


public class LamdaEx1 {
	public static void main(String[] args) {
		
		MyFunc f1 = new MyFunc() { // 익명 객체로 추상 메서드 구현
			public int sum(int a, int b) { 
				return a + b; 
			} 
		}; 
		
		MyFunc f2 = (a, b) -> a + b; // 람다식으로 추상 메서드 구현
		
		
		System.out.println(f1.sum(3, 5)); // 8
		System.out.println(f2.sum(3, 5)); // 8
		
		
	}
}
