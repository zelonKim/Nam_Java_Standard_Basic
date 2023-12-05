package Enum1;

enum Direction { EAST, SOUTH, WEST, NORTH }


public class EnumEx1 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("SOUTH");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
	
		System.out.println(d1); // EAST
		System.out.println(d2); // SOUTH
		System.out.println(d3); // EAST
		
		System.out.println(d1==d2); // false
		System.out.println(d1==d3); // true
		System.out.println(d1.equals(d3)); // true
		System.out.println(d1.compareTo(d3)); // 0
		System.out.println(d1.compareTo(d2)); // -1

		switch(d1) {
		case EAST: 
			System.out.println("This is EAST");
			break;
		case SOUTH:
			System.out.println("This is SOUTH");
			break;
		case WEST:
			System.out.println("This is WEST");
			break;
		case NORTH:
			System.out.println("This is NORTH");
			break;
		} // This is EAST

		Direction[] dArr = Direction.values();
		
		for(Direction d: dArr) System.out.printf("%s=%d%n", d.name(), d.ordinal());
//		EAST=0
//		SOUTH=1
//		WEST=2
//		NORTH=3
		
	
		}

}


