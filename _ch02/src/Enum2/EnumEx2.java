package Enum2;

enum Direction {
	EAST(15, ">"), 
	SOUTH(30, "V"),
	WEST(45, "<"),
	NORTH(60, "^");
	// ���Ż���� ���ϴ� ���� ��ȣ()�ȿ� �־���.
	
	private final int value;
	private final String symbol;

	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	// �ν��Ͻ� ������ �����ڸ� �߰�����.
	
	public int getValue() { return value; }
	public String getSymbol() { return symbol; }
}


public class EnumEx2 {
	public static void main(String[] args) {
		for(Direction d : Direction.values()) 
			System.out.printf("%d %s = %d,%s%n", d.ordinal(), d.name(), d.getValue(), d.getSymbol());
		
	}
}

//	0 EAST = 15,>
//	1 SOUTH = 30,V
//	2 WEST = 45,<
//	3 NORTH = 60,^
