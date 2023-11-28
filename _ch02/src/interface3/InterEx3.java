package interface3;
/*
// �������̽��� ������� ���� ��� 
 
class A {
	public void method(B b) { 
		b.method();
	}
}


class B {
	public void method() {
		System.out.println("BŬ������ �޼��尡 ȣ��Ǿ����ϴ�.");
	}
}


public class InterEx3 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); 
	}
}
// BŬ������ �޼��尡 ȣ��Ǿ����ϴ�.
*/

/////////////////////


/*
class A {
	public void method(C b) { // �Ű����� Ÿ�Ե� CŬ������ ��������� ��.
		b.method();
	}
}

class B {
	public void method() {
		System.out.println("BŬ������ �޼��尡 ȣ��Ǿ����ϴ�.");
	}
}

class C {
	public void method() {
		System.out.println("CŬ������ �޼��尡 ȣ��Ǿ����ϴ�.");
	}
}

public class InterEx3 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); // �μ��� CŬ���� ��ü�� ������.
	}
}
// CŬ������ �޼��尡 ȣ��Ǿ����ϴ�.
*/




/////////////////////////////////////////////////////





// �������̽��� ����� ���
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
		System.out.println("BŬ������ �޼��尡 ȣ��Ǿ����ϴ�.");
	}
}

class C implements I{
	public void method() {
		System.out.println("CŬ������ �޼��尡 ȣ��Ǿ����ϴ�.");
	}
}

public class InterEx3 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B());
	}
}
// BŬ������ �޼��尡 ȣ��Ǿ����ϴ�.
*/

/////////////////////

/*
class A {
	public void method(I i) { // �Ű����� Ÿ���� �������� �ʾƵ� ��.
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼��尡 ȣ��Ǿ����ϴ�.");
	}
}

class C implements I{
	public void method() {
		System.out.println("CŬ������ �޼��尡 ȣ��Ǿ����ϴ�.");
	}
}

public class InterEx3 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); // �μ��� CŬ���� ��ü�� ������.
	}
}
// CŬ������ �޼��尡 ȣ��Ǿ����ϴ�.
*/





///////////////////////////////////////////////////////////





/*
abstract class GroundUnit {
	abstract void walk();
}

class Marine extends GroundUnit { void walk(){ System.out.println("������ ���󿡼� �����Դϴ�."); } }

class Tank extends GroundUnit { void walk(){ System.out.println("��ũ�� ���󿡼� �����Դϴ�."); } }

class Vulture extends GroundUnit { void walk(){ System.out.println("���İ� ���󿡼� �����Դϴ�/"); } }



abstract class AirUnit {
	abstract void fly();
}

class Dropship extends AirUnit { void fly(){ System.out.println("������� ���߿��� �����Դϴ�."); } }


public class InterEx3 {
	public static void main(String[] args) {
		Marine m = new Marine();
		m.walk(); // ������ ���󿡼� �����Դϴ�.
		
		Dropship d = new Dropship();
		d.fly(); // ������� ���߿��� �����Դϴ�.
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


class Marine extends GroundUnit { void walk(){ System.out.println("������ ���󿡼� �����Դϴ�."); } } 


class Tank extends GroundUnit implements Repairable { 
	void walk(){ System.out.println("��ũ�� ���󿡼� �����Դϴ�."); }
	public void repair(int rep) { System.out.println("��ũ�� HP��"+rep+"��ŭ �����մϴ�."); }
}


class Vulture extends GroundUnit implements Repairable { 
	void walk(){ System.out.println("���İ� ���󿡼� �����Դϴ�/"); } 
	public void repair(int rep) { System.out.println("������ HP��"+rep+"��ŭ �����մϴ�."); }
}



abstract class AirUnit {
	abstract void fly();
}

class Dropship extends AirUnit implements Repairable {  
	void fly(){ System.out.println("������� ���߿��� �����Դϴ�."); } 
	public void repair(int rep) { System.out.println("������� HP�� "+rep+"��ŭ �����մϴ�."); }
}



public class InterEx3 {
	public static void main(String[] args) {
		Marine m = new Marine();
		//m.repair(); // ���� �߻� // The method repair() is undefined for the type Marine
		
		Dropship d = new Dropship();
		d.repair(50); // �������  // ������� HP�� 50��ŭ �����մϴ�.
	}
}


















