class Data { int x; }

public class PrimitiveParam {
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		
		System.out.println(data.x); 
		change(data.x);
		System.out.println(data.x);
	}
	
	static void change(int x) { // �⺻�� �Ű�����
		x = 3000;
		System.out.println(x);
	}
}
