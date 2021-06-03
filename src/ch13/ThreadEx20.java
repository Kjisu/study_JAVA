package ch13;

public class ThreadEx20 {

	public static void main(String[] args) {
		
		ThreadEx20_1 gc = new ThreadEx20_1();
		gc.setDaemon(true); // 보조 쓰레드로 설정 : 일반 쓰레드가 종료되지 않는이상 데몬쓰레드는 종료되지 않는다.
		gc.start();
		
		// 메인쓰레드의 작업에 필요한 변수
		int requiredMemory = 0;
		
		// 메인 쓰레드 작업 내용		
		for(int i=0;i<20;i++) {
			requiredMemory = (int)(Math.random() * 10 ) * 20;
			
			// 필요한 메모리가 사용가능한 메모리보다 크거나, 전체 메모리의 60%이상을 사용했다면 => (자고있는)gc깨우기
			if(gc.usedMemory < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt();
				
				try {
					gc.join(100);
				} catch (InterruptedException e) {}
			}
			
		gc.usedMemory += requiredMemory;
		System.out.println("usedMemory : " +gc.usedMemory);
			
		}

	}

}

class ThreadEx20_1 extends Thread{ // 가비지 컬렉터(메모리 정리) 작업을 하는 쓰레드
	
	// 작업을 위해 필요한 변수들
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	
	// 작업 내용 , 해당 쓰레드 start시 아래의 작업내용이 실행된다
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000*10); // 10초 기다린다.
			} catch (InterruptedException e) {
				// sleep()동안 누가 깨운다면 catch 구문의 내용이 실행된다.
				System.out.println("Awaken by interrupt() -_-^");				
			}
			
			
			gc();  // garbage Collection 을 수행
			System.out.println("Garbage Collection. Free Memory : "+ freeMemory());
		}
	}
	
	public void gc() {
		
		usedMemory -= 300;
		if(usedMemory < 0 ) usedMemory = 0;
	}
	
	public int totalMemory() { // 총 메모리를 알려줌
		return MAX_MEMORY;
	}
	
	public int freeMemory() { // 사용가능 메모리를 알려줌
		return MAX_MEMORY - usedMemory;
	}
}
