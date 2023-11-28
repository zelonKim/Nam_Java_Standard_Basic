package interface3;
/*
// 인터페이스를 사용하지 않을 경우 
 
class A {
	public void method(B b) { 
		b.method();
	}
}


class B {
	public void method() {
		System.out.println("B클래스의 메서드가 호출되었습니다.");
	}
}


public class InterEx3 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); 
	}
}
// B클래스의 메서드가 호출되었습니다.
*/

/////////////////////


/*
class A {
	public void method(C b) { // 매개변수 타입도 C클래스로 변경해줘야 함.
		b.method();
	}
}

class B {
	public void method() {
		System.out.println("B클래스의 메서드가 호출되었습니다.");
	}
}

class C {
	public void method() {
		System.out.println("C클래스의 메서드가 호출되었습니다.");
	}
}

public class InterEx3 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); // 인수를 C클래스 객체로 변경함.
	}
}
// C클래스의 메서드가 호출되었습니다.
*/




/////////////////////////////////////////////////////





// 인터페이스를 사용할 경우
/*
class A {
	public void method(I i) { 
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드가 호출되었습니다.");
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드가 호출되었습니다.");
	}
}

public class InterEx3 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B());
	}
}
// B클래스의 메서드가 호출되었습니다.
*/

/////////////////////

/*
class A {
	public void method(I i) { // 매개변수 타입을 변경하지 않아도 됨.
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드가 호출되었습니다.");
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드가 호출되었습니다.");
	}
}

public class InterEx3 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); // 인수를 C클래스 객체로 변경함.
	}
}
// C클래스의 메서드가 호출되었습니다.
*/





///////////////////////////////////////////////////////////





/*
abstract class GroundUnit {
	abstract void walk();
}

class Marine extends GroundUnit { void walk(){ System.out.println("마린이 지상에서 움직입니다."); } }

class Tank extends GroundUnit { void walk(){ System.out.println("탱크가 지상에서 움직입니다."); } }

class Vulture extends GroundUnit { void walk(){ System.out.println("벌쳐가 지상에서 움직입니다/"); } }



abstract class AirUnit {
	abstract void fly();
}

class Dropship extends AirUnit { void fly(){ System.out.println("드랍쉽이 공중에서 움직입니다."); } }


public class InterEx3 {
	public static void main(String[] args) {
		Marine m = new Marine();
		m.walk(); // 마린이 지상에서 움직입니다.
		
		Dropship d = new Dropship();
		d.fly(); // 드랍쉽이 공중에서 움직입니다.
	}
}
*/

//////////////////////////



interface Repairable { 
	public abstract void repair(int rep); 
}


abstract class GroundUnit {
	abstract void walk();
}


class Marine extends GroundUnit { void walk(){ System.out.println("마린이 지상에서 움직입니다."); } } 


class Tank extends GroundUnit implements Repairable { 
	void walk(){ System.out.println("탱크가 지상에서 움직입니다."); }
	public void repair(int rep) { System.out.println("탱크의 HP를"+rep+"만큼 수리합니다."); }
}


class Vulture extends GroundUnit implements Repairable { 
	void walk(){ System.out.println("벌쳐가 지상에서 움직입니다/"); } 
	public void repair(int rep) { System.out.println("벌쳐의 HP를"+rep+"만큼 수리합니다."); }
}



abstract class AirUnit {
	abstract void fly();
}

class Dropship extends AirUnit implements Repairable {  
	void fly(){ System.out.println("드랍쉽이 공중에서 움직입니다."); } 
	public void repair(int rep) { System.out.println("드랍쉽의 HP를 "+rep+"만큼 수리합니다."); }
}



public class InterEx3 {
	public static void main(String[] args) {
		Marine m = new Marine();
		//m.repair(); // 에러 발생 // The method repair() is undefined for the type Marine
		
		Dropship d = new Dropship();
		d.repair(50); // 정상실행  // 드랍쉽의 HP를 50만큼 수리합니다.
	}
}



















