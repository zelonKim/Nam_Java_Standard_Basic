package inner3;

class Outer {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}


public class InnerEx3 {
	public static void main(String[] args) {
		Outer oc = new Outer(); // �ܺ� Ŭ���� Ÿ�Ը�   �ܺ� ���������� = new �ܺ� Ŭ���� ������()
		Outer.InstanceInner ii = oc.new InstanceInner(); // �ܺ� Ŭ���� Ÿ�Ը�.�ν��Ͻ� ���� Ŭ���� Ÿ�Ը�    ���� ���������� = �ܺ� ����������.new �ν��Ͻ� ���� Ŭ���� �����ڸ�()
		System.out.println(ii.iv); // 100
		
		Outer.StaticInner si = new Outer.StaticInner(); // �ܺ� Ŭ���� Ÿ�Ը�.����ƽ ���� Ŭ���� Ÿ�Ը�   ���� ���������� = new �ܺ� Ŭ���� Ÿ�Ը�.����ƽ ���� Ŭ���� �����ڸ�()
		System.out.println(si.iv); // 200
		System.out.println(si.cv); // 300

	}

}
