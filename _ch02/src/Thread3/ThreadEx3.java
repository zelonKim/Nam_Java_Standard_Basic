package Thread3;

class aThread extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print(new String("-"));
		}
	}
}

class bThread extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print(new String("|"));
		}
	}
}



public class ThreadEx3 {
	public static void main(String[] args) {
		aThread at = new aThread();
		bThread bt = new bThread();
		
		at.start();
		bt.start();
		
		System.out.print(System.currentTimeMillis()); 
	}
}

// 1701833658328----------------------------------||||||||||||||||||||||||||||||||||||||||||||||------------------------------------------------------------------||||||||||||||||||||||||||||||||||||||||||||||||||||||




