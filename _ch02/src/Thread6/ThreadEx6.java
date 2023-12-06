package Thread6;
//
//public class ThreadEx6 implements Runnable {
//	static boolean autoSave = false;
//	
//	
//	public static void main(String[] args) { // main 스레드 (사용자 스레드)
//		Thread t = new Thread(new ThreadEx6());
//		t.setDaemon(true);
//		t.start();
//		
//		for(int i=1; i<=10; i++) {
//			try {
//				Thread.sleep(1000);;
//			} catch(InterruptedException e) {}
//			System.out.println(i);
//			
//			if(i==5) autoSave = true;
//		}
//		System.out.println("프로그램을 종료합니다");
//	}
//		
//	
//		public void run() { // 데몬 스레드 -> main 스레드(사용자 스레드)가 종료되면 자동 종료됨.
//			while(true) {
//				try {
//					Thread.sleep(2*1000);
//				} catch(InterruptedException e) {}
//			
//			
//			if(autoSave) autoSave();
//			
//			}
//		}
//
//		
//		public void autoSave() {
//			System.out.println("파일이 자동저장 되었습니다.");
//		}
//		
//	}
//
////	1
////	2
////	3
////	4
////	5
////	파일이 자동저장 되었습니다.
////	6
////	7
////	파일이 자동저장 되었습니다.
////	8
////	9
////	파일이 자동저장 되었습니다.
////	10
////	프로그램을 종료합니다


///////////////////////////////////////////////



public class ThreadEx6 implements Runnable {
	static boolean autoSave = false;
	
	
	public static void main(String[] args) { // main 스레드 (사용자 스레드)
		Thread t = new Thread(new ThreadEx6());
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);;
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) autoSave = true;
		}
		System.out.println("프로그램을 종료합니다");
	}
		
	
		public void run() { // 사용자 스레드 -> main 스레드(사용자 스레드)가 종료되어도 종료되지 않음.
			while(true) {
				try {
					Thread.sleep(2*1000);
				} catch(InterruptedException e) {}
			
			
			if(autoSave) autoSave();
			
			}
		}

		
		public void autoSave() {
			System.out.println("파일이 자동저장 되었습니다.");
		}
		
	}

//	1
//	2
//	3
//	4
//	5
//	파일이 자동저장 되었습니다.
//	6
//	7
//	파일이 자동저장 되었습니다.
//	8
//	9
//	파일이 자동저장 되었습니다.
//	10
//	프로그램을 종료합니다
//	프로그램을 종료합니다
//	프로그램을 종료합니다
//  ... (무한 출력)