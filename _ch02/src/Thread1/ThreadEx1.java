package Thread1;


class Thread0 extends Thread {
	public void run() {
		for(int i=0; i < 3; i++) {
			System.out.println(this.getName()); // this를 통해 '현재 실행중인 스레드 객체'를 가져옴.
		}
	}
}

//////////////////////////////


class Thread1 implements Runnable { 
	public void run() {
		for(int i=0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()); // Thread.currentThread()메서드를 통해 '현재 실행 중인 스레드 객체'를 가져옴.
		}
	}
}



public class ThreadEx1 {
	public static void main(String[] args) {
		Thread0 t0 = new Thread0();
		t0.start();
//		Thread-0
//		Thread-0
//		Thread-0
		
		
		/////////////////////////
		
		
		Runnable r = new Thread1();
		Thread t1 = new Thread(r);
		t1.start();
//		Thread-1
//		Thread-1
//		Thread-1
	}
}







































