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
		map.put("steve", "1234"); // key�� "steve"��  value�� "1234"�� ��ü��.
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��� �ּ���");
			System.out.print("���̵�: ");
			String id = s.nextLine().trim();
			
			System.out.println("��й�ȣ: ");
			String password = s.nextLine().trim();
			System.out.println();
			
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) { 
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			} else {
				System.out.println("���������� �α��� �Ǿ����ϴ�.");
				break;
			}
		}
		// (�Է�) ���̵�: Lisa, ��й�ȣ: 1234
		// (���) ���������� �α��� �Ǿ����ϴ�.
			
		// (�Է�) ���̵�: steve, ��й�ȣ: 5678
		// (���) ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		
	    // (�Է�) ���̵�: steve, ��й�ȣ: 1234
		// (���) ���������� �α��� �Ǿ����ϴ�.
*/			
			
		
//////////////////////////
		
		
		/*
		 * HashMap map = new HashMap(); map.put("��OO", new Integer(90)); map.put("��OO",
		 * new Integer(100)); map.put("��OO", new Integer(60)); map.put("��OO", new
		 * Integer(70)); map.put("��OO", new Integer(90));
		 * 
		 * Set set = map.entrySet(); Iterator it = set.iterator();
		 * 
		 * while(it.hasNext()) { Map.Entry e = (Map.Entry)it.next(); // Entry�� Map�� ����
		 * �������̽���. System.out.println("�̸�:" + e.getKey() + ", ����: " + e.getValue()); }
		 * 
		 * set = map.keySet(); System.out.println("������ ���: " + set);
		 * 
		 * Collection values = map.values(); it = values.iterator();
		 * 
		 * int total = 0;
		 * 
		 * while(it.hasNext()) { int i = (int)it.next(); total += i; }
		 * 
		 * System.out.println("����: "+ total); System.out.println("���: "+
		 * (float)total/set.size()); System.out.println("�ְ� ����: "+
		 * Collections.max(values)); System.out.println("���� ����: "+
		 * Collections.min(values));
		 */
		
//		�̸�:��OO, ����: 70
//		�̸�:��OO, ����: 60
//		�̸�:��OO, ����: 100
//		�̸�:��OO, ����: 90
//		������ ���: [��OO, ��OO, ��OO, ��OO]
//		����: 320
//		���: 80.0
//		�ְ� ����: 100
//		���� ����: 60
		
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

