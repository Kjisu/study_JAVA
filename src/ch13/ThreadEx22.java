package ch13;

public class ThreadEx22 {

	public static void main(String[] args) {
		
		new Thread(new Thread22_1()).start();
		new Thread(new Thread22_1()).start();
	}

}

class Account{ // 출력하는 클래스
	
	private int balance = 1000; // private으로 설정해야 동기화의 의미가 있다.
	
	public synchronized int getBalance() { // 잔액 정보 출력
		return balance;
	}
	
	public synchronized void withdraw(int money) { // synchronized로 메서드 동기화 
												   // 1번 쓰레드가 이 메서드 호출해서 작업중이라면 2번 쓰레드는 1번 쓰레드가 작업을 마칠 때까지 이 메서드를 호출할 수 없다.
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
		
		//100,200,300 중의 한 값을  선택해서 출금하는 기능
		int money = (int)(Math.random()*3+1) * 100;
		accoount.withdraw(money);
		System.out.println("잔액 : " + accoount.getBalance());
		}
		
	}
}