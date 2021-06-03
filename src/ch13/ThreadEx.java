package ch13;

public class ThreadEx {

	static long startTime = 0;
	
	
	public static void main(String[] args) {

		
		// 멀티 쓰레드를 사용하여 2가지 작업을 동시에 진행하기
		
		// 동시에 진행할 작업 (쓰레드) 생성
		ThreadEx5 thread = new ThreadEx5();
		thread.start();
		startTime = System.currentTimeMillis();
		
		// 시작하기 전 시간 
		
		// 동시에 진행할 작업 1 
			for(int i=0;i<100;i++) {
				System.out.printf("%s",new String("="));
			}
			
			System.out.print("소요시간1 : "+(System.currentTimeMillis() - startTime));
		
	}
}

class ThreadEx5 extends Thread{

	@Override
	public void run() {
		
		// 수행할 작업
			for(int i=0;i<100;i++) {
				System.out.printf("%s",new String("|"));
				
				System.out.print("소요시간2 : "+(System.currentTimeMillis() - ThreadEx.startTime));
			}
	}
}
