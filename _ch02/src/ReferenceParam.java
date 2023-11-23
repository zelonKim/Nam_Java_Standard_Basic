// class Data { int x; }

public class ReferenceParam {
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		
		System.out.println(data.x); 
		change(data);
		System.out.println(data.x);
	}
	
	static void change(Data data) { // 참조형 매개변수
		data.x = 3000;
		System.out.println(data.x);
	}

}
