package ch13;

public class ThreadEx22 {

	public static void main(String[] args) {
		
		new Thread(new Thread22_1()).start();
		new Thread(new Thread22_1()).start();
	}

}

class Account{ // ����ϴ� Ŭ����
	
	private int balance = 1000; // private���� �����ؾ� ����ȭ�� �ǹ̰� �ִ�.
	
	public synchronized int getBalance() { // �ܾ� ���� ���
		return balance;
	}
	
	public synchronized void withdraw(int money) { // synchronized�� �޼��� ����ȭ 
												   // 1�� �����尡 �� �޼��� ȣ���ؼ� �۾����̶�� 2�� ������� 1�� �����尡 �۾��� ��ĥ ������ �� �޼��带 ȣ���� �� ����.
		if(balance >= money) {
			balance -= money;
		}
	}// withdraw()
}

class Thread22_1 implements Runnable {
	
	Account accoount = new Account();

	@Override
	public void run() {
		
		while(accoount.getBalance() > 0 ) {
		
		//100,200,300 ���� �� ����  �����ؼ� ����ϴ� ���
		int money = (int)(Math.random()*3+1) * 100;
		accoount.withdraw(money);
		System.out.println("�ܾ� : " + accoount.getBalance());
		}
		
	}
}