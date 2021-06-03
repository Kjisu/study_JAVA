package ch13;

import java.util.ArrayList;

public class ThreadWaitEx3 {

	public static void main(String[] args) throws Exception{
		
		Table table = new Table();
		
		new Thread(new Cook(table), "cook1").start();
		new Thread(new Customer(table, "burger") , "cust1").start();
		new Thread(new Customer(table, "dounut") , "cust2").start();
		
		Thread.sleep(2000);
		System.exit(0);
		
	}

}

class Table{
	
	// 멤버 변수
	String[] dishNames = {"dounut","burger","photato chips"};
	final int MAX_FOOD = 6; // 테이블에는 6개의 음식만 올릴 수 있다
	ArrayList<String> dishes = new ArrayList<>();
	
	// 테이블에 음식 추가 하는 메서드
	// 테이블에 있는 음식 개수가 6개 이상이라면 요리사는 더이상 요리를 만들지 못하게 한다
	public synchronized void add(String dish){
		
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting...");
			try {
				wait(); // 요리사 쓰레드가 add() 메서드 사용 중이고 테이블 음식이 6개 이상이라면 lock을 풀고 해당 쓰레드를 대기실로 이동시킨다.
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		// 테이블에 있는 음식의 갯수가 6개 미만이라면, 테이블에 음식을 추가한다
		dishes.add(dish);
		// 요리가 추가되었음을 대기실에 있는 쓰레드에게 알린다.
		notify(); 
		// 현재 테이블에 있는 요리 목록 
		System.out.println("Dishes : "+ dishes.toString());
	}
	
	// 테이블에 있는 음식 제거
	public synchronized void remove(String dishName) {
		
		// 현재 작업하고 있는 쓰레드 이름
		String name = Thread.currentThread().getName();
		
		// 테이블에 있는 음식 갯수가 0이라면 , lock을 쥐고 있는 쓰레드를 대기실로 보내기
		while(dishes.size() == 0) {
			System.out.println(name + "is waiting...");
			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		// 테이블에 음식 갯수가 0 이상이라면, 매개변수로 받은 음식이름과 반복문으로 출력된 음식이름이 같은 경우 arraylist에서 제거
		// 요리사 메써드에게 요리 만들어라고 알리기
		while(true) {
			for(int i=0;i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return;
				}
			}
		// 테이블에 있는 음식 메뉴가 자신이 주문한 메뉴와 다른 경우
		// lock을 풀고 대기실로 이동.
			try {
				System.out.println(name + " is waiting...");
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		} // while(true)
		
	}// synchronized
	
	// 음식 메뉴 갯수 
	public int dishNum() {
		return dishNames.length;
	}
}


class Customer implements Runnable{
	
	private Table table = null;
	private String food = "";
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a "+ food);
		} // while
		
	} 
}

class Cook implements Runnable{
	
	private Table table = null;
	
	public Cook(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		
		while(true) {
			int idx = (int)Math.random()*table.dishNum();
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}// while
		
	}
	
}
