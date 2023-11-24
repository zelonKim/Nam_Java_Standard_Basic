package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
	public void printMembers() {
		System.out.println(prv); // 에러 발생 (클래스를 벗어남.)
		System.out.println(dft); // 에러 발생 (패키지를 벗어남.)
		System.out.println(prt); // 정상 실행 (패키지를 벗어났지만, 자식클래스라 접근 가능함.)
 		System.out.println(pub);
	}
}


public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		System.out.println(p.prv); // 에러 발생 (클래스를 벗어남.)
		System.out.println(p.dft); // 에러 발생 (패키지를 벗어남.)
		System.out.println(p.prt); // 에러 발생 (패키지를 벗어났으며, 자식클래스가 아님.)
 		System.out.println(p.pub);

	}

}
