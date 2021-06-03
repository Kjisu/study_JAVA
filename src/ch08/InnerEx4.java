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
		
		// ���� Ŭ����(�ν��Ͻ� Ŭ����) ����� ����ϱ� ���ؼ���
		// => ��ü ���� 2�� �ؾ� ��.(�ܺ� Ŭ����,�ν��Ͻ� �̳� Ŭ����)
		Outer2 outer = new Outer2();
		InstanceInner ii = outer.new InstanceInner();
		
		// �ܺ� Ŭ������ ����ƽ Ŭ������ static��� ����ϱ�
		// => �ܺ� Ŭ���� ��ü ����  X
		int cv = Outer2.StaticInner.cv;
		
		// �ܺ� Ŭ������ ����ƽ Ŭ������ �ν��Ͻ���� ����ϱ�
		Outer2.StaticInner s = new Outer2.StaticInner();
		int iv = s.iv;
		//int iv = new Outer2.StaticInner().iv; // ������ 
	}	
}
