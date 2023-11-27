package abstract2;

abstract class Unit {
	int x, y;
	abstract void move(int x , int y);
}



class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("마린이 x축으로 "+x+"만큼, "+"y축으로 "+y+"만큼 움직였습니다");
	}
	void stimPack() { System.out.println("스팀팩을 하였습니다."); }
}


class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("탱크가 x축으로 "+x+"만큼, "+"y축으로 "+y+"만큼 움직였습니다");
	}
	void SiegeMode() { System.out.println("시즈모드를 하였습니다.");}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("드랍쉽이 x축으로 "+x+"만큼, "+"y축으로 "+y+"만큼 움직였습니다");
	}
	void load() { System.out.println("로드를 하였습니다.");}
}


public class abstract2Ex {
	public static void main(String[] args) {
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		group[0].move(100, 200); // 마린이 x축으로 100만큼, y축으로 200만큼 움직였습니다
		group[1].move(100, 200); // 탱크가 x축으로 100만큼, y축으로 200만큼 움직였습니다
		group[2].move(100, 200); // 드랍쉽이 x축으로 100만큼, y축으로 200만큼 움직였습니다
	}

}
