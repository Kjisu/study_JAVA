package ch03;

import java.util.Scanner;

public class SwitchEx03 {
	
	public static void main(String[] args) {
		
		System.out.println("����� �ֹι�ȣ�� �Է����ּ���(010101-1111111)>>");
		
		Scanner sc = new Scanner(System.in);
		
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
			case '1': case '3':
				System.out.println("����� �����Դϴ�.");
			break;
			case '2': case '4':
				System.out.println("����� �����Դϴ�.");
			break;
			default:
				System.out.println("�ֹι�ȣ�� ��Ȯ�� �Է����ּ���");
		}
		
	// Switch���� ��ø���� �ۼ��� �� �ִ�. // break; ���߸��� ����!!
		
		System.out.println("����� �ֹι�ȣ�� �Է����ּ���(010101-1111111)>>");
		
		String regNo2 = sc.nextLine();
		char gender2 = regNo2.charAt(7);
		
		switch(gender2) {
			case '1': case '3':
				switch(gender2) {
					case '1':
						System.out.println("����� 2000�� ���� ����� �����Դϴ�.");
					break;
					case '3':
						System.out.println("����� 2000�� �Ŀ� ����� �����Դϴ�");
					break;
				}
			break;
			case '2': case '4':
				switch(gender2) {
					case '2':
						System.out.println("����� 2000�� ���� ����� �����Դϴ�");
						break;
					case '4':
						System.out.println("����� 2000�� �Ŀ� ����� �����Դϴ�");
						break;
				}
			break;
			default: 
				System.out.println("�ֹι�ȣ�� ��Ȯ�� �Է����ּ���!");
		}
		
	
	}

}
