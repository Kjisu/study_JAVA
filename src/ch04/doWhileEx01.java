package ch04;

import java.util.Scanner;

public class doWhileEx01 {
	
	public static void main(String[] args) {
		
	/*
	 * <do-while��>
	 * 
	 * # ���� 
	 * 	   do{
	 * 		  // ���ǽ��� �������� ���� �� ����� ����
	 * 		}
	 * 	   while(���ǽ�);
	 * 
	 * # while���� �޸� ������ ó���� do�ٵ� ���� ������� ����ǰ�, �� �Ŀ��� ���ǽ��� ������ ���� ����ȴ�.
	 * # �ݺ������� ������� �Է��� �޾ƾ� �� �� ����..?
	 * 	
	 */
		
		
// Math.random()�� ����Ͽ� 1�� 100������ ������ ���� ���� answer�� �����ϰ�, �� ���� ���� �� ���� �ݺ��ϴ� ����
		
	int answer = 0;
	int input = 0;
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * do { System.out.println("1�� 100������ ������ �Է��ϼ���>>"); input =
	 * Integer.parseInt(sc.nextLine()); answer = (int)(Math.random()*100)+1;
	 * 
	 * if(input<answer) { System.out.println("�� ū ���� ������ ������!"); }else
	 * if(input>answer){ System.out.println("�� ���� ���� ������ ������!"); } }while(answer !=
	 * input);
	 * 
	 * System.out.println("�����Դϴ�!!");
	 * 
	 * 
	 * System.out.println();
	 */

//(�ڷ��� �ݺ���)���� �� 3�� ���(3,6,9)�� ���ԵǾ� ������, ���Ե� ������ŭ �ڼ��� ġ�� 369������ 1���� 100���� ����ϴ� ����
	
	for(int i=1;i<=100;i++) {
		System.out.printf("i= %d",i);
		
		int temp = i;
		
		do {
			// temp%10(=temp�� ���ڸ�)�� 3�� ������� Ȯ��(0����) 
			if(temp%10%3 == 0 && temp%10 != 0)
				System.out.print(" ¦!");
		// temp /= 10�� temp = temp / 10�� ����
		}while((temp /= 10) != 0);
		
		System.out.println();
	}
	
	
	
		
	}//main()

}
