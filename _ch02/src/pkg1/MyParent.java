package pkg1;

public class MyParent {
	private int prv;
	int dft;
	protected int prt;
	public int pub;
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}





class MyParentTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		System.out.println(p.prv); // 에러 발생 (클래스를 벗어남.)
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}
}
