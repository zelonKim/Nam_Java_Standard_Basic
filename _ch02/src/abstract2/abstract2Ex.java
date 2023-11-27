package abstract2;

abstract class Unit {
	int x, y;
	abstract void move(int x , int y);
}



class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("������ x������ "+x+"��ŭ, "+"y������ "+y+"��ŭ ���������ϴ�");
	}
	void stimPack() { System.out.println("�������� �Ͽ����ϴ�."); }
}


class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("��ũ�� x������ "+x+"��ŭ, "+"y������ "+y+"��ŭ ���������ϴ�");
	}
	void SiegeMode() { System.out.println("�����带 �Ͽ����ϴ�.");}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("������� x������ "+x+"��ŭ, "+"y������ "+y+"��ŭ ���������ϴ�");
	}
	void load() { System.out.println("�ε带 �Ͽ����ϴ�.");}
}


public class abstract2Ex {
	public static void main(String[] args) {
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		group[0].move(100, 200); // ������ x������ 100��ŭ, y������ 200��ŭ ���������ϴ�
		group[1].move(100, 200); // ��ũ�� x������ 100��ŭ, y������ 200��ŭ ���������ϴ�
		group[2].move(100, 200); // ������� x������ 100��ŭ, y������ 200��ŭ ���������ϴ�
	}

}
