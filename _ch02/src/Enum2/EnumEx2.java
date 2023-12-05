package Enum2;

enum Direction {
	EAST(15, ">"), 
	SOUTH(30, "V"),
	WEST(45, "<"),
	NORTH(60, "^");
	// 열거상수에 원하는 값을 괄호()안에 넣어줌.
	
	private final int value;
	private final String symbol;

	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	// 인스턴스 변수와 생성자를 추가해줌.
	
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
