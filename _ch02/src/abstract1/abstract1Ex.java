package abstract1;

abstract class Player { // 추상 클래스
	  abstract void play(int vol); // 추상 메서드
	  abstract void stop();
	}


class AudioPlayer extends Player { // 구상 클래스
	  void play(int vol) { System.out.println("볼륨을 " + vol +"로 하여 오디오를 재생합니다"); } // 구상 메서드
	  void stop() { System.out.println("오디오 재생을 멈춥니다"); }
}


	  
public class abstract1Ex {
	public static void main(String[] args) {
		 // Player p = new Player(); // 에러 발생 (객체 생성 불가)
		AudioPlayer ap = new AudioPlayer(); // 정상 실행
		Player p = new AudioPlayer(); // 정상 실행
		
		ap.play(5); // 볼륨을 5로 하여 오디오를 재생합니다
		ap.stop(); // 오디오 재생을 멈춥니다
		
		p.play(1); // 볼륨을 1로 하여 오디오를 재생합니다
		p.stop(); // 오디오 재생을 멈춥니다

	}
}

