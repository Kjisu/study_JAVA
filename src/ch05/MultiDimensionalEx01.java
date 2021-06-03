package ch05;

public class MultiDimensionalEx01 {
	
	public static void main(String[] args) {
		
		
// 5명의 학생의 세 과목 점수를 더해서 각 학생의 총점과 평균을 계산하고, 과목별 총점을 계산하기
		
		int [][] score = {
				
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		// 과목별 총점 
		System.out.println("번호     국어    영어    수학    총점     평균");
		System.out.println("===============================");
		
		int totalKor = 0;
		int totalEng = 0;
		int totalMath = 0;
		
		for(int i=0;i<score.length;i++) {
			
			int totalSum = 0;
			float totalAvg = 0.0f;
			
			System.out.printf("%3d",i+1);
			
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%5d",score[i][j]);
				totalSum += score[i][j];
			}
				totalKor += score[i][0];
				totalEng += score[i][1];
				totalMath += score[i][2];
				totalAvg = totalSum/3.0f;
			System.out.printf("%5d %5.1f%n",totalSum,totalAvg); // 5.1f : 5칸+소수 첫째자리까지
		}
		
		System.out.println("====================================");
		System.out.printf("총점 : %3d %4d %4d" ,totalKor,totalEng,totalMath);
		
		System.out.println();
		System.out.println();
		
// 2차원 배열의 모든 요소 합 구하기
		
		// 향상된 for문으로 값 읽기
		// 저장된 값들을 순차적으로 읽어올 수는 있지만 배열에 저장된 값을 변경할 수 x
		
		int sum = 0;
		
		for(int[] tmp: score) {
			for(int i :tmp) {
				sum += i;
			}
		}
		
		System.out.println("2차원 배열의 합계 : "+sum);
		
	}

}
