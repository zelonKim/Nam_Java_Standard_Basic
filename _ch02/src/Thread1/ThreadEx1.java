package Thread1;


class Thread0 extends Thread {
	public void run() {
		for(int i=0; i < 3; i++) {
			System.out.println(this.getName()); // this�� ���� '���� �������� ������ ��ü'�� ������.
		}
	}
}

//////////////////////////////


class Thread1 implements Runnable { 
	public void run() {
		for(int i=0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()); // Thread.currentThread()�޼��带 ���� '���� ���� ���� ������ ��ü'�� ������.
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







































