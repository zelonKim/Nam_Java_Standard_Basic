package abstract1;

abstract class Player { // �߻� Ŭ����
	  abstract void play(int vol); // �߻� �޼���
	  abstract void stop();
	}


class AudioPlayer extends Player { // ���� Ŭ����
	  void play(int vol) { System.out.println("������ " + vol +"�� �Ͽ� ������� ����մϴ�"); } // ���� �޼���
	  void stop() { System.out.println("����� ����� ����ϴ�"); }
}


	  
public class abstract1Ex {
	public static void main(String[] args) {
		 // Player p = new Player(); // ���� �߻� (��ü ���� �Ұ�)
		AudioPlayer ap = new AudioPlayer(); // ���� ����
		Player p = new AudioPlayer(); // ���� ����
		
		ap.play(5); // ������ 5�� �Ͽ� ������� ����մϴ�
		ap.stop(); // ����� ����� ����ϴ�
		
		p.play(1); // ������ 1�� �Ͽ� ������� ����մϴ�
		p.stop(); // ����� ����� ����ϴ�

	}
}

