package ch04;

import java.util.Scanner;

public class doWhileEx01 {
	
	public static void main(String[] args) {
		
	/*
	 * <do-while문>
	 * 
	 * # 구조 
	 * 	   do{
	 * 		  // 조건식의 연산결과가 참일 때 수행될 문장
	 * 		}
	 * 	   while(조건식);
	 * 
	 * # while문과 달리 무조건 처음은 do바디 안의 문장들이 실행되고, 그 후에는 조건식을 만족할 때만 수행된다.
	 * # 반복적으로 사용자의 입력을 받아야 할 때 유용..?
	 * 	
	 */
		
		
// Math.random()을 사용하여 1과 100사이의 임의의 수를 변수 answer에 저장하고, 이 값을 맞출 때 까지 반복하는 예제
		
	int answer = 0;
	int input = 0;
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * do { System.out.println("1과 100사이의 정수를 입력하세요>>"); input =
	 * Integer.parseInt(sc.nextLine()); answer = (int)(Math.random()*100)+1;
	 * 
	 * if(input<answer) { System.out.println("더 큰 수로 도전해 보세요!"); }else
	 * if(input>answer){ System.out.println("더 작은 수로 도전해 보세요!"); } }while(answer !=
	 * input);
	 * 
	 * System.out.println("정답입니다!!");
	 * 
	 * 
	 * System.out.println();
	 */

//(★로직 반복★)숫자 중 3의 배수(3,6,9)가 포함되어 있으면, 포함된 개수만큼 박수를 치는 369게임을 1부터 100까지 출력하는 예제
	
	for(int i=1;i<=100;i++) {
		System.out.printf("i= %d",i);
		
		int temp = i;
		
		do {
			// temp%10(=temp의 끝자리)이 3의 배수인지 확인(0제외) 
			if(temp%10%3 == 0 && temp%10 != 0)
				System.out.print(" 짝!");
		// temp /= 10은 temp = temp / 10과 동일
		}while((temp /= 10) != 0);
		
		System.out.println();
	}
	
	
	
		
	}//main()

}
