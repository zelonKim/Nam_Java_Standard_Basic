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
	
	Product[] cart = new Product[10]; // �θ� Ŭ���� Ÿ���� �迭�� ������ ��,
	int i = 0;
	
	void buy(Product p) {
		cart[i++] = p;  // �ڽ� Ŭ������ ��ü�� ����. (�迭�� ������)
	}
	
	
	void summary() {
		int sum = 0;
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
		}
		
		System.out.println("������ ��ǰ�� �� �ݾ��� " + sum +"���� �Դϴ�."); // ������ ��ǰ�� �� �ݾ��� 400���� �Դϴ�.
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
