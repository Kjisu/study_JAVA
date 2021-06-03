package ch13;

public class ThreadEx18 {

	public static void main(String[] args) {
		
		ThreadEx18_1 th1 = new ThreadEx18_1("*");
		ThreadEx18_1 th2 = new ThreadEx18_1("**");
		ThreadEx18_1 th3 = new ThreadEx18_1("***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(2000);
			th1.resume();
			Thread.sleep(2000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}
	}

}

class ThreadEx18_1 implements Runnable{
	
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th = null;
	
	public ThreadEx18_1(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}

	@Override
	public void run() {
		
		String name = th.getName();
		
		while(!stopped) {
			if(!suspended) {
				System.out.println(name); // 이 쓰레드의 이름
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(name+" - interrupted");
				}
			}else {
				Thread.yield(); // 일시정지 상태라면 자기자신의 남은 작업시간을 남에게 양보 -> 효율적으로 시간 사용
			}
		}
		
		System.out.println(name + " - stopped");
	}
	
	public void suspend() {
		suspended = true;
		th.interrupt(); // 자고 있는 상태를 깨움?
		System.out.println(th.getName() + " - interrupt() by suspend()");
	}
	
	public void stop() {
		stopped = true;
		
		th.interrupt();
		System.out.println(th.getName() + " - interrupted() by stop()");
	}
	
	public void resume() {
		suspended = false;
	}
	
	public void start() {
		th.start();
	}
}
