package ch11;

public class Ex13_7 implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Ex13_7());
		t1.setDaemon(true);
		t1.start();
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.out.println(i);
			
			if(i==5) autoSave = true;
		}
	}
	
	@Override
	public void run() {
		
		while(true) {
			
		try {
			Thread.sleep(3000); // 3�ʸ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(autoSave) save();
		}	
	}
	
	public void save() {
		
		// �����ϴ� �۾��� �ڵ�
		
		System.out.println("�ڵ����� �Ǿ����ϴ�.");
	}
}


