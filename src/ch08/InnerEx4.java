package ch08;

import ch08.Outer2.InstanceInner;

class Outer2{
	
	class InstanceInner{
		
		int iv = 100;
	}
	
	static class StaticInner{
		
		static int cv = 200;
		int iv = 200;
	}
	
	void myMethod() {
		
		class LocalInner{
			int iv = 400;
		}
	}	
}

public class InnerEx4 {
	
	public static void main(String[] args) {
		
		// 내부 클래스(인스턴스 클래스) 멤버를 사용하기 위해서는
		// => 객체 생성 2번 해야 함.(외부 클래스,인스턴스 이너 클래스)
		Outer2 outer = new Outer2();
		InstanceInner ii = outer.new InstanceInner();
		
		// 외부 클래스의 스태틱 클래스의 static멤버 사용하기
		// => 외부 클래스 객체 생성  X
		int cv = Outer2.StaticInner.cv;
		
		// 외부 클래스의 스태틱 클래스의 인스턴스멤버 사용하기
		Outer2.StaticInner s = new Outer2.StaticInner();
		int iv = s.iv;
		//int iv = new Outer2.StaticInner().iv; // 같은거 
	}	
}
