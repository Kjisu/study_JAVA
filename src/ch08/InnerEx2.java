package ch08;

class InnerEx2 {
	
	class InstanceInner{}
	static class StaticInner{
		
		static void method() {};
	}
	
		InstanceInner iv = new InstanceInner();
		// 인스턴스 멤버 간에는 서로 직접 접근 가능
		
		StaticInner cv = new StaticInner();
		// static 멤버 간에 서로 직접 접근 가능
	
	static void staticMethod() {
		
		//InstanceInner obj1 = new InstanceInner();
		// static 멤버는 인스턴스 멤버에 직접 접근 X
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
		// 외부 클래스 객체 생성 후 인스턴스 클래스 객체를 생성하면 인스턴스 클래스 멤버에 접근 O
		
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod() {
		
		InstanceInner obj1 = new InstanceInner();
		// 외부 클래스의 메서드에서 인스턴스 클래스 멤버에 접근 O
		StaticInner.method();
		// 인스턴스 메서드에서 스태틱 클래스 멤버에 접근 가능.(객체 생성 없이)
		
		// LocalInner lv = new LocalInner();
		// 메서드 내에 선언된 내부클래스는 외부에서 접근 X
		
	}
	
	void myMethod() {
		
		class LocalInner{}
		LocalInner lv = new LocalInner();
		// 메서드 내에 선언된 지역 클래스는 그 메서드 내에서만 객체 생성 & 사용 가능.
		
	}

}
