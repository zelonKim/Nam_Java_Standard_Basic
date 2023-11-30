package toString1;

/*
class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}


public class ToStringEx1 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString()); // Card@2a139a55
		System.out.println(c2.toString()); // Card@15db9742
	}
}
*/


///////////////////////////////



class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() { // Object 클래스의 toString() 메서드를 오버라이딩함.
		return "kind:" + kind + ", number:" + number;
	}
}



public class ToStringEx1 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString()); // kind:SPADE, number:1
		System.out.println(c2.toString()); // kind:SPADE, number:1
	}
}

























