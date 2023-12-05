package Generic6;

interface Eatable {}
class Fruit implements Eatable {}
class Apple extends Fruit {}
class Grape extends Fruit {}
class Toy {}


class Box<T> {}
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}


public class GenericEx6 {
	public static void main(String[] args) {
		
//		FruitBox fBox = null; // 원시 타입
//		FruitBox<Apple> aBox = null; // 제네릭 타입
//		
//		fBox = (FruitBox)aBox; // 형변환 가능
//		aBox = (FruitBox<Apple>)fBox; // 형변환 가능
		
		
		////////////////////////
		
//		
//		FruitBox<Fruit> fBox = null; // 제네릭 타입
//		FruitBox<Apple> aBox = null; // 제네릭 타입
//		
//		fBox = (FruitBox<Fruit>)aBox; // 형변환 불가  // Cannot cast from FruitBox<Apple> to FruitBox<Fruit>
//		aBox = (FruitBox<Apple>)fBox; // 형변환 불가  // Cannot cast from FruitBox<Fruit> to FruitBox<Apple>
		

		//////////////////////////
		
		// 와일드 카드가 사용된 제네릭 타입   // 제네릭 타입
		FruitBox<? extends Fruit> fBox = (FruitBox<? extends Fruit>)new FruitBox<Apple>(); // 형변환 가능
	
		FruitBox<Apple> aBox = (FruitBox<Apple>)fBox; // 형변환 가능
	
	}

}
