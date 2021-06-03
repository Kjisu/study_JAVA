package ch05;

import java.util.Arrays;

public class ArrayEx5 {
	
	public static void main(String[] args) {
		
// 배열의 모든 요소를 더해서 총합과 평균 구하기
		
		int[] score = {100,88,100,90,70}; // 총 5개 요소 가진 배열 생성(저장공간 5개) // 인덱스 범위 0~4
		
		int sum = 0;
		float avg = 0.0f;
		
		for(int i:score) {
			sum += i;
		}
		
		int size = score.length;
		for(int i=0;i<size;i++) {
			sum += score[i];
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (sum/(float)size));
		
// 배열의 요소 중 최소값, 최대값 찾기
		
		int[] mathScore = {79,88,91,33,100,55,95};
		
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for(int i:mathScore) {
			if(i>maxValue) {
				maxValue = i;
			}else if(i<minValue) {
				minValue = i;
			}
		} // 이렇게 하면 min, max값을 한 번에 구할 수 있다.
		System.out.println("최대값 : "+maxValue);
		System.out.println("최소값 : "+minValue);
// 배열의 요소를 순서를 반복해서 바꾸기 (로또번호 생성 ,카드섞기)
		
		int[] num = new int[10];
				
		// 배열에 값 넣기
		for(int i=0;i<num.length;i++) {
			num[i] = i;
			System.out.print(num[i]);
		}
		
		// 숫자 바꾸기 (반복횟수 100)
		for(int i=0;i<100;i++) {
			int tmp = num[0];
			int n = (int)(Math.random()*10);
			num[0] = num[n];
			num[n] = tmp;
		}
		
		System.out.println();
		
		// 섞은 번호 출력
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]);
		}
		
		System.out.println();

// 임의의 값으로 배열 채우기 - 연속 또는 불연속인 값들로 배열을 초기화 한다.
		
		int[] code = {-1,0,3,6,7};
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			int tmp = (int)(Math.random()*code.length);
			arr[i]=code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
		
// 오름차순, 내림차순으로 배열 정렬
		
		int[] numArr = new int[5];
		
		// 랜덤한 숫자로 배열 채우기
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]=(int)(Math.random()*numArr.length));
		}
		
		System.out.println();
		
		// (¿¿¿¿)버블 정렬 시작 (오름차순 정렬) // 왜 이렇게 되는지 완벽하게 이해 안 됨.
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
		
// 빈도수 구하기 : 배열에 어떤 값이 몇 개 저장되어 있는지 세어서 보여주기
		
		int[] numArr1 = new int[10];
		int[] count = new int[10];
		
		for(int i=0;i<numArr1.length;i++) {
			numArr1[i] = (int)(Math.random()*10); // 0~9까지의 수 // 1~10 의 수이면 +1해주면 됨
			System.out.print(numArr1[i]);
		}
		
		System.out.println();
	// (★★★★) : 
		for(int i=0;i<count.length;i++) {
			count[numArr1[i]]++;
		}
		
		for(int i=0;i<numArr1.length;i++) {
			System.out.println(i+"의 개수 :"+count[i]);
		}
		
		
	}//main() 끝

}
