package ch11;

import java.util.*;

public class Ex11_2 {

	public static void main(String[] args) {
		
		// Stack : Ŭ������ ������� �ֱ⿡ -> �ٷ� ��ü �����ϸ� �ȴ�
			Stack st = new Stack();
		
		// Queue : �������̽��� ���ǵǾ� �ֱ⿡ -> �ٷ� ��ü �����Ұ� 
		// Queue�������̽��� ������ Ŭ���� ��ü �����ؼ� Queue��ɸ� ����� �� �ֵ��� �������� Ÿ���� Queue�� ����
			Queue q = new LinkedList();
			
		// stack�� ��ü �߰�
			st.push("0");
			st.push("1");
			st.push("2");
			
		// queue�� ��ü �߰�
			q.offer("0");
			q.offer("1");
			q.offer("2");
			
		// stack�� ����Ǿ� �ִ� ��ҵ� �ϳ��� ������
			System.out.println(" == Stack == ");
			while(!st.empty()) { 
				System.out.println(st.pop()); // 0,1,2�� ����Ǿ����� 2,1,0���� ��µǴ� ���� �� �� �ֵ�.
			}
		
		// Queue�� ����Ǿ� �ִ� ��ҵ� �ϳ��� ������
			System.out.println(" == Queue == ");
			while(!q.isEmpty()) {
				System.out.println(q.poll());
			}
		}
}
