class MyMath2 {
	int a, b;
	
	int add1() {
		return a + b; // �ν��Ͻ� ���� ���
	}

	static int add2(int a, int b) { 
		return a + b; // ���� ���� ���
	}
}



public class MethodEx2 {
	public static void main(String[] args) {
				
		MyMath2 mm = new MyMath2();
		mm.a = 100;
		mm.b = 200;
		System.out.println(mm.add1()); // 300 // �ν��Ͻ� �޼��� ȣ��
		
		System.out.println(MyMath2.add2(100, 200)); // 300 // Ŭ���� �޼��� ȣ��
	}
}
