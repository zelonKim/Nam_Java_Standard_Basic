package Final1;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FinalEx1 {

	public static void main(String[] args) {
		String[] nameArr = {
			"Liam", "Noah" , "Oliver", "James", "Emma", "Amelia", "Sophia", "Luna"
		};
		
		IntStream intStrm1 = Stream.of(nameArr).mapToInt(String::length); // IntStream  mapToInt(ToIntFunction<T> mapper)
		IntStream intStrm2 = Stream.of(nameArr).mapToInt(String::length).peek(System.out::println); // 4 4 6 5 4 6 6 4

		
		// accumulator의 첫번째 매개변수에는 누적 결과가 담김.
		int nameCount = intStrm1.reduce(0, (a, b) -> a + 1); // T reduce(T identity, BinaryOperator<T> accumulator)
		System.out.println(nameCount); // 8 
		
		
		// accumulator의 두번째 매개변수에는 스트림의 각 요소가 담김.
		int nameSum = intStrm2.reduce(0, (a, b) -> a + b); 
		System.out.println(nameSum); // 39
		// int a = 0;
		// for(int b: intStrm2) a = a + b;
		
		
		
		
		//////////////////////////////
		
		
		
		Stream<String> nameStrm1 = Stream.of(nameArr);
		List<String> namesList = nameStrm1.collect(Collectors.toList()); // List로 변환함.
		System.out.println(namesList); // [Liam, Noah, Oliver, James, Emma, Amelia, Sophia, Luna]
		
		
		Stream<String> nameStrm2 = Stream.of(nameArr);
		long namesCount = nameStrm2.collect(Collectors.counting());
		System.out.println(namesCount); // 8
		
		
		Stream<String> nameStrm3 = Stream.of(nameArr);
		String namesJoin = nameStrm3.collect(Collectors.joining());
		System.out.println(namesJoin); // LiamNoahOliverJamesEmmaAmeliaSophiaLuna
		
		
		
	}

}
