package ch13;

public class Ex13_1 {
	
	public static void main(String[] args) { // main 쓰레드 (프로세스)
		
		// 상속으로 구현한 쓰레드랑 인터페이스를 통해 구현한 쓰레드 동시에 작업하기 
		Thread13_1_1 t1 = new Thread13_1_1();
		Thread t2 = new Thread(new Thread13_1_1_1());
		
		t1.start();
		t2.start();
	
	}
}
class Thread13_1_1 extends Thread{ // 1. Thread

	@Override
	public void run() {
	// 수행할 작업 내용
		for(int i=0;i<5;i++) {
			System.out.println(this.getName()); // 조상 Thread의 getName()을 호출
		}
	}
	
	
}

class Thread13_1_1_1 implements Runnable{

	@Override
	public void run() {
	// 수행할 작업 내용 - 현재 실행중인 쓰레드의 이름을 출력한다
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			// Thread.currentThread() = this : thread객체를 상속하지 않았기에 static 메서드를 이용하여 쓰레드 객체 생성
		}
	}
}

