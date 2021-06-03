package ch13;

public class Ex13_1 {
	
	public static void main(String[] args) { // main ������ (���μ���)
		
		// ������� ������ ������� �������̽��� ���� ������ ������ ���ÿ� �۾��ϱ� 
		Thread13_1_1 t1 = new Thread13_1_1();
		Thread t2 = new Thread(new Thread13_1_1_1());
		
		t1.start();
		t2.start();
	
	}
}
class Thread13_1_1 extends Thread{ // 1. Thread

	@Override
	public void run() {
	// ������ �۾� ����
		for(int i=0;i<5;i++) {
			System.out.println(this.getName()); // ���� Thread�� getName()�� ȣ��
		}
	}
	
	
}

class Thread13_1_1_1 implements Runnable{

	@Override
	public void run() {
	// ������ �۾� ���� - ���� �������� �������� �̸��� ����Ѵ�
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			// Thread.currentThread() = this : thread��ü�� ������� �ʾұ⿡ static �޼��带 �̿��Ͽ� ������ ��ü ����
		}
	}
}

