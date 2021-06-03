package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	
	// Queue 사용하기 위해 객체 생성
		static Queue q = new LinkedList();
		
	// Queue에 최대 5개만 저장되도록 한다 (최근 5개의 입력한 명령어 5개만 보여준다)
		static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			
			System.out.println(">>");
			
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim(); // 입력받은 문자열의 앞,뒤 공백을 제거해줌
			
			if("".equals(input)) continue; // 입력한 내용이 없으면 밑의 내용을 실행하지 않고 while(true)로 간다
										   // input.equals(null);이라고 쓰지 않은 이유는 -> input값이 null인 경우 nullPointException이 발생해서 
										   // 실행조차 되지 않기 때문.
			if(input.equalsIgnoreCase("q")) {
				System.exit(0); // q 입력시 프로그램 종료
				
			}else if(input.equalsIgnoreCase("help")) {
				System.out.println("help - 도움말을 보여줌니다");
				System.out.println("q 또는 Q - 프로그램을 종료합니다");
				System.out.println("history - 최근에 입력한 명령어"+MAX_SIZE+"개를 보여줍니다");
				save(input);
				
			}else if(input.equalsIgnoreCase("history")) {
				// 입력받은 명령어를 저장하고
				save(input);
				
				// linkedlist의 내용을 보여준다
				LinkedList list = (LinkedList)q;
				
				final int SIZE = list.size();
				for(int i=0;i<SIZE;i++) {
					System.out.println((i+1)+". "+list.get(i));
				}
			}else {
				save(input);
				System.out.println(input);
			}
			
			
		}// while(true)

	}//main()
	
	public static void save(String input) {
		
		// 사용자가 입력한 단어를 queue에 저장한다
		if(!"".equals(input)) q.offer(input); 
		
		// q에 저장되어 있는 갯수가 5개 초과할 경우 맨 먼저 들어온 데이터부터 삭제한다
		if(q.size()>MAX_SIZE) q.remove();// 원래는 참조변수타입이 Queue여서 size()를 사용할 수 없지만 중간에 Linkedlist로 만들어서 사용할 수 있게 됨
	}

}
