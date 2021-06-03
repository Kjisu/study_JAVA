package ch11;

import java.util.Stack;

public class Ex11_3 {

	public static void main(String[] args) {
		
	// 괄호 검사하기
		
		Stack st = new Stack(); // 밑이 막혀있는 상자 하나 생성
		
		String expression = "((3+5*8-2)";
		
		System.out.println(expression);
		
		for(int i=0;i<expression.length();i++) {
			
			char ch = expression.charAt(i);
			
			if(ch == '(') {
				st.push(ch+""); // 문자열 하나씩 검사하면서 '('일때만 stack에 저장=> 그럼 stack에는 '('만 저장된다
			}else if(ch == ')') {
				st.pop(); // 검사한 문자가 ')'라면 stack에 저장되어 있던 '('를 제거한다.
			}
		}
		
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}

	}
}
