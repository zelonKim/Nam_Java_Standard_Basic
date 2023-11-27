package poly2;

//����� ���� ���� ���

class Computer  {
	int price = 200;
	int bonusPoint = (int)(price/10.0);
}

class Tv {
	int price = 150;
	int bonusPoint = (int)(price/10.0);

}

class Audio {
	int price = 50;
	int bonusPoint = (int)(price/10.0);
}



class Buyer {
	int myMoney = 1000;
	int myPoint = 0;

// �޼��带 �Ź� �����ε� ����� ��.
	void buy(Tv tv) { 
		myMoney -= tv.price;
		myPoint += tv.bonusPoint;
	}

	void buy(Computer com) {
		myMoney -= com.price;
		myPoint += com.bonusPoint;
	}

	void buy(Audio aud) {
		myMoney -= aud.price;
		myPoint += aud.bonusPoint;
	}
}



public class polyEx2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		Computer com = new Computer();
		Tv tv = new Tv(); 
		Audio aud = new Audio();

		b.buy(com);
		b.buy(tv); 
		b.buy(aud);

		System.out.println("���� �������� " + b.myMoney + "���� �Դϴ�."); // ���� �������� 600���� �Դϴ�.
		System.out.println("���� ���ʽ� ����Ʈ�� " + b.myPoint + "�� �Դϴ�."); // ���� ���ʽ� ����Ʈ�� 40�� �Դϴ�.
	}
}



///////////////////////////////


/*
//����� �� ���

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Computer extends Product {
	Computer() { super(200); }
}


class Tv extends Product {
	Tv() { super(150);}
}

class Audio extends Product {
	Audio() { super(50); }
}



class Buyer {
	int myMoney = 1000;
	int myPoint = 0;
	
    // �޼��带 �ѹ��� �����ص� ��.
	void buy(Product p) { // �Ű����� Ÿ������ �θ�Ŭ���� Ÿ���� ������ ��, �ڽ�Ŭ���� ��ü�� �Ѱܹ���. (�Ű������� ������)
		myMoney -= p.price;
		myPoint += p.bonusPoint;
	}
}


public class polyEx2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Product com = new Computer(); // �θ� Ŭ������ Ÿ������ �ڽ� Ŭ������ ��ü�� �ٷ�. (������)
		b.buy(com); 
		
		Product tv = new Tv();
		b.buy(tv); 
		
		Product aud = new Audio();
		b.buy(aud);
		
		System.out.println("���� �������� " + b.myMoney + "���� �Դϴ�.");  // ���� �������� 600���� �Դϴ�.
		System.out.println("���� ���ʽ� ����Ʈ�� " + b.myPoint + "�� �Դϴ�."); // ���� ���ʽ� ����Ʈ�� 40�� �Դϴ�.
	}
}

*/

