package Generics4;

import java.util.ArrayList;

interface Eatable {}
class Fruit {}

class Grape extends Fruit implements Eatable {} 
class Apple extends Fruit {}
class Toy {}


class FruitBox<T extends Fruit & Eatable> {} // Fruit클래스를 상속받고, Eatable인터페이스를 구현한 클래스들만 타입변수T에 들어올 수 있음. 


public class GenericsEx4 {
	public static void main(String[] args) {
		FruitBox<Grape> grapeBox = new FruitBox<Grape>(); // 정상 실행
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); // 에러 발생 // Bound mismatch: The type Apple is not a valid substitute for the bounded parameter <T extends Fruit & Eatable> of the type FruitBox<T>
		FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러 발생  // Bound mismatch: The type Apple is not a valid substitute for the bounded parameter <T extends Fruit & Eatable> of the type FruitBox<T>
	}
}



