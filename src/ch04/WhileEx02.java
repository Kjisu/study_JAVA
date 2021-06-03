package ch04;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {

// 10~0까지 1씩 감소시켜가면서 출력을 하되, for문으로 매 출력마다 약간의 시간이 지연되도록 처리
	
	int i = 11;
	while(i--!=0) {
		System.out.println(i);
		
		// 다음 카운트로 넘어가기 전에(while조건문으로 돌아가기 전에) 약간의 시간 지연시키기
		// 왜 시간지연이 안되지,,,;; 
		for(int j=0;j<10_000_000;j++) { ; } 
	}
	System.out.println("GAME OVER!");
		
		
// 사용자로 부터 입력받은 숫자의 각 자리 합 구하기
	int sum = 0;
	int num = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자를 입력하세요.(예:1234)>>");
	num = Integer.parseInt(sc.nextLine());
	while(num != 0) {
		sum += num%10;
		/* final int temp = Integer.toString(num).length(); */
		System.out.printf("숫자= %d 합= %d %n",num,sum);
		num = num/10; // 맨 끝자리 버려짐
	}
	
	System.out.println();
	
// 1부터 몇 까지 더하면 누적합계가 100을 넘지 않는 제일 큰 수가 되는지 알아내기
		
	sum = 0;
	num = 0;
	
	while((sum += ++num)<=100) { // 꼭 괄호 쳐줘야 함 <연산자가 +=보다 우세하기 때문
		System.out.printf("번호 : %d , 합 : %d %n",num,sum);
	}
	System.out.printf("번호 : %d , 합 : %d %n",num,sum); // 변수에 100이상의 값은 담은 후 조건문을 비교하기 때문에 
													   // 14 , 103의 값이 나오게 된다.

	System.out.println();
	
	
// 사용자로부터 반복해서 숫자를 입력받다가 0을 입력하면 입력을 마치고 총 합 출력하기	
	num = 0;
	sum = 0;
	
	
	/* <방법1> break이용하여 루프 멈추기
	 * while(true) { System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력) >>");
	 * 
	 * num = Integer.parseInt(sc.nextLine());
	 * 
	 * if(num == 0) break;
	 * 
	 * sum += num;
	 * 
	 * }
	 * 
	 * System.out.println("합계 : "+sum);
	 */
	 
	//<방법2> boolean변수 만들어서 루프 멈추게 하기
	
	boolean result = true;
	
	System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력하세요)");
	
	while(result) {
		System.out.println(">>");
		num = Integer.parseInt(sc.nextLine());
		
		if(num == 0) result = false;
		
		sum += num;
	}
	
	System.out.println("합계 : "+sum);
	

	}// main()
	
}
