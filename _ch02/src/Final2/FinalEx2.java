package Final2;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;



import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;


class Student {
	String name;
	boolean isMale; // ����
	int hak;        // �г�
	int ban;        // ��
	int score;		// ����

	Student(String name, boolean isMale, int hak, int ban, int score) { 
		this.name	= name;
		this.isMale	= isMale;
		this.hak	= hak;
		this.ban	= ban;
		this.score  = score;
	}
	
	String	getName()    { return name;	}
	boolean  isMale()     { return isMale;	}
	int      getHak()     { return hak;	}
	int      getBan()     { return ban;	}
	int      getScore()   { return score;	}

	
	public String toString() { 
		return String.format("[%s, %s, %d�г� %d��, %3d��]", 
							name, isMale ? "��":"��", hak, ban, score); 
	}
	
   // groupingBy()���� ���
	enum Level { HIGH, MID, LOW }  
}



class FinalEx2 {
	public static void main(String[] args) {
		Student[] stuArr = {
			new Student("���ڹ�", true,  1, 1, 300),	
			new Student("������", false, 1, 1, 250),	
			new Student("���ڹ�", true,  1, 1, 200),	
			new Student("������", false, 1, 2, 150),	
			new Student("���ڹ�", true,  1, 2, 100),	
			new Student("������", false, 1, 2,  50),	
			new Student("Ȳ����", false, 1, 3, 100),	
			new Student("������", false, 1, 3, 150),	
			new Student("���ڹ�", true,  1, 3, 200),	
			new Student("���ڹ�", true,  2, 1, 300),	
			new Student("������", false, 2, 1, 250),	
			new Student("���ڹ�", true,  2, 1, 200),	
			new Student("������", false, 2, 2, 150),	
			new Student("���ڹ�", true,  2, 2, 100),	
			new Student("������", false, 2, 2,  50),	
			new Student("Ȳ����", false, 2, 3, 100),	
			new Student("������", false, 2, 3, 150),	
			new Student("���ڹ�", true,  2, 3, 200)	
		};


		Map<Boolean, List<Student>> stuBySex =  Stream.of(stuArr).collect(partitioningBy(Student::isMale));

		List<Student> maleStudent   = stuBySex.get(true);
		List<Student> femaleStudent = stuBySex.get(false);

		System.out.println("-----���л�-----");
		for(Student s : maleStudent)   System.out.println(s);
		//		[���ڹ�, ��, 1�г� 1��, 300��]
		//		[���ڹ�, ��, 1�г� 1��, 200��]
		//		[���ڹ�, ��, 1�г� 2��, 100��]
		//		[���ڹ�, ��, 1�г� 3��, 200��]
		//		[���ڹ�, ��, 2�г� 1��, 300��]
		//		[���ڹ�, ��, 2�г� 1��, 200��]
		//		[���ڹ�, ��, 2�г� 2��, 100��]
		//		[���ڹ�, ��, 2�г� 3��, 200��]
		
		
		System.out.println("-----���л�-----");
		for(Student s : femaleStudent) System.out.println(s);
		//		[������, ��, 1�г� 1��, 250��]
		//		[������, ��, 1�г� 2��, 150��]
		//		[������, ��, 1�г� 2��,  50��]
		//		[Ȳ����, ��, 1�г� 3��, 100��]
		//		[������, ��, 1�г� 3��, 150��]
		//		[������, ��, 2�г� 1��, 250��]
		//		[������, ��, 2�г� 2��, 150��]
		//		[������, ��, 2�г� 2��,  50��]
		//		[Ȳ����, ��, 2�г� 3��, 100��]
		//		[������, ��, 2�г� 3��, 150��]
		
		
		////////////////////////////////////
		
		

		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
				.collect(partitioningBy(Student::isMale, counting()));

		System.out.println("���л� �� :"+ stuNumBySex.get(true)); // ���л� �� :8
		System.out.println("���л� �� :"+ stuNumBySex.get(false));  // ���л� �� :10

		
		////////////////////////////////////
		
		

		Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
				.collect(partitioningBy(Student::isMale,
							maxBy(comparingInt(Student::getScore))
				));
		System.out.println("���л� 1�� :"+ topScoreBySex.get(true)); // ���л� 1�� :Optional[[���ڹ�, ��, 1�г� 1��, 300��]]
		System.out.println("���л� 1�� :"+ topScoreBySex.get(false)); // ���л� 1�� :Optional[[������, ��, 1�г� 1��, 250��]]

		
		
		
		Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
			.collect(partitioningBy(Student::isMale, 
				collectingAndThen(
					maxBy(comparingInt(Student::getScore)), Optional::get
				)
			));

		System.out.println("���л� 1�� :"+ topScoreBySex2.get(true)); // ���л� 1�� :[���ڹ�, ��, 1�г� 1��, 300��]
		System.out.println("���л� 1�� :"+ topScoreBySex2.get(false)); // ���л� 1�� :[������, ��, 1�г� 1��, 250��]
		
		
		
		////////////////////////////////////
		
		
		


		Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = 
			Stream.of(stuArr).collect(partitioningBy(Student::isMale, 
				partitioningBy(s -> s.getScore() <= 150))
			); 
		List<Student> failedMaleStu   = failedStuBySex.get(true).get(true);
		List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);

