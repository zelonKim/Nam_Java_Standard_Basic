package Thread7;

class AThread extends Thread {
	public void run() {
		for(int i=0; i<100; i++) System.out.print("-");
		
	}
}

class BThread extends Thread {
	public void run() {
		for(int i=0; i<100; i++) System.out.print("|");

	}
}



public class ThreadEx7 {
	public static void main(String[] args) {
		AThread at = new AThread();
		BThread bt = new BThread();
		at.start();
		bt.start();

		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		
		System.out.println("main 스레드 종료");
	}

}
// 2초후에 "main 스레드 종료"가 출력됨.
