package ch02;

public class PrintfEx1 {
	
	public static void main(String[] args) {
		
		System.out.println(10.0/3); // 결과물을 실수로 보려면 한쪽을 실수로 바꿔줘야 한다
		
		System.out.println(0x1Ad);
		
		int price = 20000;
		
		// 10진수의 값을 16진수로 바꾸어서 출력해주는 지시자 : %x
		System.out.printf("%x%n",price);
	
		// 정수(10진수,8진수..등)를 이이진 문자열로 바꾸고 싶을 때 => integer클래스의 toBinaryString메서드 사용
		System.out.printf("%s%n",Integer.toBinaryString(price));
		
		// 8진수, 16진수 앞에 접두사와 함께 출력되게끔 하려면 => # 붙이기
		System.out.printf("8진수(접두사 0 無) : %o%n",price);
		System.out.printf("8진수(접두사 0 有) : %#o%n",price);
		System.out.printf("16진수(접두사 0x 無) : %x%n", price);
		System.out.printf("16진수(접두사 0x 有) : %#x%n", price);
		
		// 실수로 출력하고 싶을 땐(소수점 아래 6자리까지 출력하고 싶을 때), => 지시자 %f사용
		// 숫자(실수)에 0이 많이 들어가는 경우 , 지수형식으로 출력 => 지시자 %e
		// 지시자 f와 e 중 더 간략하게 표시할 수 있는 것을 선택해서 출력해주는 지시자 => %g
		float f = 123.456789999f;
		double d = 123.4567890;
		System.out.printf("%f%n",f); // float타입은 정밀도가 7자리 이기 때문에 7까지만 정확하고 나머지는 의미없는 숫자 
		System.out.printf("%e%n",f);
		
		// 출력 되는 자리수를 지정하고 싶다면 (정수) => 지시자 앞에 숫자 붙이기 
		System.out.printf("[%8d%n]",price); // 8자리 출력 // 왼쪽 정렬
		System.out.printf("[%-8d%n]",price); // 오른쪽 정렬 
		System.out.printf("[%08d%n]",price); // 공백을 0으로 채우려면
		
		// 출력 되는 자리수를 지정하고 싶다면 (실수) => 지시자 앞에 숫자 붙이기 
		System.out.printf("d=%14.10f%n",d); // %전체자리.소수점아래자리f // 전체 14자리 중 소수점 아래 10자리
		
		// 출력 되는 자리수를 지정하고 싶다면 (문자열) => 지시자 앞에 숫자 붙이기 
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n",url);
		System.out.printf("[%20s]%n",url); // 왼쪽 정렬
		System.out.printf("[%-20s]%n",url); // 오른쪽 정렬
		System.out.printf("[%.8s]%n",url); // 8자리만 출력하고 싶을 때 
		
		
		// 정수의 오버플로우 : 표현가능한 범위를 넘어서는 것 (계수기) 9999->0000->0001....
		// 오버플로우가 발생했다는 것은 ... 최대값 +1 => 최소값이 된다는 뜻 , 최소값 -1 => 최대값 이 됨.
		// 4자리가 있을 때 10진수의 최대값은 9999, 2진수의 최대값은 1111 -> 0000 -> 0001 -> 0010..
		// 부호 있는 정수와 부호 없는 정수에 오버플로우 발생 시 어떻게 되는지 구분할 수 있으면 됨
		// 10진수 : 한 자리에 표현할 수 있는 수 => 0~9 숫자 (0,1,2,3,4,5,6,7,8,9)
		// 2진수 : 한 자리에 0,1 둘 중 하나의 숫자만이 올 수 있음
		// 8진수 : 한 자리에 0~7중 하나의 숫자가 올 수 있음 
		// 16진수 : 한 자리에 0~15중 하나의 숫자가 올 수 있음
		// 8진수도 정수, 10진수도 정수, 16진수도 정수임(=>byte,short,int,long타입 쓸 수 있다는 말)!!
		
		
		
		
	}

}
