package ch13;

import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args) {
		
		ThreadEx13_1 th = new ThreadEx13_1();
		
		th.start();
		
		System.out.println("isInterrupted() : "+th.isInterrupted()); // false
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+ input+ " 입니다.");
		th.interrupt(); // interrupt() 호출 시 , interrupted 상태가 true가 된다.
		System.out.println("isInterrupted() : "+th.isInterrupted()); // true
		System.out.println("메인 쓰레드가interrupt()되었는가 : "+Thread.interrupted()); // false
		
	}

}

class ThreadEx13_1 extends Thread{

	@Override
	public void run() { // 작업 내용 
		
		int i = 10;
		
		while( i != 0 && !isInterrupted()) { // isInterrupted()를 적어놓으면, 누가 해당 쓰레드 작업 중단 메서드를 호출했을 때 반복루프가 종료될 수 있다.
			System.out.println(i--);
			//for(long x=0;x<250000000;x++); // 시간 지연
			try {
				Thread.sleep(1000); // 1초 자동지연
			} catch (InterruptedException e) {
				interrupt(); // sleep()에 의해 쓰레드가 잠시 멈춰있을 때, interrupt()를 호출하면 InterruptedException이 발생되고 쓰레드의 interrupted상태는 false로 초기화 된다,
							// 그래서 catch블럭에 interrupt()를 추가로 넣어줘서 쓰레드의 interruptted상태를 true로 다시 바꿔줘야 한다.
			}
		}
		
		System.out.println("카운트가 종료되었습니다.");
		
		System.out.println("isInterrupted() : "+isInterrupted()); // true
		System.out.println("th쓰레드가 interrupt()되었는가 : "+Thread.interrupted()); // true
	}
}
