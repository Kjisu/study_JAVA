package ch13;

public class Ex13_8 {
	
	public static void main(String[] args) {
		
		Thread8_1 th1 = new Thread8_1();
		Thread8_2 th2 = new Thread8_2();
		
		th1.start();
		th2.start();
		
		sleep(2000); // 2�� ���� ���ͷ� 
		System.out.println("<< main ���� >>");
	}
	
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}

}
class ThreadEx8_1 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<300;i++) System.out.println("-");
		System.out.println("<< th1 ���� >>");
	}
}
class ThreadEx8_2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<300;i++) System.out.println("|");
		System.out.println("<< th2 ���� >>");
	}
}