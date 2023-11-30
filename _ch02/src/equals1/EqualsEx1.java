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
		
		if(v1.equals(v2)) System.out.println("v1�� v2�� �����ϴ�.");
		else System.out.println("v1�� v2�� �ٸ��ϴ�.");
	}
}
// v1�� v2�� �ٸ��ϴ�.
*/


///////////////////////////////////


class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	public boolean equals(Object obj) { // ObjectŬ������ equals()�޼��带 �������̵� ��.
		Value v = (Value)obj;
		
		return this.value==v.value; // ��ü�� ��� ������ ����.
	}
}


public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) System.out.println("v1�� v2�� �����ϴ�.");
		else System.out.println("v1�� v2�� �ٸ��ϴ�.");
	}
}
// v1�� v2�� �����ϴ�.




























