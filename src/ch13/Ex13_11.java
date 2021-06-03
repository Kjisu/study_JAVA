package ch13;

public class Ex13_11 {
	
	public static void main(String[] args) {
		
	// (★) 메인 스레드 작업이 종료되어도 다른 스레드가 작업 진행중이라면 프로그램은 종료되지 않는다는 것!!
		Ex11_1 t1 = new Ex11_1();
		Ex11_2 t2 = new Ex11_2();
		
		t1.start(); 
		t2.start();
		
		long startTime = System.currentTimeMillis();
		
		try {
			t1.join(); // main 쓰레드가 t1의 작업이 끝날때까지 기다린다
			t2.join(); // main 쓰레드가 t2의 작업이 끝날 때 까지 기다린다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("소요시간 : "+(System.currentTimeMillis()-startTime));
	}
}

class Ex11_1 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<300;i++) {
			System.out.print("-");
		}
	}
}

class Ex11_2 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<300;i++) {
			System.out.print("|");
		}
	}
}