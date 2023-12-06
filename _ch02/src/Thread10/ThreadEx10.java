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
//		System.out.print("main 스레드가 종료되었습니다.");
//	}
//
//}
// main 스레드가 종료되었습니다.------------------------|||||||||||||||||||||---------------------------------------------------------------|||||||||||||||||-------------||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||


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
			at.join(); // main 스레드가 A 스레드의 작업이 끝날때까지 기다림.
			bt.join(); // main 스레드가 B 스레드의 작업이 끝날때까지 기다림.
		} catch(InterruptedException e) {}
		
		System.out.print("main 스레드가 종료되었습니다.");
	}

}
// ----||||||||--|||||||||||||-------||||||||--|-------------------------------------------------------||||||||--||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||----------------------------main 스레드가 종료되었습니다.
