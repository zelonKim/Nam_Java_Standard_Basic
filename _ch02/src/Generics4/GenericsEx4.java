package Generics4;

import java.util.ArrayList;

interface Eatable {}
class Fruit {}

class Grape extends Fruit implements Eatable {} 
class Apple extends Fruit {}
class Toy {}


class FruitBox<T extends Fruit & Eatable> {} // FruitŬ������ ��ӹް�, Eatable�������̽��� ������ Ŭ�����鸸 Ÿ�Ժ���T�� ���� �� ����. 


public class GenericsEx4 {
	public static void main(String[] args) {
		FruitBox<Grape> grapeBox = new FruitBox<Grape>(); // ���� ����
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); // ���� �߻� // Bound mismatch: The type Apple is not a valid substitute for the bounded parameter <T extends Fruit & Eatable> of the type FruitBox<T>
		FruitBox<Toy> toyBox = new FruitBox<Toy>(); // ���� �߻�  // Bound mismatch: The type Apple is not a valid substitute for the bounded parameter <T extends Fruit & Eatable> of the type FruitBox<T>
	}
}



