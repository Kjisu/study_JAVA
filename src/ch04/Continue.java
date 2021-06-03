package ch04;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		
/*
 * <continue��>
 * 
 * # �ݺ��� ����Ǵ� ���߿� continue���� ������ �ݺ����� ������ �̵��Ͽ� ���� �ݺ����� �Ѿ��.
 *    - for�� : ���������� �̵� 
 *    - while�� : ���ǽ����� �̵�
 * # ��ü �ݺ� �� Ư�� ������ �����ϴ� ��쿡�� ��� �ݺ��� �۾��� skip�ϰ� ���� �� ���!
 */

// 1~10������ ���ڸ� ����ϵ� �� �߿��� 3�� ����� ���� �����ϱ�
	
	for(int i=0;i<=10;i++) {
		
		if(i%3 == 0) continue;
		
		System.out.println(i);
	}
	
	System.out.println();


//-------------------------------------------------------------------------------
/*
 * <�̸� ���� �ݺ���>
 * 
 * # break�� : ������ �� �ϳ��� �ݺ����� ��� �� ����
 * 		=> ���� ���� �ݺ����� ��ø�� ��� break;�����δ� ���� ���� �ݺ����� ������ ��� �� ����.
 * # �ݺ����� �̸��� ���̸�, �ϳ� �̻��� �ݺ����� ��� �� ����!
 * 
 */
	
// for���� Loop1�̶�� �̸� ���̱�
	Loop1 : for(int i=2;i<9;i++) {
		for(int j=1;j<9;j++) {
			if(j == 5)
				break Loop1; // ��ü for�� �������� �� ����
				//break; // �ι�° for���� ���������� �ȴ�
			System.out.println(i+"*"+j+" = "+i*j);
		}// end of for j
	}// end of for i
	

// �޴��� �����ϸ� �ش� ������ �ݺ������� ������ �� �ֵ��� for�� �߰�
	
	int price = 0;
	int totalSum = 0;
	
	Scanner sc = new Scanner(System.in);
	
	outer : 
	while(true) {
		System.out.println("1. ������  700��");
		System.out.println("2. ��ī�ݶ� 700�� ");
		System.out.println("3. ���̼Ҵ� ���ø� 800�� ");
		System.out.println("���ϴ� �޴��� �����ϼ���(���� : 0)>>");
		
		int selected = sc.nextInt();
		
		if(selected == 0) {
			System.out.println("�ý����� �����մϴ�.");
			break;
		}else if(!(1<=selected && selected<=3)) {
			System.out.println("�޴��� �� �� �����ϼ̽��ϴ�.(����� 0)");
			continue;
		}
		
		// 1~3�� ������ �޴��� ������ ���
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
		System.out.println("�� �����ؾ� �� �ݾ� : "+totalSum);
		
		
	}//outer: while(true)
	
	
	
		
		
	}

}
