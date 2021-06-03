package ch03;

import java.util.Scanner;

public class SwitchEx03 {
	
	public static void main(String[] args) {
		
		System.out.println("당신의 주민번호를 입력해주세요(010101-1111111)>>");
		
		Scanner sc = new Scanner(System.in);
		
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
			case '1': case '3':
				System.out.println("당신은 남자입니다.");
			break;
			case '2': case '4':
				System.out.println("당신은 여자입니다.");
			break;
			default:
				System.out.println("주민번호를 정확히 입력해주세요");
		}
		
	// Switch문도 중첩으로 작성할 수 있다. // break; 빠뜨리지 말것!!
		
		System.out.println("당신의 주민번호를 입력해주세요(010101-1111111)>>");
		
		String regNo2 = sc.nextLine();
		char gender2 = regNo2.charAt(7);
		
		switch(gender2) {
			case '1': case '3':
				switch(gender2) {
					case '1':
						System.out.println("당신은 2000년 전에 출생한 남자입니다.");
					break;
					case '3':
						System.out.println("당신은 2000년 후에 출생한 남자입니다");
					break;
				}
			break;
			case '2': case '4':
				switch(gender2) {
					case '2':
						System.out.println("당신은 2000년 전에 출생한 여자입니다");
						break;
					case '4':
						System.out.println("당신은 2000년 후에 출생한 여자입니다");
						break;
				}
			break;
			default: 
				System.out.println("주민번호를 정확히 입력해주세요!");
		}
		
	
	}

}
