package ch04;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {

// 10~0���� 1�� ���ҽ��Ѱ��鼭 ����� �ϵ�, for������ �� ��¸��� �ణ�� �ð��� �����ǵ��� ó��
	
	int i = 11;
	while(i--!=0) {
		System.out.println(i);
		
		// ���� ī��Ʈ�� �Ѿ�� ����(while���ǹ����� ���ư��� ����) �ణ�� �ð� ������Ű��
		// �� �ð������� �ȵ���,,,;; 
		for(int j=0;j<10_000_000;j++) { ; } 
	}
	System.out.println("GAME OVER!");
		
		
// ����ڷ� ���� �Է¹��� ������ �� �ڸ� �� ���ϱ�
	int sum = 0;
	int num = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���ڸ� �Է��ϼ���.(��:1234)>>");
	num = Integer.parseInt(sc.nextLine());
	while(num != 0) {
		sum += num%10;
		/* final int temp = Integer.toString(num).length(); */
		System.out.printf("����= %d ��= %d %n",num,sum);
		num = num/10; // �� ���ڸ� ������
	}
	
	System.out.println();
	
// 1���� �� ���� ���ϸ� �����հ谡 100�� ���� �ʴ� ���� ū ���� �Ǵ��� �˾Ƴ���
		
	sum = 0;
	num = 0;
	
	while((sum += ++num)<=100) { // �� ��ȣ ����� �� <�����ڰ� +=���� �켼�ϱ� ����
		System.out.printf("��ȣ : %d , �� : %d %n",num,sum);
	}
	System.out.printf("��ȣ : %d , �� : %d %n",num,sum); // ������ 100�̻��� ���� ���� �� ���ǹ��� ���ϱ� ������ 
													   // 14 , 103�� ���� ������ �ȴ�.

	System.out.println();
	
	
// ����ڷκ��� �ݺ��ؼ� ���ڸ� �Է¹޴ٰ� 0�� �Է��ϸ� �Է��� ��ġ�� �� �� ����ϱ�	
	num = 0;
	sum = 0;
	
	
	/* <���1> break�̿��Ͽ� ���� ���߱�
	 * while(true) { System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�) >>");
	 * 
	 * num = Integer.parseInt(sc.nextLine());
	 * 
	 * if(num == 0) break;
	 * 
	 * sum += num;
	 * 
	 * }
	 * 
	 * System.out.println("�հ� : "+sum);
	 */
	 
	//<���2> boolean���� ���� ���� ���߰� �ϱ�
	
	boolean result = true;
	
	System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է��ϼ���)");
	
	while(result) {
		System.out.println(">>");
		num = Integer.parseInt(sc.nextLine());
		
		if(num == 0) result = false;
		
		sum += num;
	}
	
	System.out.println("�հ� : "+sum);
	

	}// main()
	
}
