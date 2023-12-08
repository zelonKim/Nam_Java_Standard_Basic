package Stream4;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {
	public static void main(String[] args) {
//		Stream<String[]> strArrStrm = Stream.of(
//				new String[] {"abc", "def", "jkl"},
//				new String[] {"ABC", "GHI", "JKL"}
//		);
//		
//		Stream<Stream<String>> strStrm = strArrStrm.map((arr) -> Arrays.stream(arr));
//		
//		strStrm.forEach(System.out::println);
//		//		java.util.stream.ReferencePipeline$Head@1b28cdfa
//		//		java.util.stream.ReferencePipeline$Head@eed1f14
		
		
		
		///////////////////////////////////
		
		
		
//		Stream<String[]> strArrStrm = Stream.of(
//				new String[] {"abc", "def", "jkl"},
//				new String[] {"ABC", "GHI", "JKL"}
//		);
//		
//		Stream<String> strStrm = strArrStrm.flatMap((arr) -> Arrays.stream(arr));
//		
//		strStrm.forEach(System.out::println);
//		//		abc
//		//		def
//		//		jkl
//		//		ABC
//		//		GHI
//		//		JKL
//	

	
		
		
		
/////////////////////////////////////
		
		
		
		
		
		String[] lineArr = {
				"Believe or not It is good",
				"Do or do not There is no try"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		
		lineStream.flatMap(l -> Stream.of(l.split(" +")))
					.map(String::toLowerCase)
					.distinct()
					.sorted()
					.forEach(System.out::println);
		
		//		believe
		//		do
		//		good
		//		is
		//		it
		//		no
		//		not
		//		or
		//		there
		//		try
	}
	
}

