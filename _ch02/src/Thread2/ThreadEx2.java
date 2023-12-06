package Thread2;

//public class ThreadEx2 {
//	public static void main(String[] args) {
//
//		for(int i=0; i < 100; i++) {
//			System.out.print(0);
//		}
//		
//		for(int i=0; i < 100; i++) {
//			System.out.print(1);
//		}
//	}
//}
//// 00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
//// 0이 모두 출력된 후, 1이 출력됨. (싱글 스레드)




/////////////////////////////////////////



		
class Thread0 extends Thread {
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.print(0);
		}
	}
}

class Thread1 extends Thread {
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.print(1);
		}
	}
}


public class ThreadEx2 {
	public static void main(String[] args) {
		Thread0 t0 = new Thread0();
		Thread1 t1 = new Thread1();
		
		t0.start();
		t1.start();
	}
}
// 00000000000000000000000001111111111111111111111111111111111111111000000000000000000000000000000000000000011110000000000000000011111111111111111111111111111111111111111110000000000000000001111111111111		
// 0과 1이 번갈아 가면서 출력됨. (멀티 스레드)