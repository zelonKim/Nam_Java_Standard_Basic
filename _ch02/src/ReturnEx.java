class Gugudan{
	void printGugudan(int dan) {
		if(!(2<=dan && dan <= 9)) return; // dan이 2~9가 아닐 경우, 호출한 곳으로 그냥 돌아감.
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
}


public class ReturnEx {
	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		gugudan.printGugudan(10); // 아무것도 출력되지 않음.
		gugudan.printGugudan(5); // 구구단 5단이 출력됨.
	}

}

