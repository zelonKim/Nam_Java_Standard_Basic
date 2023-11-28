package inner1;
/*

class A {
	int i = 100;
}


class B {
	void method() {
		A a = new A();
		System.out.println(a.i); 
	}
}


class C {
	B b = new B(); // 정상 실행
}


public class InnerEx1 {
	public static void main(String[] args) {
		B b = new B(); // 정상 실행
		b.method(); // 100
	}
}
*/


////////////////////////////////////



class A {
	int i = 100;
	B b = new B();
	
	class B {
		void method() {
			System.out.println(i);
		}
	}
	
}



class C {
	//B b = new B(); // 에러 발생
}


public class InnerEx1 {
	public static void main(String[] args) {
		// B b = new B(); // 에러 발생
		// b.method();
		
		A a = new A(); // 정상 실행
		a.b.method();  // 100
	}
}