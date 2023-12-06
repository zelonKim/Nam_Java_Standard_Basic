package Thread8;

import javax.swing.JOptionPane;

class AThread extends Thread {
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		}
		System.out.println("카운트가 종료되었습니다.");
	}

}


public class ThreadEx8 {
	public static void main(String[] args) {
		AThread at = new AThread();
		at.start();
		
		System.out.println(at.isInterrupted()); // false
		
		String input = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력한 값은" + input + "입니다.");
		
		at.interrupt();
		System.out.println(at.isInterrupted()); // 카운트가 다 종료되기 전에 input창에 값을 입력하면 true가 출력됨.
												// 카운트가 다 종료된 후, input창에 값을 입력하면 false가 출력됨.	
	}
}

//	false
//	10
//	9
//	8
//	7
//	6
//	입력한 값은hello입니다.
//	true
//	5
//	4
//	3
//	2
//	1
//	카운트가 종료되었습니다.

////////////////////////

//	false
//	10
//	9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	카운트가 종료되었습니다.
//	입력한 값은hello입니다.
//	false

