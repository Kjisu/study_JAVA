package ch08;

public class InnerEx3 {

}

class Outer{
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		
		int iiv = outerIv;
		// �ܺ� Ŭ������ private ����� ���� ����
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		
		//static int iiv = outerIv;
		// ����ƽ Ŭ������ �ܺ� �ν��Ͻ� ����� ������ �� ����
		
		static int iiv = outerCv;
	}
	
	void myMethod() {
		
		int lv = 0;
		final int LV = 0; // JDK 1.8���� final ���� ����
		
		class LocalInner{
			
			// �ܺ� Ŭ������ ��������� ���� ����
			int lv = outerIv;
			int lv2 = outerCv;
			
			// but �޼��� �� ���������� final�� ���� ����(���)�� ���� ����
			//int lv = lv; // but JDK1.8 ���ʹ� ���� �ƴ�!!
						   // final�� ���� �����ؼ� ���� �ٲ��� �ʴ´ٸ� ����� ���� ����. �� �ٲ�� ���� ���,
			int lv3 = LV;
		}
	}
}
