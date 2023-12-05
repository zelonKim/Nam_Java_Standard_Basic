package WildCard1;

/*
class Fruit {}
class Apple extends Fruit {}
class Grape extends Fruit {}

class FruitBox<T extends Fruit> {} 

public class WildCardEx1 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		
		FruitBox<Fruit> appleBox1 = new FruitBox<Apple>(); 
		FruitBox<Fruit> grapeBox1 = new FruitBox<Grape>(); // ������ Ÿ�Ժ������� �������� �������� ����.
		
		FruitBox<? extends Fruit> appleBox2 = new FruitBox<Apple>();
		FruitBox<? extends Fruit> grapeBox2 = new FruitBox<Grape>(); // ���ϵ�ī�� ?�� Ÿ�Ժ������� �������� ����������.
	}
}
*/


//////////////////////////////////////


//
//class Fruit {}
//class Apple extends Fruit {}
//class Grape extends Fruit {}
//
//class FruitBox<T extends Fruit> {} 
//
//class Juice {}
//
//class Juicer {
//	static Juice makeJuice(FruitBox<Fruit> box) {
//		return null;
//	}
//}
//
//public class WildCardEx1 {
//	public static void main(String[] args) {
//		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
//		Juicer.makeJuice(fruitBox);
//		
//		FruitBox<Apple> appleBox = new FruitBox<Apple>();
//		Juicer.makeJuice(appleBox); // ���� �߻�  // The method makeJuice(FruitBox<Fruit>) in the type Juicer is not applicable for the arguments (FruitBox<Apple>)
//		
//		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		Juicer.makeJuice(grapeBox); // ���� �߻� // The method makeJuice(FruitBox<Fruit>) in the type Juicer is not applicable for the arguments (FruitBox<Grape>)
//	}
//}


		////////////////////////


class Fruit {}
class Apple extends Fruit {}
class Grape extends Fruit {}

class FruitBox<T extends Fruit> {} 

class Juice {}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) { 
		return null;
	}
}

public class WildCardEx1 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		Juicer.makeJuice(fruitBox);
		
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		Juicer.makeJuice(appleBox); // ���� ����
		
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		Juicer.makeJuice(grapeBox); // ���� ����
	}
}
