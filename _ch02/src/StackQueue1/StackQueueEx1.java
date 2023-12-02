package StackQueue1;

import java.util.*;

public class StackQueueEx1 {
	public static void main(String[] args) {
		Stack st = new Stack(); // 'Stack Ŭ����'�� ��ü ����
		Queue q = new LinkedList(); // 'Queue �������̽�'�� ��ӹ��� LinkedList Ŭ������ ��ü ����
		
		st.push("A"); // .push()�� ���� ���ÿ� ����
		st.push("B");
		st.push("C");
		st.push("D");
		
		
		q.offer("A"); // .offer()�� ���� ť�� ����
		q.offer("B");
		q.offer("C");
		q.offer("D");
		
		
		while(!st.empty()) {
			System.out.print(st.pop()); // DCBA  // .pop()�� ���� ���ÿ��� ���� (Last In First Out)
		}
		
		System.out.println("\n------");
		
		while(!q.isEmpty()) {
			System.out.print(q.poll()); // ABCD  // .poll()�� ���� ť���� ���� (First In First Out)
		}
	}

}
