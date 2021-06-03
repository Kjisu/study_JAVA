package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx01 {
	
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data=input.read()) != -1) { // read()로 불러온 값을 data에 저장하고, data에 저장된 값이 -1아닌지 비교
										   // read() : 1byte를 읽어온다. 더 이상 읽어올 데이터가 없으면 -1값 반환.
			output.write(data);//write(int d) : 매개변수로 주어진 값을 출력함.
		}
		
		// 바이트 배열은 자원이 메모리 밖에 없어서 가비지컬렉터에 의해 자동적으로 자원을 반환함.
		// => 그래서 close()를 이용해서 스트림을 닫지 않아도 됨!!
		
		outSrc = output.toByteArray(); // 출력한 것들을 byte타입 배열로 만들기 
		
		System.out.println("Input Source : "+Arrays.toString(inSrc)); // toString()해주지 않으면 객체 주소값이 출력됨.
		System.out.println("Output Source : "+Arrays.toString(outSrc));
		
		
	}

}
