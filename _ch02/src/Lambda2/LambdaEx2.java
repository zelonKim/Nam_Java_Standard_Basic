package Lambda2;

interface FuncInter {
	void walk();
}


public class LambdaEx2 {

	static FuncInter getMyFunc() {
		return () -> System.out.println("f2�� �Ȱ� �ֽ��ϴ�.");
	}
	
	
	static void move(FuncInter f) {
		f.walk();
	}
	
	
	public static void main(String[] args) {
		FuncInter f1 = () -> System.out.println("f1�� �Ȱ� �ֽ��ϴ�.");
		
		FuncInter f2 = getMyFunc();
		
		
		FuncInter f3 = new FuncInter() {
			public void walk() {
				System.out.println("f3�� �Ȱ� �ֽ��ϴ�.");
			}
		};
		
		
		f1.walk(); // f1�� �Ȱ� �ֽ��ϴ�.
		
		f2.walk(); // f2�� �Ȱ� �ֽ��ϴ�.

		move(f3); // f3�� �Ȱ� �ֽ��ϴ�.
		
		
	}

}

