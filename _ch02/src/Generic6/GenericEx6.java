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
		
//		FruitBox fBox = null; // ���� Ÿ��
//		FruitBox<Apple> aBox = null; // ���׸� Ÿ��
//		
//		fBox = (FruitBox)aBox; // ����ȯ ����
//		aBox = (FruitBox<Apple>)fBox; // ����ȯ ����
		
		
		////////////////////////
		
//		
//		FruitBox<Fruit> fBox = null; // ���׸� Ÿ��
//		FruitBox<Apple> aBox = null; // ���׸� Ÿ��
//		
//		fBox = (FruitBox<Fruit>)aBox; // ����ȯ �Ұ�  // Cannot cast from FruitBox<Apple> to FruitBox<Fruit>
//		aBox = (FruitBox<Apple>)fBox; // ����ȯ �Ұ�  // Cannot cast from FruitBox<Fruit> to FruitBox<Apple>
		

		//////////////////////////
		
		// ���ϵ� ī�尡 ���� ���׸� Ÿ��   // ���׸� Ÿ��
		FruitBox<? extends Fruit> fBox = (FruitBox<? extends Fruit>)new FruitBox<Apple>(); // ����ȯ ����
	
		FruitBox<Apple> aBox = (FruitBox<Apple>)fBox; // ����ȯ ����
	
	}

}
