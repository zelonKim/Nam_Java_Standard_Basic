
class Parent { int x=100; }

class Child extends Parent {
	
	void method() {
		System.out.println(x); // 100
		System.out.println(this.x); // 100
		System.out.println(super.x); // 100
	}
}



public class superEx {
	public static void main(String[] args) {
		Child child = new Child();
		child.method();
	}

}
