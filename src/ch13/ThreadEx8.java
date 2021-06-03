package ch13;

public class ThreadEx8 {

	public static void main(String[] args) {
		
		Thread8_1 th1 = new Thread8_1();
		Thread8_2 th2 = new Thread8_2();
		
		th1.setPriority(7); // 쓰레드 우선순위는 쓰레드 실행 전에 설정해줘야 함.
							// 이렇게 설정하지 않으면 메인 쓰레드 우선순위(5)를 상속받는다
		
		System.out.println("Proiority of th1(-) : "+ th1.getPriority());
		System.out.println("Proiority of th2(|) : "+ th2.getPriority());
		
		th1.start();
		th2.start();

	}

}

class Thread8_1 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("-");
			for(int x=0;x<1000000;x++);
		}
	
	}
}

class Thread8_2 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<300;i++) {
			System.out.print("|");
			for(int x=0;x<1000000;x++);
		}
	}
	
	
}
