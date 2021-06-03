package ch13;

public class ThreadEx8 {

	public static void main(String[] args) {
		
		Thread8_1 th1 = new Thread8_1();
		Thread8_2 th2 = new Thread8_2();
		
		th1.setPriority(7); // ������ �켱������ ������ ���� ���� ��������� ��.
							// �̷��� �������� ������ ���� ������ �켱����(5)�� ��ӹ޴´�
		
		System.out.println("Proiority of th1(-) : "+ th1.getPriority());
		System.out.println("Proiority of th2(|) : "+ th2.getPriority());
		
		th1.start();
		th2.start();

	}

}

class Thread8_1 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("-");
			for(int x=0;x<1000000;x++);
		}
	
	}
}

class Thread8_2 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<300;i++) {
			System.out.print("|");
			for(int x=0;x<1000000;x++);
		}
	}
	
	
}
