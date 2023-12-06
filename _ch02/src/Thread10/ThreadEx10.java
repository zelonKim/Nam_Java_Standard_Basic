package Thread10;

//class AThread extends Thread {
//	public void run() {
//		for(int i=0; i < 100; i++) {
//			System.out.print(new String("-"));
//		}
//	}
//}
//
//class BThread extends Thread {
//	public void run() {
//		for(int i=0; i < 100; i++) {
//			System.out.print(new String("|"));
//		}
//	}
//}
//
//
//
//public class ThreadEx10 {
//	static long startTime = 0;
//	
//	public static void main(String[] args) {
//	
//		AThread at = new AThread();
//		BThread bt = new BThread();
//		at.start();
//		bt.start();
//		
//		System.out.print("main �����尡 ����Ǿ����ϴ�.");
//	}
//
//}
// main �����尡 ����Ǿ����ϴ�.------------------------|||||||||||||||||||||---------------------------------------------------------------|||||||||||||||||-------------||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||


///////////////////////////////


class AThread extends Thread {
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.print(new String("-"));
		}
	}
}

class BThread extends Thread {
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.print(new String("|"));
		}
	}
}



public class ThreadEx10 {
	static long startTime = 0;
	
	public static void main(String[] args) {
	
		AThread at = new AThread();
		BThread bt = new BThread();
		at.start();
		bt.start();
		
		try {
			at.join(); // main �����尡 A �������� �۾��� ���������� ��ٸ�.
			bt.join(); // main �����尡 B �������� �۾��� ���������� ��ٸ�.
		} catch(InterruptedException e) {}
		
		System.out.print("main �����尡 ����Ǿ����ϴ�.");
	}

}
// ----||||||||--|||||||||||||-------||||||||--|-------------------------------------------------------||||||||--||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||----------------------------main �����尡 ����Ǿ����ϴ�.
