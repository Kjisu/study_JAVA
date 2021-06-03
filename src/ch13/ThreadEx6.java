package ch13;

import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) {

		// 싱글 쓰레드 : IO blocking 현상 발생
		
		// 작업1이 끝난 후에야 , 작업2가 시작될 수 있다. (단점_멀티쓰레드가 필요한 이유)
		
		String inputMsg = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		
		System.out.println("입력하신 값은 " + inputMsg + " 입니다.");
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
