package ch11;

import java.util.*;

public class Ex11_2 {

	public static void main(String[] args) {
		
		// Stack : 클래스로 만들어져 있기에 -> 바로 객체 생성하면 된다
			Stack st = new Stack();
		
		// Queue : 인터페이스에 정의되어 있기에 -> 바로 객체 생성불가 
		// Queue인터페이스를 구현한 클래스 객체 생성해서 Queue기능만 사용할 수 있도록 참조변수 타입을 Queue로 지정
			Queue q = new LinkedList();
			
		// stack에 객체 추가
			st.push("0");
			st.push("1");
			st.push("2");
			
		// queue에 객체 추가
			q.offer("0");
			q.offer("1");
			q.offer("2");
			
		// stack에 저장되어 있는 요소들 하나씩 꺼내기
			System.out.println(" == Stack == ");
			while(!st.empty()) { 
				System.out.println(st.pop()); // 0,1,2로 저장되었지만 2,1,0으로 출력되는 것을 볼 수 있따.
			}
		
		// Queue에 저장되어 있는 요소들 하나씩 꺼내기
			System.out.println(" == Queue == ");
			while(!q.isEmpty()) {
				System.out.println(q.poll());
			}
		}
}
