class Gugudan{
	void printGugudan(int dan) {
		if(!(2<=dan && dan <= 9)) return; // dan�� 2~9�� �ƴ� ���, ȣ���� ������ �׳� ���ư�.
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
}


public class ReturnEx {
	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		gugudan.printGugudan(10); // �ƹ��͵� ��µ��� ����.
		gugudan.printGugudan(5); // ������ 5���� ��µ�.
	}

}

