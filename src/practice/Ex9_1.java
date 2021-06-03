package practice;

public class Ex9_1 {
	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		
	}
}

class Value{
	
	int value;
	
	Value(int value) {
		this.value = value;}

	@Override
	public boolean equals(Object obj) {
	// Object의 equals()를 오버라이딩함으로써 주소가 아닌 value값을 비교
	// 이렇게 오버라이딩 해 주지 않고 equals()를 사용하게 되면 항상 false의 값을 얻게 될 것.
	// 왜 ? 세상에 같은 주소를 가지고 있는 인스턴스 객체는 없기 때문!!
			// 참조변수의 형 변환 전에는 반드시 instanceof로 확인해야 함.
			if(!(obj instanceof Value)) return false;
			Value v = (Value)obj; // obj를 value로 형변환
			return this.value == v.value;
			
	
	}
	
	
	
	
	
}
