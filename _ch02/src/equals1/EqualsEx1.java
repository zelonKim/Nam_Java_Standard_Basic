package equals1;
/*
class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}


public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) System.out.println("v1과 v2는 같습니다.");
		else System.out.println("v1과 v2는 다릅니다.");
	}
}
// v1과 v2는 다릅니다.
*/


///////////////////////////////////


class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	public boolean equals(Object obj) { // Object클래스의 equals()메서드를 오버라이딩 함.
		Value v = (Value)obj;
		
		return this.value==v.value; // 객체에 담긴 내용을 비교함.
	}
}


public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) System.out.println("v1과 v2는 같습니다.");
		else System.out.println("v1과 v2는 다릅니다.");
	}
}
// v1과 v2는 같습니다.




























