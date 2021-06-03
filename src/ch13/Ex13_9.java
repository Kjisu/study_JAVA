package ch13;

import javax.swing.JOptionPane;

public class Ex13_9 {
	
	public static void main(String[] args) {
		
		ThreadEx9_1 t1 = new ThreadEx9_1();
		t1.start();
		System.out.println("isInterrupted( ) : "+t1.isInterrupted());
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� ��������");
		System.out.println("�Է��Ͻ� ���� >> "+input);
		t1.interrupt();
		System.out.println("isInterrupted( ) : "+t1.isInterrupted());
	}

}

class ThreadEx9_1 extends Thread {

	@Override
	public void run() {
		
		// ī��Ʈ�ٿ� �ϴ� �۾�
		for(int i=10;i<=1;i--) {
			if(isInterrupted() == true) break;
			System.out.println(i);
			delay(5000);
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
	
	public void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}
}
