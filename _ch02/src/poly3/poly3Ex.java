package poly3;

class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
}

class Computer extends Product {
	Computer() { super(200); }
}

class Tv extends Product {
	Tv() { super(150); }
}

class Audio extends Product {
	Audio() { super(50); }
}




class Buyer {
	
	Product[] cart = new Product[10]; // 부모 클래스 타입의 배열을 생성한 후,
	int i = 0;
	
	void buy(Product p) {
		cart[i++] = p;  // 자식 클래스의 객체를 담음. (배열의 다형성)
	}
	
	
	void summary() {
		int sum = 0;
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
		}
		
		System.out.println("구입한 물품의 총 금액은 " + sum +"만원 입니다."); // 구입한 물품의 총 금액은 400만원 입니다.
	}
	
}



public class poly3Ex {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		
		b.summary();
	}
}
