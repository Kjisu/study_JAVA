package ch13;

public class ThreadEx20 {

	public static void main(String[] args) {
		
		ThreadEx20_1 gc = new ThreadEx20_1();
		gc.setDaemon(true); // ���� ������� ���� : �Ϲ� �����尡 ������� �ʴ��̻� ���󾲷���� ������� �ʴ´�.
		gc.start();
		
		// ���ξ������� �۾��� �ʿ��� ����
		int requiredMemory = 0;
		
		// ���� ������ �۾� ����		
		for(int i=0;i<20;i++) {
			requiredMemory = (int)(Math.random() * 10 ) * 20;
			
			// �ʿ��� �޸𸮰� ��밡���� �޸𸮺��� ũ�ų�, ��ü �޸��� 60%�̻��� ����ߴٸ� => (�ڰ��ִ�)gc�����
			if(gc.usedMemory < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt();
				
				try {
					gc.join(100);
				} catch (InterruptedException e) {}
			}
			
		gc.usedMemory += requiredMemory;
		System.out.println("usedMemory : " +gc.usedMemory);
			
		}

	}

}

class ThreadEx20_1 extends Thread{ // ������ �÷���(�޸� ����) �۾��� �ϴ� ������
	
	// �۾��� ���� �ʿ��� ������
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	
	// �۾� ���� , �ش� ������ start�� �Ʒ��� �۾������� ����ȴ�
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000*10); // 10�� ��ٸ���.
			} catch (InterruptedException e) {
				// sleep()���� ���� ����ٸ� catch ������ ������ ����ȴ�.
				System.out.println("Awaken by interrupt() -_-^");				
			}
			
			
			gc();  // garbage Collection �� ����
			System.out.println("Garbage Collection. Free Memory : "+ freeMemory());
		}
	}
	
	public void gc() {
		
		usedMemory -= 300;
		if(usedMemory < 0 ) usedMemory = 0;
	}
	
	public int totalMemory() { // �� �޸𸮸� �˷���
		return MAX_MEMORY;
	}
	
	public int freeMemory() { // ��밡�� �޸𸮸� �˷���
		return MAX_MEMORY - usedMemory;
	}
}
