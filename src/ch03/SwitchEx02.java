package ch03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ���>>");
		
		int user = sc.nextInt();
		int com = ((int)Math.random()*3)+1;
		// ������ ���ϱ�
		// 1. �� ���� 3�� ���Ѵ�
		// 2. int������ ��ȯ�Ѵ� (int������ ��ȯ�ϸ� �Ҽ��� ���ڸ��� �������� ������ ���� �ȴ�)
		// 3. 1�� ���Ѵ�
		
		System.out.println("����� "+user+" �Դϴ�");
		System.out.println("����  "+com+" �Դϴ�");
		
		switch(user-com) {
			case 2 : case -1 :
				System.out.println("����� �����ϴ�");
			break;
			case 1: case -2:
				System.out.println("����� �̰���ϴ�.");
			break;
			case 0:
				System.out.println("�����ϴ�.");
			break;
			default:
				System.out.println("1~3������ ���ڸ� �Է����ּ���");
		}
		
		
	}
}
