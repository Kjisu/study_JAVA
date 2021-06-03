package ch13;

public class ThreadEx4 {

	public static void main(String[] args) {
		
		// 하나의 쓰레드(=메인 쓰레드)로 작업하는 경우
		
		// 작업 시작하기 전 시스템의 시간 저장
			long startTime = System.currentTimeMillis();
		
		// 첫 번째 작업할 내용 : - 를 300번 출력하기
			for(int i=0;i<300;i++) {
				System.out.println("-");
			}
		
		// 첫 번째 작업 후 시간
			System.out.println("첫 번째 작업 소요시간 : "+(System.currentTimeMillis() - startTime));
			
		// 두 번째 작업할 내용 : | 를 300번 출력하기
			for(int i=0;i<300;i++) {
				System.out.println("|");
			}
			
		// 두 번째 작업 후 시간
			System.out.println("두 번째 작업 소요시간 : "+(System.currentTimeMillis() - startTime));
			
	}

}
