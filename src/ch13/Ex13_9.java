package ch13;

import javax.swing.JOptionPane;

public class Ex13_9 {
	
	public static void main(String[] args) {
		
		ThreadEx9_1 t1 = new ThreadEx9_1();
		t1.start();
		System.out.println("isInterrupted( ) : "+t1.isInterrupted());
		
		String input = JOptionPane.showInputDialog("아무값이나 넣으세요");
		System.out.println("입력하신 값은 >> "+input);
		t1.interrupt();
		System.out.println("isInterrupted( ) : "+t1.isInterrupted());
	}

}

class ThreadEx9_1 extends Thread {

	@Override
	public void run() {
		
		// 카운트다운 하는 작업
		for(int i=10;i<=1;i--) {
			if(isInterrupted() == true) break;
			System.out.println(i);
			delay(5000);
		}
		System.out.println("카운트가 종료되었습니다.");
	}
	
	public void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}
}
