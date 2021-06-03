package ch04;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		
/*
 * <continue문>
 * 
 * # 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
 *    - for문 : 증감식으로 이동 
 *    - while문 : 조건식으로 이동
 * # 전체 반복 중 특정 조건을 만족하는 경우에만 잠시 반복문 작업을 skip하고 싶을 때 사용!
 */

// 1~10사이의 숫자를 출력하되 그 중에서 3의 배수인 것은 제외하기
	
	for(int i=0;i<=10;i++) {
		
		if(i%3 == 0) continue;
		
		System.out.println(i);
	}
	
	System.out.println();


//-------------------------------------------------------------------------------
/*
 * <이름 붙은 반복문>
 * 
 * # break문 : 근접한 단 하나의 반복문만 벗어날 수 있음
 * 		=> 여러 개의 반복문이 중첩될 경우 break;만으로는 여러 개의 반복문을 완전히 벗어날 수 없다.
 * # 반복문에 이름을 붙이면, 하나 이상의 반복문을 벗어날 수 있음!
 * 
 */
	
// for문에 Loop1이라는 이름 붙이기
	Loop1 : for(int i=2;i<9;i++) {
		for(int j=1;j<9;j++) {
			if(j == 5)
				break Loop1; // 전체 for문 빠져나갈 수 있음
				//break; // 두번째 for문만 빠져나가게 된다
			System.out.println(i+"*"+j+" = "+i*j);
		}// end of for j
	}// end of for i
	

// 메뉴를 선택하면 해당 연산을 반복적으로 수행할 수 있도록 for문 추가
	
	int price = 0;
	int totalSum = 0;
	
	Scanner sc = new Scanner(System.in);
	
	outer : 
	while(true) {
		System.out.println("1. 코코팜  700원");
		System.out.println("2. 코카콜라 700원 ");
		System.out.println("3. 데미소다 애플맛 800원 ");
		System.out.println("원하는 메뉴를 선택하세요(종료 : 0)>>");
		
		int selected = sc.nextInt();
		
		if(selected == 0) {
			System.out.println("시스템을 종료합니다.");
			break;
		}else if(!(1<=selected && selected<=3)) {
			System.out.println("메뉴를 잘 못 선택하셨습니다.(종료는 0)");
			continue;
		}
		
		// 1~3번 사이의 메뉴를 선택한 경우
		switch(selected) {
			case 1:
				totalSum += 700;
				break;
			case 2:
				totalSum += 700;
				break;
			case 3:
				totalSum += 800;
				break;
			}
		System.out.println("총 지불해야 할 금액 : "+totalSum);
		
		
	}//outer: while(true)
	
	
	
		
		
	}

}
