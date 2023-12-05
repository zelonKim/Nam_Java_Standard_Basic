package Generics5;


class Fruit {}
class Apple extends Fruit {}
class Grape extends Fruit {}

class FruitBox<T extends Fruit> {} 

class Juice {}

class Juicer {
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) { 
		return null;
	}
}


public class GenericsEx5 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		Juicer.<Fruit>makeJuice(fruitBox);
		
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		Juicer.<Apple>makeJuice(appleBox);
		
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		Juicer.<Grape>makeJuice(grapeBox);
		
	}
}