		for(Student s : failedMaleStu)   System.out.println(s);
		//		[���ڹ�, ��, 1�г� 2��, 100��]
		//		[���ڹ�, ��, 2�г� 2��, 100��]
		
		for(Student s : failedFemaleStu) System.out.println(s);
		//		[������, ��, 1�г� 2��, 150��]
		//		[������, ��, 1�г� 2��,  50��]
		//		[Ȳ����, ��, 1�г� 3��, 100��]
		//		[������, ��, 1�г� 3��, 150��]
		//		[������, ��, 2�г� 2��, 150��]
		//		[������, ��, 2�г� 2��,  50��]
		//		[Ȳ����, ��, 2�г� 3��, 100��]
		//		[������, ��, 2�г� 3��, 150��]
		
		
		
		
		
		/////////////////////////////////
		
		
		
		

		Map<Integer, List<Student>> stuByBan = Stream.of(stuArr)
				.collect(groupingBy(Student::getBan));

		for(List<Student> ban : stuByBan.values()) {
			for(Student s : ban) {
				System.out.println(s);
			}
		}
		//		[���ڹ�, ��, 1�г� 1��, 300��]
		//		[������, ��, 1�г� 1��, 250��]
		//		[���ڹ�, ��, 1�г� 1��, 200��]
		//		[���ڹ�, ��, 2�г� 1��, 300��]
		//		[������, ��, 2�г� 1��, 250��]
		//		[���ڹ�, ��, 2�г� 1��, 200��]
		//		[������, ��, 1�г� 2��, 150��]
		//		[���ڹ�, ��, 1�г� 2��, 100��]
		//		[������, ��, 1�г� 2��,  50��]
		//		[������, ��, 2�г� 2��, 150��]
		//		[���ڹ�, ��, 2�г� 2��, 100��]
		//		[������, ��, 2�г� 2��,  50��]
		//		[Ȳ����, ��, 1�г� 3��, 100��]
		//		[������, ��, 1�г� 3��, 150��]
		//		[���ڹ�, ��, 1�г� 3��, 200��]
		//		[Ȳ����, ��, 2�г� 3��, 100��]
		//		[������, ��, 2�г� 3��, 150��]
		//		[���ڹ�, ��, 2�г� 3��, 200��]

		
		///////////////////////
		
		
		Map<Student.Level, List<Student>> stuByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
						 if(s.getScore() >= 200) return Student.Level.HIGH;
						 else if(s.getScore() >= 100) return Student.Level.MID;
						 else                         return Student.Level.LOW;
				}));

		TreeSet<Student.Level> keySet = new TreeSet<>(stuByLevel.keySet());

		for(Student.Level key : keySet) {
			System.out.println("["+key+"]");

			for(Student s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}
		//		[HIGH]
		//		[���ڹ�, ��, 1�г� 1��, 300��]
		//		[������, ��, 1�г� 1��, 250��]
		//		[���ڹ�, ��, 1�г� 1��, 200��]
		//		[���ڹ�, ��, 1�г� 3��, 200��]
		//		[���ڹ�, ��, 2�г� 1��, 300��]
		//		[������, ��, 2�г� 1��, 250��]
		//		[���ڹ�, ��, 2�г� 1��, 200��]
		//		[���ڹ�, ��, 2�г� 3��, 200��]
		//
		//		[MID]
		//		[������, ��, 1�г� 2��, 150��]
		//		[���ڹ�, ��, 1�г� 2��, 100��]
		//		[Ȳ����, ��, 1�г� 3��, 100��]
		//		[������, ��, 1�г� 3��, 150��]
		//		[������, ��, 2�г� 2��, 150��]
		//		[���ڹ�, ��, 2�г� 2��, 100��]
		//		[Ȳ����, ��, 2�г� 3��, 100��]
		//		[������, ��, 2�г� 3��, 150��]
		//
		//		[LOW]
		//		[������, ��, 1�г� 2��,  50��]
		//		[������, ��, 2�г� 2��,  50��]

		//////////////////////////////////
		
		

		Map<Student.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
					     if(s.getScore() >= 200) return Student.Level.HIGH;
					else if(s.getScore() >= 100) return Student.Level.MID;
					else                         return Student.Level.LOW;
				}, counting()));
		for(Student.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d��, ", key, stuCntByLevel.get(key)); // [MID] - 8��, [LOW] - 2��, [HIGH] - 8��, 
		System.out.println();
/*
		for(List<Student> level : stuByLevel.values()) {
			System.out.println();
			for(Student s : level) {
				System.out.println(s);
			}
		}
*/
		
		
		///////////////////////////////
		
		
		Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan =
          Stream.of(stuArr)
				.collect(groupingBy(Student::getHak,
						 groupingBy(Student::getBan)
				));

		for(Map<Integer, List<Student>> hak : stuByHakAndBan.values()) {
			for(List<Student> ban : hak.values()) {
				System.out.println();
				for(Student s : ban)
					System.out.println(s);
			}
		}
		//		[���ڹ�, ��, 1�г� 1��, 300��]
		//		[������, ��, 1�г� 1��, 250��]
		//		[���ڹ�, ��, 1�г� 1��, 200��]
		//
		//		[������, ��, 1�г� 2��, 150��]
		//		[���ڹ�, ��, 1�г� 2��, 100��]
		//		[������, ��, 1�г� 2��,  50��]
		//
		//		[Ȳ����, ��, 1�г� 3��, 100��]
		//		[������, ��, 1�г� 3��, 150��]
		//		[���ڹ�, ��, 1�г� 3��, 200��]
		//
		//		[���ڹ�, ��, 2�г� 1��, 300��]
		//		[������, ��, 2�г� 1��, 250��]
		//		[���ڹ�, ��, 2�г� 1��, 200��]
		//
		//		[������, ��, 2�г� 2��, 150��]
		//		[���ڹ�, ��, 2�г� 2��, 100��]
		//		[������, ��, 2�г� 2��,  50��]
		//
		//		[Ȳ����, ��, 2�г� 3��, 100��]
		//		[������, ��, 2�г� 3��, 150��]
		//		[���ڹ�, ��, 2�г� 3��, 200��]

		
		/////////////////////////////
		
		
		Map<Integer, Map<Integer, Student>> topStuByHakAndBan =
          Stream.of(stuArr)
				.collect(groupingBy(Student::getHak,
						 groupingBy(Student::getBan,
						     collectingAndThen(
						         maxBy(comparingInt(Student::getScore))
						         , Optional::get
						     )
						 )
				));

		for(Map<Integer, Student> ban : topStuByHakAndBan.values())
			for(Student s : ban.values())
				System.out.println(s);
		//		[���ڹ�, ��, 1�г� 1��, 300��]
		//		[������, ��, 1�г� 2��, 150��]
		//		[���ڹ�, ��, 1�г� 3��, 200��]
		//		[���ڹ�, ��, 2�г� 1��, 300��]
		//		[������, ��, 2�г� 2��, 150��]
		//		[���ڹ�, ��, 2�г� 3��, 200��]
		
		////////////////////////
		
		
		Map<String, Set<Student.Level>> stuByScoreGroup = Stream.of(stuArr)
			.collect(groupingBy(s-> s.getHak() + "-" + s.getBan(),
					mapping(s-> {
						 if(s.getScore() >= 200) return Student.Level.HIGH;
					else if(s.getScore() >= 100) return Student.Level.MID;
						 else                    return Student.Level.LOW;
					} , toSet())
			));

		Set<String> keySet2 = stuByScoreGroup.keySet();

		for(String key : keySet2) {
			System.out.println("["+key+"]" + stuByScoreGroup.get(key));
			
		//		[1-1][HIGH]
		//		[2-1][HIGH]
		//		[1-2][MID, LOW]
		//		[2-2][MID, LOW]
		//		[1-3][MID, HIGH]
		//		[2-3][MID, HIGH]
		}
	}
}
