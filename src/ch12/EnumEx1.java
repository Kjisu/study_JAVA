package ch12;

// 열거형 정의
// enum 열거형 이름 { 상수명1, 상수명2, ... }
// 정의된 상수 사용하는 방법 : 열거형 이름.상수명
enum Direction { EAST, SOUTH, WEST, NORTH }

public class EnumEx1 {

	public static void main(String[] args) {
		
	// 열거형에 정의된 상수 사용하는 방법 3가지 
		Direction d1 = Direction.EAST; // 열거형 타입 이름.상수이름
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
	// => 각각은 Direction타입의 객체들임.
		
		System.out.println("d1 = "+d1); // EAST
		System.out.println("d2 = "+d2); // WEST
		System.out.println("d3 = "+d3); // EAST
		
		System.out.println("d1 == d2 ? "+(d1==d2));
		System.out.println("d1==d3 ? "+(d1==d3));
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
//		System.out.println(""+d2>d3);
		System.out.println("d1.compareTo(d2) ? "+d1.compareTo(d2));
		
		
		
		// switch문에서도 사용할 수 있다.
		switch(d1) {
		case EAST :
			System.out.println("The direction is EAST."); break;
		case SOUTH : 
			System.out.println("The direction is SOUTH. "); break;
		case NORTH :
			System.out.println("The direction is NORTH. "); break;
		case WEST : 
			System.out.println("The direction is WEST."); break;
		default : 
			System.out.println("Invalid direction."); break;
		}
		
		Direction[] dARR = Direction.values();
		
		for(Direction d : dARR) { // for(Direction d : Direction.values())
			System.out.printf("%s=%d%n",d.name(),d.ordinal());//ordinal(): 상수값X, 몇 번째 순서에 정의되어 있는지 정수 반환
		}
		
	
	}
	
	
	
	
	

}
