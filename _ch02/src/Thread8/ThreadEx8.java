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
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}

}


public class ThreadEx8 {
	public static void main(String[] args) {
		AThread at = new AThread();
		at.start();
		
		System.out.println(at.isInterrupted()); // false
		
		String input = JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("�Է��� ����" + input + "�Դϴ�.");
		
		at.interrupt();
		System.out.println(at.isInterrupted()); // ī��Ʈ�� �� ����Ǳ� ���� inputâ�� ���� �Է��ϸ� true�� ��µ�.
												// ī��Ʈ�� �� ����� ��, inputâ�� ���� �Է��ϸ� false�� ��µ�.	
	}
}

//	false
//	10
//	9
//	8
//	7
//	6
//	�Է��� ����hello�Դϴ�.
//	true
//	5
//	4
//	3
//	2
//	1
//	ī��Ʈ�� ����Ǿ����ϴ�.

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
//	ī��Ʈ�� ����Ǿ����ϴ�.
//	�Է��� ����hello�Դϴ�.
//	false

