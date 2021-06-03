package ch04;

import java.util.Scanner;

public class ForEx01 {
	
	public static void main(String[] args) {
		
	// 어떠한 작업이 반복적으로 수행되어야 한다면 => 반복문 사용! 
	// - for, while,do-while
	// 반복 횟수를 알 고 있다면 -> for
	// 얼마나 반복해야 할 지 모르겠다면 -> while
	// 얼마나 반복해야 할 지 모르겠지만 일단 처음 한 번은 실행되어야 한다면 -> do-while
		
	// <for문>
	// for(초기식;조건식;증감식){
	//     조건식이 참일 때 반복 수행되어야 하는 작업
	//   }
		
		
	// 중첩 for문 예시
		
	// 1. 별찍기
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
	// 2. 사용자로부터 입력받은 숫자만큼 별 찍기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요>>");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	
	// 3. 반대로 찍어보기(왼쪽 정렬)
		for(int i=0;i<5;i++) {
			for(int j=5;i<j;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
	// 4. 오른쪽 정렬 
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	// 5. 
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

// 2단 ~ 9단 반복 
		
		for(int i=2;i<10;i++) {
				System.out.printf("%d단 %n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d %n",i,j,i*j);
			}
		}
		
		System.out.println();
		
		// 가로로 출력 
		for(int i=2;i<=9;i++) {
			System.out.printf("%d단 \t",i);
		}
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%d \t",j,i,(j*i));
			}
			System.out.println();
		}
		
// 반복문 3개 일때 111 112 113 121 122 123...
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					System.out.println(""+i+j+k);
				}
			}
		}
		
		System.out.println();
		
		
// [1,1] [2,2] ...
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]",i,j);
				}else {
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}
		
		
	}

}
