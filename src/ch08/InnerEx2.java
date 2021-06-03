package ch08;

class InnerEx2 {
	
	class InstanceInner{}
	static class StaticInner{
		
		static void method() {};
	}
	
		InstanceInner iv = new InstanceInner();
		// �ν��Ͻ� ��� ������ ���� ���� ���� ����
		
		StaticInner cv = new StaticInner();
		// static ��� ���� ���� ���� ���� ����
	
	static void staticMethod() {
		
		//InstanceInner obj1 = new InstanceInner();
		// static ����� �ν��Ͻ� ����� ���� ���� X
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
		// �ܺ� Ŭ���� ��ü ���� �� �ν��Ͻ� Ŭ���� ��ü�� �����ϸ� �ν��Ͻ� Ŭ���� ����� ���� O
		
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod() {
		
		InstanceInner obj1 = new InstanceInner();
		// �ܺ� Ŭ������ �޼��忡�� �ν��Ͻ� Ŭ���� ����� ���� O
		StaticInner.method();
		// �ν��Ͻ� �޼��忡�� ����ƽ Ŭ���� ����� ���� ����.(��ü ���� ����)
		
		// LocalInner lv = new LocalInner();
		// �޼��� ���� ����� ����Ŭ������ �ܺο��� ���� X
		
	}
	
	void myMethod() {
		
		class LocalInner{}
		LocalInner lv = new LocalInner();
		// �޼��� ���� ����� ���� Ŭ������ �� �޼��� �������� ��ü ���� & ��� ����.
		
	}

}
