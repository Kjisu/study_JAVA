package ch04;

import java.util.Scanner;

public class ForEx01 {
	
	public static void main(String[] args) {
		
	// ��� �۾��� �ݺ������� ����Ǿ�� �Ѵٸ� => �ݺ��� ���! 
	// - for, while,do-while
	// �ݺ� Ƚ���� �� �� �ִٸ� -> for
	// �󸶳� �ݺ��ؾ� �� �� �𸣰ڴٸ� -> while
	// �󸶳� �ݺ��ؾ� �� �� �𸣰����� �ϴ� ó�� �� ���� ����Ǿ�� �Ѵٸ� -> do-while
		
	// <for��>
	// for(�ʱ��;���ǽ�;������){
	//     ���ǽ��� ���� �� �ݺ� ����Ǿ�� �ϴ� �۾�
	//   }
		
		
	// ��ø for�� ����
		
	// 1. �����
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
	// 2. ����ڷκ��� �Է¹��� ���ڸ�ŭ �� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���>>");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	
	// 3. �ݴ�� ����(���� ����)
		for(int i=0;i<5;i++) {
			for(int j=5;i<j;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
	// 4. ������ ���� 
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

// 2�� ~ 9�� �ݺ� 
		
		for(int i=2;i<10;i++) {
				System.out.printf("%d�� %n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d %n",i,j,i*j);
			}
		}
		
		System.out.println();
		
		// ���η� ��� 
		for(int i=2;i<=9;i++) {
			System.out.printf("%d�� \t",i);
		}
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%d \t",j,i,(j*i));
			}
			System.out.println();
		}
		
// �ݺ��� 3�� �϶� 111 112 113 121 122 123...
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
