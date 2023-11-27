package interface1;

interface Fightable {
	  void move(int x, int y);
	  void attack();
	}

class FightUnit implements Fightable {
	  public void move(int x, int y)  { System.out.println("x축으로 "+ x +"만큼, y축으로 " + y +"만큼 움직였습니다."); }
	  public void attack() { System.out.println("상대를 공격하였습니다."); }
	}

public class interface1 {
	public static void main(String[] args) {
		FightUnit fu = new FightUnit();
		fu.move(100, 200); // x축으로 100만큼, y축으로 200만큼 움직였습니다.
		fu.attack(); // 상대를 공격하였습니다.
	}
}

//class FightUnit implements Fightable { //에러 발생
//	  public void move(int x, int y)  { System.out.println("x축으로 "+ x +"만큼, y축으로 " + y +"만큼 움직였습니다."); }
//	}

//abstract class FightUnit implements Fightable { //정상 실행
//	  public void move(int x, int y)  { System.out.println("x축으로 "+ x +"만큼, y축으로 " + y +"만큼 움직였습니다."); }
//	}
//



