package poly2;

//상속을 하지 않을 경우

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

// 메서드를 매번 오버로딩 해줘야 함.
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

		System.out.println("현재 남은돈은 " + b.myMoney + "만원 입니다."); // 현재 남은돈은 600만원 입니다.
		System.out.println("현재 보너스 포인트는 " + b.myPoint + "점 입니다."); // 현재 보너스 포인트는 40점 입니다.
	}
}



///////////////////////////////


/*
//상속을 할 경우

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
	
    // 메서드를 한번만 정의해도 됨.
	void buy(Product p) { // 매개변수 타입으로 부모클래스 타입을 선언한 후, 자식클래스 객체를 넘겨받음. (매개변수의 다형성)
		myMoney -= p.price;
		myPoint += p.bonusPoint;
	}
}


public class polyEx2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Product com = new Computer(); // 부모 클래스의 타입으로 자식 클래스의 객체를 다룸. (다형성)
		b.buy(com); 
		
		Product tv = new Tv();
		b.buy(tv); 
		
		Product aud = new Audio();
		b.buy(aud);
		
		System.out.println("현재 남은돈은 " + b.myMoney + "만원 입니다.");  // 현재 남은돈은 600만원 입니다.
		System.out.println("현재 보너스 포인트는 " + b.myPoint + "점 입니다."); // 현재 보너스 포인트는 40점 입니다.
	}
}

*/

