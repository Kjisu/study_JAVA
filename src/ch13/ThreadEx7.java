package ch13;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
		
		// ���ÿ� ������ �۾�1 
		
			ThreadEx7_1 thread = new ThreadEx7_1();
			thread.start();
			
		// ���ÿ� ������ �۾� 2
			
			System.out.println(JOptionPane.showInputDialog("�ƹ� ���̳� �Է����ּ���"));
		
		
		
	}

}

class ThreadEx7_1 extends Thread{

	@Override
	public void run() {
		
		// ���ÿ� ������ �۾� : ī��Ʈ�ٿ�
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
