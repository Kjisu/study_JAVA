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
	
	// ��� ����
	String[] dishNames = {"dounut","burger","photato chips"};
	final int MAX_FOOD = 6; // ���̺��� 6���� ���ĸ� �ø� �� �ִ�
	ArrayList<String> dishes = new ArrayList<>();
	
	// ���̺� ���� �߰� �ϴ� �޼���
	// ���̺� �ִ� ���� ������ 6�� �̻��̶�� �丮��� ���̻� �丮�� ������ ���ϰ� �Ѵ�
	public synchronized void add(String dish){
		
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting...");
			try {
				wait(); // �丮�� �����尡 add() �޼��� ��� ���̰� ���̺� ������ 6�� �̻��̶�� lock�� Ǯ�� �ش� �����带 ���Ƿ� �̵���Ų��.
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		// ���̺� �ִ� ������ ������ 6�� �̸��̶��, ���̺� ������ �߰��Ѵ�
		dishes.add(dish);
		// �丮�� �߰��Ǿ����� ���ǿ� �ִ� �����忡�� �˸���.
		notify(); 
		// ���� ���̺� �ִ� �丮 ��� 
		System.out.println("Dishes : "+ dishes.toString());
	}
	
	// ���̺� �ִ� ���� ����
	public synchronized void remove(String dishName) {
		
		// ���� �۾��ϰ� �ִ� ������ �̸�
		String name = Thread.currentThread().getName();
		
		// ���̺� �ִ� ���� ������ 0�̶�� , lock�� ��� �ִ� �����带 ���Ƿ� ������
		while(dishes.size() == 0) {
			System.out.println(name + "is waiting...");
			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		// ���̺� ���� ������ 0 �̻��̶��, �Ű������� ���� �����̸��� �ݺ������� ��µ� �����̸��� ���� ��� arraylist���� ����
		// �丮�� �޽�忡�� �丮 ������� �˸���
		while(true) {
			for(int i=0;i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return;
				}
			}
		// ���̺� �ִ� ���� �޴��� �ڽ��� �ֹ��� �޴��� �ٸ� ���
		// lock�� Ǯ�� ���Ƿ� �̵�.
			try {
				System.out.println(name + " is waiting...");
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		} // while(true)
		
	}// synchronized
	
	// ���� �޴� ���� 
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
