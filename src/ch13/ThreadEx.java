package ch13;

public class ThreadEx {

	static long startTime = 0;
	
	
	public static void main(String[] args) {

		
		// ��Ƽ �����带 ����Ͽ� 2���� �۾��� ���ÿ� �����ϱ�
		
		// ���ÿ� ������ �۾� (������) ����
		ThreadEx5 thread = new ThreadEx5();
		thread.start();
		startTime = System.currentTimeMillis();
		
		// �����ϱ� �� �ð� 
		
		// ���ÿ� ������ �۾� 1 
			for(int i=0;i<100;i++) {
				System.out.printf("%s",new String("="));
			}
			
			System.out.print("�ҿ�ð�1 : "+(System.currentTimeMillis() - startTime));
		
	}
}

class ThreadEx5 extends Thread{

	@Override
	public void run() {
		
		// ������ �۾�
			for(int i=0;i<100;i++) {
				System.out.printf("%s",new String("|"));
				
				System.out.print("�ҿ�ð�2 : "+(System.currentTimeMillis() - ThreadEx.startTime));
			}
	}
}
