package Thread6;
//
//public class ThreadEx6 implements Runnable {
//	static boolean autoSave = false;
//	
//	
//	public static void main(String[] args) { // main ������ (����� ������)
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
//		System.out.println("���α׷��� �����մϴ�");
//	}
//		
//	
//		public void run() { // ���� ������ -> main ������(����� ������)�� ����Ǹ� �ڵ� �����.
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
//			System.out.println("������ �ڵ����� �Ǿ����ϴ�.");
//		}
//		
//	}
//
////	1
////	2
////	3
////	4
////	5
////	������ �ڵ����� �Ǿ����ϴ�.
////	6
////	7
////	������ �ڵ����� �Ǿ����ϴ�.
////	8
////	9
////	������ �ڵ����� �Ǿ����ϴ�.
////	10
////	���α׷��� �����մϴ�


///////////////////////////////////////////////



public class ThreadEx6 implements Runnable {
	static boolean autoSave = false;
	
	
	public static void main(String[] args) { // main ������ (����� ������)
		Thread t = new Thread(new ThreadEx6());
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);;
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) autoSave = true;
		}
		System.out.println("���α׷��� �����մϴ�");
	}
		
	
		public void run() { // ����� ������ -> main ������(����� ������)�� ����Ǿ ������� ����.
			while(true) {
				try {
					Thread.sleep(2*1000);
				} catch(InterruptedException e) {}
			
			
			if(autoSave) autoSave();
			
			}
		}

		
		public void autoSave() {
			System.out.println("������ �ڵ����� �Ǿ����ϴ�.");
		}
		
	}

//	1
//	2
//	3
//	4
//	5
//	������ �ڵ����� �Ǿ����ϴ�.
//	6
//	7
//	������ �ڵ����� �Ǿ����ϴ�.
//	8
//	9
//	������ �ڵ����� �Ǿ����ϴ�.
//	10
//	���α׷��� �����մϴ�
//	���α׷��� �����մϴ�
//	���α׷��� �����մϴ�
//  ... (���� ���)