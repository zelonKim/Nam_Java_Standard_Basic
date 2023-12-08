package Stream3;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx3 {

	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex2.pdf"), new File("Ex3.java"), new File("Ex4"), new File("Ex5.txt") };
		
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		Stream<String> fileNameStream = fileStream.map((f) -> f.getName());
		fileNameStream.forEach(System.out::println); 
		//		Ex1.java
		//		Ex2.pdf
		//		Ex3.java
		//		Ex4
		//		Ex5.txt
		
		
		///////////////////////////////
		
		
		fileStream = Stream.of(fileArr); // ��Ʈ���� �����
		
		fileStream.map((f) -> f.getName())
			.filter(s -> s.indexOf('.')!=-1) // Ȯ���� ���� ���� ������.
			.peek(s -> System.out.printf("filename=%s%n",s)) // filename=Ex1.java  filename=Ex2.pdf  filename=Ex3.java  filename=Ex5.txt
			.map(s -> s.substring(s.indexOf('.')+1)) // Ȯ���ڸ� ������.
			.peek(s -> System.out.printf("extension=%s%n",s)) // extension=java  extension=pdf  extension=java  extension=txt
			.map(String::toUpperCase)
			.distinct() // �ߺ� ����
			.forEach(System.out::println);
			//		JAVA
			//		PDF
			//		TXT
		
		
		
		
		
	}

}
