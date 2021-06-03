package ch05;

public class MultiDimensionalEx01 {
	
	public static void main(String[] args) {
		
		
// 5���� �л��� �� ���� ������ ���ؼ� �� �л��� ������ ����� ����ϰ�, ���� ������ ����ϱ�
		
		int [][] score = {
				
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		// ���� ���� 
		System.out.println("��ȣ     ����    ����    ����    ����     ���");
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
			System.out.printf("%5d %5.1f%n",totalSum,totalAvg); // 5.1f : 5ĭ+�Ҽ� ù°�ڸ�����
		}
		
		System.out.println("====================================");
		System.out.printf("���� : %3d %4d %4d" ,totalKor,totalEng,totalMath);
		
		System.out.println();
		System.out.println();
		
// 2���� �迭�� ��� ��� �� ���ϱ�
		
		// ���� for������ �� �б�
		// ����� ������ ���������� �о�� ���� ������ �迭�� ����� ���� ������ �� x
		
		int sum = 0;
		
		for(int[] tmp: score) {
			for(int i :tmp) {
				sum += i;
			}
		}
		
		System.out.println("2���� �迭�� �հ� : "+sum);
		
	}

}
