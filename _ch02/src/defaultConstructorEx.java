
class Data1 {
	int value;
}


class Data2{
	int value;
	
	Data2(int x) {
		value = x;
	}
}


public class defaultConstructorEx {
	public static void main(String[] args) {
		Data1 d1 = new Data1(); // 정상 실행
		Data2 d2 = new Data2(); // 에러 발생 // The constructor Data2() is undefined
	}
}
