package HashMap1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
	public static void main(String[] args) {
	/*	HashMap map = new HashMap();
		map.put("Lisa", "1234");
		map.put("steve", "5678");
		map.put("steve", "1234"); // key인 "steve"의  value가 "1234"로 대체됨.
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요");
			System.out.print("아이디: ");
			String id = s.nextLine().trim();
			
			System.out.println("비밀번호: ");
			String password = s.nextLine().trim();
			System.out.println();
			
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) { 
				System.out.println("비밀번호가 일치하지 않습니다.");
			} else {
				System.out.println("정상적으로 로그인 되었습니다.");
				break;
			}
		}
		// (입력) 아이디: Lisa, 비밀번호: 1234
		// (출력) 정상적으로 로그인 되었습니다.
			
		// (입력) 아이디: steve, 비밀번호: 5678
		// (출력) 비밀번호가 일치하지 않습니다.
		
	    // (입력) 아이디: steve, 비밀번호: 1234
		// (출력) 정상적으로 로그인 되었습니다.
*/			
			
		
//////////////////////////
		
		
		/*
		 * HashMap map = new HashMap(); map.put("김OO", new Integer(90)); map.put("김OO",
		 * new Integer(100)); map.put("이OO", new Integer(60)); map.put("박OO", new
		 * Integer(70)); map.put("최OO", new Integer(90));
		 * 
		 * Set set = map.entrySet(); Iterator it = set.iterator();
		 * 
		 * while(it.hasNext()) { Map.Entry e = (Map.Entry)it.next(); // Entry는 Map의 내부
		 * 인터페이스임. System.out.println("이름:" + e.getKey() + ", 점수: " + e.getValue()); }
		 * 
		 * set = map.keySet(); System.out.println("참가자 명단: " + set);
		 * 
		 * Collection values = map.values(); it = values.iterator();
		 * 
		 * int total = 0;
		 * 
		 * while(it.hasNext()) { int i = (int)it.next(); total += i; }
		 * 
		 * System.out.println("총점: "+ total); System.out.println("평균: "+
		 * (float)total/set.size()); System.out.println("최고 점수: "+
		 * Collections.max(values)); System.out.println("최저 점수: "+
		 * Collections.min(values));
		 */
		
//		이름:박OO, 점수: 70
//		이름:이OO, 점수: 60
//		이름:김OO, 점수: 100
//		이름:최OO, 점수: 90
//		참가자 명단: [박OO, 이OO, 김OO, 최OO]
//		총점: 320
//		평균: 80.0
//		최고 점수: 100
//		최저 점수: 60
		
//////////////////////////
		
//		String [] data = {"A", "D", "B", "D", "C", "B", "D", "D", "C", "C" };
//		
//		HashMap map = new HashMap();
//		
//		for (int i = 0; i <data.length; i++) {
//			if(map.containsKey(data[i])) {
//				int value = (int)map.get(data[i]);
//				map.put(data[i], value + 1);
//			} else {
//				map.put(data[i], 1);
//			}
//		}
//		
//		Iterator it = map.entrySet().iterator();
//		
//		while(it.hasNext()) {
//			Map.Entry entry = (Map.Entry)it.next();
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
////		A:1
////		B:2
////		C:3
////		D:4
		
		
		}
	}

