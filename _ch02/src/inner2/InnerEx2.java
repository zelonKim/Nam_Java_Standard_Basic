package inner2;

public class InnerEx2 {
	
	class InstanceInner {
		int iv1 = 100; // �ν��Ͻ� ���� ���� ����
		// static int cv1 = 100; // ����ƽ ���� ���� �Ұ�
	}
	
	static class StaticInner {
		int iv2 = 200; // �ν��Ͻ� ���� ���� ����
		static int cv2 = 200; // ����ƽ ���� ���� ����
	}
	
	void myMethod() {
		class LocalInner {
			int iv3 = 300; // �ν��Ͻ� ���� ���� ����
			// static int cv3 = 300; // ����ƽ ���� ���� �Ұ�
		}
	}	
}	

///////////////////////


class Outer {
	private int outerIv = 0;
	private static int outerCv = 0;
	
	// �ܺ� Ŭ������ private ����̴��� ���� Ŭ�������� ���� ����
	class InstanceInner { 
		int iiv = outerIv; 
		int iiv2 = outerCv; 
	}
	
	static class StaticInner {
		int siv = outerIv; // ���� �߻�  // ����ƽ ���� Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� ������ ���� �Ұ�
		static int scv = outerCv;
	}


	void myMEthod() {
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
		}
	}
}




























	
