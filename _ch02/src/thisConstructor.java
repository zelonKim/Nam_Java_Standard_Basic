class Car {
	String color;
	String gear;
	int door;
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String c, String g, int d) {
		this.color = c;
		this.gear = g;
		this.door = d;
	}
}



public class thisConstructor {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car("black","auto",6);
		
		System.out.println(car1.color); // white
		System.out.println(car2.color); // black
	}
}
