package Stream2;

import java.util.stream.Stream;

public class StreamEx2 {
	public static void main(String[] args) {

//		IntStream rStream1 = new Random().ints(5);
//		rStream1.forEach(System.out::print); // -310318779 -170060202 486746238 -462711946 320559646
		
//		IntStream rStream2 = new Random().ints(5,10);
//		rStream2.limit(20).forEach(System.out::print); // 6 9 6 5 6 6 7 5 8 9 6 9 6 9 5 5 5 8 6 9 
	
		
		
//		IntStream rgStream3 = IntStream.range(1, 5);
//		rgStream3.forEach(System.out::print); // 1 2 3 4
		
//		IntStream rgStream4 = IntStream.rangeClosed(1, 5);
//		rgStream4.forEach(System.out::print); // 1 2 3 4 5
		
		
		
		
//		Stream<Integer> lamStream1 = Stream.iterate(1, n -> n+2);
//		lamStream1.limit(5).forEach(System.out::print); // 1 3 5 7 9

		
		Stream<Integer> lamStream2 = Stream.generate( () -> 2);
		lamStream2.limit(5).forEach(System.out::print); // 2 2 2 2 2
		
	}

}
