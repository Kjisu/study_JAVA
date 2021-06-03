package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx02 {
	
	public static void main(String[] args) {
		
// int read(byte[] b, int off,int len)와 void write(byte[] b, int off, int len)를 사용해서 입출력하기
// int read(byte[] b, int off,int len) : 최대 len개의 데이터를 읽어서 배열 b의 지정된 위치(off)부터 저장
// void write(byte[] b, int off, int len) : 배열 b에 저장된 내용중 off번째부터 len개 만큼 읽어서 출력
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; // 결과값을 배열로 담기 위한 참조변수 
		byte[] tmp = new byte[10]; // 저장공간이 10개인 byte타입 배열 생성 - 초기화X
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		// 읽어온 데이터를 tmp배열에 0번부터 길이만큼 저장
		input.read(tmp, 0, tmp.length);
		
		// tmp[5]부터 5개의 데이터를 출력
		output.write(tmp,5,5);
		
		outSrc = output.toByteArray(); // 스트림에 있는 출력 데이터들을 바이트 배열 형태로 만들기
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("tmp : "+Arrays.toString(tmp));
		System.out.println("output Source : "+Arrays.toString(outSrc));
		
		
		
		
	}

}
