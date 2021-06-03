package ch13;

public class ThreadEx10 {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new ThreadDemon()); // runnable �������̽��� ������ ��ü�� �־��ش�
		
		// �ۼ��� �����带 ���� ������� �����(�� �����尡 �ϴ� �۾��� ���� �ݺ��̱� ������, �� �κ��� ������ ������� �ʴ´�)
		t.setDaemon(true);
		
		// ����(����) ������ �۾� ���� ����
		t.start();
		
		// ���� �����尡 �� �۾�
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
			
			if(i == 5) {
				ThreadDemon.autoSave = true;
			}
		}
		
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		
	}
	
	

}

class ThreadDemon implements Runnable{
	
	static boolean autoSave;

	@Override
	public void run() {
		
		// �Ϲ� �����尡 ����Ǳ� ������ ��� �ݺ��ؼ� ������ �۾�
		
		while(true) { // �Ϲ� �����尡 ����Ǳ� ������ ��� �ݺ��� ���ϱ�
			
			try {
				Thread.sleep(3000); // ���� �������� 3�ʰ� �Ͻ�����
			} catch (InterruptedException e) {
				e.printStackTrace();}
			
			// Ư�� ������ �����Ǵ��� Ȯ�� -> �����ȴٸ� �۾��� �����ϰ� �ٽ� ������
			//					   -> �����Ѵٰ� �ؼ� ����Ǵ� �� �ƴ�. 
			// ���� ������� �� ������� �����ų �� ����!
			
			if(autoSave) {
				autoSave();
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("�۾������� �ڵ� ���� �Ǿ����ϴ�.");
	}
	

}


