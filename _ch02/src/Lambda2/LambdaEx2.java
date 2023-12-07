package Lambda2;

interface FuncInter {
	void walk();
}


public class LambdaEx2 {

	static FuncInter getMyFunc() {
		return () -> System.out.println("f2가 걷고 있습니다.");
	}
	
	
	static void move(FuncInter f) {
		f.walk();
	}
	
	
	public static void main(String[] args) {
		FuncInter f1 = () -> System.out.println("f1이 걷고 있습니다.");
		
		FuncInter f2 = getMyFunc();
		
		
		FuncInter f3 = new FuncInter() {
			public void walk() {
				System.out.println("f3이 걷고 있습니다.");
			}
		};
		
		
		f1.walk(); // f1이 걷고 있습니다.
		
		f2.walk(); // f2가 걷고 있습니다.

		move(f3); // f3이 걷고 있습니다.
		
		
	}

}

