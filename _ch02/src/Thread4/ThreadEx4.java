package Thread4;

import javax.swing.JOptionPane;

//public class ThreadEx4 {
//	public static void main(String[] args) throws Exception {
//		String input = JOptionPane.showInputDialog("값을 입력하세요"); // main 스레드에서 IO 블락킹이 발생함.
//		System.out.println("입력하신 값은" + input + "입니다");
//
//		for(int i=10; i>0; i--) {
//			System.out.println(i); // main 스레드의 IO 블락킹에 영향을 받음.
//			try {
//				Thread.sleep(1000);
//			} catch(Exception e) {}
//		}
//	}
//}
//// input창에 값을 입력해야 카운트다운이 시작됨. (싱글스레드)




///////////////////////////////




class AThread extends Thread {
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i); // A 스레드는  main 스레드의 IO블락킹에 영향을 받지 않음.
			try {
				Thread.sleep(1000);
			} catch(Exception e) {} 
		}
	}
}


public class ThreadEx4 {
	public static void main(String[] args) throws Exception {
		AThread at = new AThread();
		at.start();
		
		String input = JOptionPane.showInputDialog("값을 입력하세요"); // main 스레드에서 IO 블락킹이 발생함.
		System.out.println("입력하신 값은" + input + "입니다");
		
	}
}
// input창에 값을 입력하지 않아도 카운트다운이 시작됨. (멀티스레드)


