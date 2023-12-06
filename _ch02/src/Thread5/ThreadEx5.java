package Thread5;

class AThread extends Thread {
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.print("A");
		}
	}
}

class BThread extends Thread {
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.print("B");
		}
	}
}


public class ThreadEx5 {
	public static void main(String[] args) {
		AThread at = new AThread();
		BThread bt = new BThread();
		
		bt.setPriority(9);
		
		System.out.println(at.getPriority()); // 5
		System.out.println(bt.getPriority()); // 9

		at.start();
		bt.start();
	}
}

// AAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
// 우선순위가 높은 B스레드가 먼저 다 출력됨.

