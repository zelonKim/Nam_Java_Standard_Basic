package interface2;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
}


interface Fightable {
	public abstract void move(int x, int y);
	public abstract void attack(Fightable f);
}


class FightUnit extends Unit implements Fightable {
	public void move(int x, int y) {
		System.out.println("x������ "+ x +"��ŭ, y������ " + y +"��ŭ ���������ϴ�."); 
	}
	
	public void attack(Fightable f) { // �������̽� Ÿ�� �Ű��������� �������̽� Ÿ���� ��ü Ȥ�� �������̽��� ������ Ŭ���� Ÿ���� ��ü�� ���� �� ����.
		System.out.println(f + "�� �����Ͽ����ϴ�.");
	}

	Fightable getFightable() {
		FightUnit gfu = new FightUnit();
		return gfu; // �޼����� ��ȯŸ������ �������̽� Ÿ���� ������ ���, ��ȯ���� Ÿ���� �������̽� Ÿ������ �ڵ� ����ȯ ��. 
	}
}


public class interface2 {
	public static void main(String[] args) {
		Unit u = new FightUnit();
		u.move(100, 200); // ���� ����
		// u.attack(u); // ���� �߻� // The method attack(Unit) is undefined for the type Unit
		
		Fightable f = new FightUnit();
		f.move(100, 200);  // ���� ����
		f.attack(f);  // ���� ����

		
		FightUnit fu = new FightUnit();
		fu.move(100, 200); // ���� ����
		fu.attack(fu); // ���� ����
		// FightUnit gfu = fu.getFightable(); // ���� �߻� // Type mismatch: cannot convert from Fightable to FightUnit
		Fightable gfu = fu.getFightable(); // ���� ����

	}
}
