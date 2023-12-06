package Thread9;

public class ThreadEx9 {
	public static void main(String[] args) {
		MyThread r = new MyThread();
		Thread t1 = new Thread(r, "A");
		Thread t2 = new Thread(r, "B");
		Thread t3 = new Thread(r, "C");
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(5000);
			t1.suspend();
			Thread.sleep(5000);
			t2.suspend();
			Thread.sleep(5000);
			t1.resume();
			Thread.sleep(5000);
			t2.resume();
			Thread.sleep(5000);
			t1.stop();
			Thread.sleep(5000);
			t2.stop();

		} catch(InterruptedException e) {}
	}
}
// ABCBCAACBBCABACBCBCBCCBCBCCCCCACACACACACBACBACBACBACBACBCBCBCBCBCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC

class MyThread implements Runnable {
	boolean stopped = false;
	
	public void run() {
		while(true) {
			System.out.print(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
