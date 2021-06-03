package ch08;

public class InnerEx3 {

}

class Outer{
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		
		int iiv = outerIv;
		// 외부 클래스의 private 멤버에 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		
		//static int iiv = outerIv;
		// 스태틱 클래스는 외부 인스턴스 멤버에 접근할 수 없음
		
		static int iiv = outerCv;
	}
	
	void myMethod() {
		
		int lv = 0;
		final int LV = 0; // JDK 1.8부터 final 생략 가능
		
		class LocalInner{
			
			// 외부 클래스의 멤버변수에 접근 가능
			int lv = outerIv;
			int lv2 = outerCv;
			
			// but 메서드 내 지역변수는 final이 붙은 변수(상수)만 접근 가능
			//int lv = lv; // but JDK1.8 부터는 오류 아님!!
						   // final은 생략 가능해서 값이 바뀌지 않는다면 상수로 보기 때문. 값 바뀌면 에러 뜬다,
			int lv3 = LV;
		}
	}
}
