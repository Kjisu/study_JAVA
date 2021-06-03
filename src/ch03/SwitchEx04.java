package ch03;

import java.util.Scanner;

public class SwitchEx04 {
	
	public static void main(String[] args) {
		
		System.out.println("당신의 점수를 입력하세요>>");
		
		Scanner sc = new Scanner(System.in);
		
		int score = Integer.parseInt(sc.nextLine());
		char grade = ' ';
		
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
			break;
			case 8:
				grade = 'B';
			break;
			case 7:
				grade = 'C';
			break;
			default : 
				if(score>100) System.out.println("점수를 다시 입력해주세요");
		}
		
		System.out.println("당신은 "+grade+"등급 입니다.");
		
	}

}
