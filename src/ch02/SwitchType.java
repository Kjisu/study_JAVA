package ch02;

public class SwitchType {
	
	public static void main(String[] args) {
		
		String str = "3";
		int num = 5;
		
	// 문자와 숫자간의 변환
		System.out.println(str.charAt(0)); // "3" -> '3'으로 변환
		System.out.println(str.charAt(0)-'0'); // 숫자 3 : '0'을 빼면 숫자 타입으로 변함
		System.out.println(str.charAt(0)-'0' + 2); // 3+2 = 5
	// 문자열로 변환 
		System.out.println(num+"");
	// 문자열 -> 숫자로 변환
		System.out.println("문자열 -> 숫자로 변환 : "+Integer.parseInt(str));
	// 문자열  + 정수 int 타입 데이터 더하기
		System.out.println(str+num);
	// 숫자 + 문자 '0' 더하면 => 문자가 됨
		System.out.println(num+'0'); // '0'은 숫자로 48 // 5+48 = 53
		System.out.println((char)(num+'0')); // char타입 5가 됨 
	}

}
