package ch13;

public class ThreadEx10 {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new ThreadDemon()); // runnable 인터페이스를 구현한 객체를 넣어준다
		
		// 작성한 쓰레드를 데먼 쓰레드로 만들기(이 쓰레드가 하는 작업이 무한 반복이기 때문에, 이 부분이 없으면 종료되지 않는다)
		t.setDaemon(true);
		
		// 데먼(보조) 쓰레드 작업 실행 시작
		t.start();
		
		// 메인 쓰레드가 할 작업
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
			
			if(i == 5) {
				ThreadDemon.autoSave = true;
			}
		}
		
		System.out.println("프로그램이 종료 되었습니다.");
		
	}
	
	

}

class ThreadDemon implements Runnable{
	
	static boolean autoSave;

	@Override
	public void run() {
		
		// 일반 쓰레드가 종료되기 전까지 계속 반복해서 수행할 작업
		
		while(true) { // 일반 쓰레드가 종료되기 전까지 계속 반복할 꺼니까
			
			try {
				Thread.sleep(3000); // 루프 돌때마다 3초간 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();}
			
			// 특정 조건이 만족되는지 확인 -> 만족된다면 작업을 수행하고 다시 대기상태
			//					   -> 만족한다고 해서 종료되는 거 아님. 
			// 데먼 쓰레드는 내 마음대로 종료시킬 수 없음!
			
			if(autoSave) {
				autoSave();
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동 저장 되었습니다.");
	}
	

}


