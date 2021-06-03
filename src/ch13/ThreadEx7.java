package ch13;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
		
		// 동시에 진행할 작업1 
		
			ThreadEx7_1 thread = new ThreadEx7_1();
			thread.start();
			
		// 동시에 진행할 작업 2
			
			System.out.println(JOptionPane.showInputDialog("아무 값이나 입력해주세요"));
		
		
		
	}

}

class ThreadEx7_1 extends Thread{

	@Override
	public void run() {
		
		// 동시에 진행할 작업 : 카운트다운
			for(int i=10;i>0;i--) {
				
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
	}
	
	
}
