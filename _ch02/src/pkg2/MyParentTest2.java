package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
	public void printMembers() {
		System.out.println(prv); // ���� �߻� (Ŭ������ ���.)
		System.out.println(dft); // ���� �߻� (��Ű���� ���.)
		System.out.println(prt); // ���� ���� (��Ű���� �������, �ڽ�Ŭ������ ���� ������.)
 		System.out.println(pub);
	}
}


public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		System.out.println(p.prv); // ���� �߻� (Ŭ������ ���.)
		System.out.println(p.dft); // ���� �߻� (��Ű���� ���.)
		System.out.println(p.prt); // ���� �߻� (��Ű���� �������, �ڽ�Ŭ������ �ƴ�.)
 		System.out.println(p.pub);

	}

}
