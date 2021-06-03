package ch13;

import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args) {
		
		ThreadEx13_1 th = new ThreadEx13_1();
		
		th.start();
		
		System.out.println("isInterrupted() : "+th.isInterrupted()); // false
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� "+ input+ " �Դϴ�.");
		th.interrupt(); // interrupt() ȣ�� �� , interrupted ���°� true�� �ȴ�.
		System.out.println("isInterrupted() : "+th.isInterrupted()); // true
		System.out.println("���� �����尡interrupt()�Ǿ��°� : "+Thread.interrupted()); // false
		
	}

}

class ThreadEx13_1 extends Thread{

	@Override
	public void run() { // �۾� ���� 
		
		int i = 10;
		
		while( i != 0 && !isInterrupted()) { // isInterrupted()�� ���������, ���� �ش� ������ �۾� �ߴ� �޼��带 ȣ������ �� �ݺ������� ����� �� �ִ�.
			System.out.println(i--);
			//for(long x=0;x<250000000;x++); // �ð� ����
			try {
				Thread.sleep(1000); // 1�� �ڵ�����
			} catch (InterruptedException e) {
				interrupt(); // sleep()�� ���� �����尡 ��� �������� ��, interrupt()�� ȣ���ϸ� InterruptedException�� �߻��ǰ� �������� interrupted���´� false�� �ʱ�ȭ �ȴ�,
							// �׷��� catch���� interrupt()�� �߰��� �־��༭ �������� interruptted���¸� true�� �ٽ� �ٲ���� �Ѵ�.
			}
		}
		
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
		
		System.out.println("isInterrupted() : "+isInterrupted()); // true
		System.out.println("th�����尡 interrupt()�Ǿ��°� : "+Thread.interrupted()); // true
	}
}
