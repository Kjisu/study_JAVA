package ch11;

import java.util.Stack;

public class Ex11_3 {

	public static void main(String[] args) {
		
	// ��ȣ �˻��ϱ�
		
		Stack st = new Stack(); // ���� �����ִ� ���� �ϳ� ����
		
		String expression = "((3+5*8-2)";
		
		System.out.println(expression);
		
		for(int i=0;i<expression.length();i++) {
			
			char ch = expression.charAt(i);
			
			if(ch == '(') {
				st.push(ch+""); // ���ڿ� �ϳ��� �˻��ϸ鼭 '('�϶��� stack�� ����=> �׷� stack���� '('�� ����ȴ�
			}else if(ch == ')') {
				st.pop(); // �˻��� ���ڰ� ')'��� stack�� ����Ǿ� �ִ� '('�� �����Ѵ�.
			}
		}
		
			if(st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			}else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}

	}
}
