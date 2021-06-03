package ch05;

import java.util.Arrays;

public class ArrayEx5 {
	
	public static void main(String[] args) {
		
// �迭�� ��� ��Ҹ� ���ؼ� ���հ� ��� ���ϱ�
		
		int[] score = {100,88,100,90,70}; // �� 5�� ��� ���� �迭 ����(������� 5��) // �ε��� ���� 0~4
		
		int sum = 0;
		float avg = 0.0f;
		
		for(int i:score) {
			sum += i;
		}
		
		int size = score.length;
		for(int i=0;i<size;i++) {
			sum += score[i];
		}
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (sum/(float)size));
		
// �迭�� ��� �� �ּҰ�, �ִ밪 ã��
		
		int[] mathScore = {79,88,91,33,100,55,95};
		
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for(int i:mathScore) {
			if(i>maxValue) {
				maxValue = i;
			}else if(i<minValue) {
				minValue = i;
			}
		} // �̷��� �ϸ� min, max���� �� ���� ���� �� �ִ�.
		System.out.println("�ִ밪 : "+maxValue);
		System.out.println("�ּҰ� : "+minValue);
// �迭�� ��Ҹ� ������ �ݺ��ؼ� �ٲٱ� (�ζǹ�ȣ ���� ,ī�弯��)
		
		int[] num = new int[10];
				
		// �迭�� �� �ֱ�
		for(int i=0;i<num.length;i++) {
			num[i] = i;
			System.out.print(num[i]);
		}
		
		// ���� �ٲٱ� (�ݺ�Ƚ�� 100)
		for(int i=0;i<100;i++) {
			int tmp = num[0];
			int n = (int)(Math.random()*10);
			num[0] = num[n];
			num[n] = tmp;
		}
		
		System.out.println();
		
		// ���� ��ȣ ���
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]);
		}
		
		System.out.println();

// ������ ������ �迭 ä��� - ���� �Ǵ� �ҿ����� ����� �迭�� �ʱ�ȭ �Ѵ�.
		
		int[] code = {-1,0,3,6,7};
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			int tmp = (int)(Math.random()*code.length);
			arr[i]=code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
		
// ��������, ������������ �迭 ����
		
		int[] numArr = new int[5];
		
		// ������ ���ڷ� �迭 ä���
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]=(int)(Math.random()*numArr.length));
		}
		
		System.out.println();
		
		// (��������)���� ���� ���� (�������� ����) // �� �̷��� �Ǵ��� �Ϻ��ϰ� ���� �� ��.
		for(int i=0;i<numArr.length-1;i++) {
			
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j]=numArr[j+1];
					numArr[j+1]=tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(numArr));
		
// �󵵼� ���ϱ� : �迭�� � ���� �� �� ����Ǿ� �ִ��� ��� �����ֱ�
		
		int[] numArr1 = new int[10];
		int[] count = new int[10];
		
		for(int i=0;i<numArr1.length;i++) {
			numArr1[i] = (int)(Math.random()*10); // 0~9������ �� // 1~10 �� ���̸� +1���ָ� ��
			System.out.print(numArr1[i]);
		}
		
		System.out.println();
	// (�ڡڡڡ�) : 
		for(int i=0;i<count.length;i++) {
			count[numArr1[i]]++;
		}
		
		for(int i=0;i<numArr1.length;i++) {
			System.out.println(i+"�� ���� :"+count[i]);
		}
		
		
	}//main() ��

}
