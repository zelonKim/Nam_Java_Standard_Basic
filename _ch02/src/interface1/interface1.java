package interface1;

interface Fightable {
	  void move(int x, int y);
	  void attack();
	}

class FightUnit implements Fightable {
	  public void move(int x, int y)  { System.out.println("x������ "+ x +"��ŭ, y������ " + y +"��ŭ ���������ϴ�."); }
	  public void attack() { System.out.println("��븦 �����Ͽ����ϴ�."); }
	}

public class interface1 {
	public static void main(String[] args) {
		FightUnit fu = new FightUnit();
		fu.move(100, 200); // x������ 100��ŭ, y������ 200��ŭ ���������ϴ�.
		fu.attack(); // ��븦 �����Ͽ����ϴ�.
	}
}

//class FightUnit implements Fightable { //���� �߻�
//	  public void move(int x, int y)  { System.out.println("x������ "+ x +"��ŭ, y������ " + y +"��ŭ ���������ϴ�."); }
//	}

//abstract class FightUnit implements Fightable { //���� ����
//	  public void move(int x, int y)  { System.out.println("x������ "+ x +"��ŭ, y������ " + y +"��ŭ ���������ϴ�."); }
//	}
//



