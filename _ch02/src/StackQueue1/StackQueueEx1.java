package StackQueue1;

import java.util.*;

public class StackQueueEx1 {
	public static void main(String[] args) {
		Stack st = new Stack(); // 'Stack 클래스'의 객체 생성
		Queue q = new LinkedList(); // 'Queue 인터페이스'를 상속받은 LinkedList 클래스의 객체 생성
		
		st.push("A"); // .push()를 통해 스택에 저장
		st.push("B");
		st.push("C");
		st.push("D");
		
		
		q.offer("A"); // .offer()를 통해 큐에 저장
		q.offer("B");
		q.offer("C");
		q.offer("D");
		
		
		while(!st.empty()) {
			System.out.print(st.pop()); // DCBA  // .pop()을 통해 스택에서 추출 (Last In First Out)
		}
		
		System.out.println("\n------");
		
		while(!q.isEmpty()) {
			System.out.print(q.poll()); // ABCD  // .poll()을 통해 큐에서 추출 (First In First Out)
		}
	}

}
