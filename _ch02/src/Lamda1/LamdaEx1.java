package Lamda1;

@FunctionalInterface
interface MyFunc {  // �Լ��� �������̽�
	public abstract int sum(int a, int b);
} 


public class LamdaEx1 {
	public static void main(String[] args) {
		
		MyFunc f1 = new MyFunc() { // �͸� ��ü�� �߻� �޼��� ����
			public int sum(int a, int b) { 
				return a + b; 
			} 
		}; 
		
		MyFunc f2 = (a, b) -> a + b; // ���ٽ����� �߻� �޼��� ����
		
		
		System.out.println(f1.sum(3, 5)); // 8
		System.out.println(f2.sum(3, 5)); // 8
		
		
	}
}
