package ch03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요>>");
		
		int user = sc.nextInt();
		int com = ((int)Math.random()*3)+1;
		// 랜덤수 구하기
		// 1. 각 변에 3을 곱한다
		// 2. int형으로 변환한다 (int형으로 변환하면 소수점 뒷자리는 버려지고 정수만 남게 된다)
		// 3. 1을 더한다
		
		System.out.println("당신은 "+user+" 입니다");
		System.out.println("컴은  "+com+" 입니다");
		
		switch(user-com) {
			case 2 : case -1 :
				System.out.println("당신이 졌습니다");
			break;
			case 1: case -2:
				System.out.println("당신이 이겼습니다.");
			break;
			case 0:
				System.out.println("비겼습니다.");
			break;
			default:
				System.out.println("1~3사이의 숫자를 입력해주세요");
		}
		
		
	}
}
