package ch13;

public class Ex13_11 {
	
	public static void main(String[] args) {
		
	// (��) ���� ������ �۾��� ����Ǿ �ٸ� �����尡 �۾� �������̶�� ���α׷��� ������� �ʴ´ٴ� ��!!
		Ex11_1 t1 = new Ex11_1();
		Ex11_2 t2 = new Ex11_2();
		
		t1.start(); 
		t2.start();
		
		long startTime = System.currentTimeMillis();
		
		try {
			t1.join(); // main �����尡 t1�� �۾��� ���������� ��ٸ���
			t2.join(); // main �����尡 t2�� �۾��� ���� �� ���� ��ٸ���.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("�ҿ�ð� : "+(System.currentTimeMillis()-startTime));
	}
}

class Ex11_1 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<300;i++) {
			System.out.print("-");
		}
	}
}

class Ex11_2 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<300;i++) {
			System.out.print("|");
		}
	}
}