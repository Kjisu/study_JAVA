package ch04;

public class WhileEx01 {

	public static void main(String[] args) {
		
/*
 * <반복문 while>
 * 
 * # 형태 : while(조건식){ 
 * 	  		조건식이 '참'일때만 바디안의 수행문을 반복실행한다.
 * 			블럭안의 내용을 수행한 후에는 조건식으로 돌아가서 참인지 거짓인지 또 다시 판단.
 * 			}
 * 
 * # 초기식, 증감식이 필요없는 경우 => while()문 사용
 * # while문의 조건식은 생략 불가
 * 	 while(){ // 에러 발생 , 반면 for문에서는 for(;;)조건식 작성하는 자리에 생략하면 무한 루프가 됨
 *   }
 * # for문에서의 무한 반복문 : for(;;){}
 * # while문에서의     "    : while(true){} // 조건식에 true라고 직접 써줌
 * 
 * 
 * 
 */

	// 변수 i의 값만만큼(4~0) 바디 안에 있는 작업 반복하기 
		int i=5;
		while(i--!=0) { // i가 0이 되면 반복문을 빠져 나간다
			System.out.printf("%d - i can do it %n",i); // 4~0
		}
		// i--!=0 i--가 후위형이기에 조건식이 평가 된 후 (i!=0)값이 감소된다는 것에 주의
		// 즉, 이거랑 같은 의미
			while(i!=0) {
				i--;
				System.out.printf("%d - i can do it %n",i); // 4~0
			}
		
	// 변수 i의 값만만큼(5~1) 바디 안에 있는 작업 반복하기 
		//int i = 6;
		//while(--i>=1) {
		//	System.out.printf("%d - i can do it %n",i); // 5~1
		//}
		
		
		
		
		
		
	}

}
