package ch13;

import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) {

		// �̱� ������ : IO blocking ���� �߻�
		
		// �۾�1�� ���� �Ŀ��� , �۾�2�� ���۵� �� �ִ�. (����_��Ƽ�����尡 �ʿ��� ����)
		
		String inputMsg = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		
		System.out.println("�Է��Ͻ� ���� " + inputMsg + " �Դϴ�.");
		
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
