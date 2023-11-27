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
		System.out.println("x축으로 "+ x +"만큼, y축으로 " + y +"만큼 움직였습니다."); 
	}
	
	public void attack(Fightable f) { // 인터페이스 타입 매개변수에는 인터페이스 타입의 객체 혹은 인터페이스를 구현한 클래스 타입의 객체만 들어올 수 있음.
		System.out.println(f + "를 공격하였습니다.");
	}

	Fightable getFightable() {
		FightUnit gfu = new FightUnit();
		return gfu; // 메서드의 반환타입으로 인터페이스 타입을 지정한 경우, 반환값의 타입은 인터페이스 타입으로 자동 형변환 됨. 
	}
}


public class interface2 {
	public static void main(String[] args) {
		Unit u = new FightUnit();
		u.move(100, 200); // 정상 실행
		// u.attack(u); // 에러 발생 // The method attack(Unit) is undefined for the type Unit
		
		Fightable f = new FightUnit();
		f.move(100, 200);  // 정상 실행
		f.attack(f);  // 정상 실행

		
		FightUnit fu = new FightUnit();
		fu.move(100, 200); // 정상 실행
		fu.attack(fu); // 정상 실행
		// FightUnit gfu = fu.getFightable(); // 에러 발생 // Type mismatch: cannot convert from Fightable to FightUnit
		Fightable gfu = fu.getFightable(); // 정상 실행

	}
}
