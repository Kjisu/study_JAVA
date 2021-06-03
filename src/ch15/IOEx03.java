package ch15;

import java.awt.print.Printable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx03 {
	
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] tmp = new byte[4];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		System.out.println("Input source : "+Arrays.toString(inSrc));
		System.out.println("======================================");
		
		while(input.available()>0) {
			try {
				input.read(tmp); // tmp�迭 ��� ������ŭ �о�� 
				output.write(tmp);
				
				//int len = input.read(tmp);
				//output.write(tmp, 0, len);
				
				//System.out.println("tmp : "+Arrays.toString(tmp));
				
				// ��� ��Ʈ���� �ִ� �����͸� ����Ʈ �迭�� �ٲٱ� 
				outSrc = output.toByteArray();
				
				printArrays(tmp,outSrc);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void printArrays(byte[] tmp, byte[] outSrc) {
		
		System.out.println("tmp : "+Arrays.toString(tmp));
		System.out.println("outSrc : "+Arrays.toString(outSrc));
	}
}
