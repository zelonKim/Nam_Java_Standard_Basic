package Thread4;

import javax.swing.JOptionPane;

//public class ThreadEx4 {
//	public static void main(String[] args) throws Exception {
//		String input = JOptionPane.showInputDialog("���� �Է��ϼ���"); // main �����忡�� IO ���ŷ�� �߻���.
//		System.out.println("�Է��Ͻ� ����" + input + "�Դϴ�");
//
//		for(int i=10; i>0; i--) {
//			System.out.println(i); // main �������� IO ���ŷ�� ������ ����.
//			try {
//				Thread.sleep(1000);
//			} catch(Exception e) {}
//		}
//	}
//}
//// inputâ�� ���� �Է��ؾ� ī��Ʈ�ٿ��� ���۵�. (�̱۽�����)




///////////////////////////////




class AThread extends Thread {
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i); // A �������  main �������� IO���ŷ�� ������ ���� ����.
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
		
		String input = JOptionPane.showInputDialog("���� �Է��ϼ���"); // main �����忡�� IO ���ŷ�� �߻���.
		System.out.println("�Է��Ͻ� ����" + input + "�Դϴ�");
		
	}
}
// inputâ�� ���� �Է����� �ʾƵ� ī��Ʈ�ٿ��� ���۵�. (��Ƽ������)


