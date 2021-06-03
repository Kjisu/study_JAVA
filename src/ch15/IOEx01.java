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
		
		while((data=input.read()) != -1) { // read()�� �ҷ��� ���� data�� �����ϰ�, data�� ����� ���� -1�ƴ��� ��
										   // read() : 1byte�� �о�´�. �� �̻� �о�� �����Ͱ� ������ -1�� ��ȯ.
			output.write(data);//write(int d) : �Ű������� �־��� ���� �����.
		}
		
		// ����Ʈ �迭�� �ڿ��� �޸� �ۿ� ��� �������÷��Ϳ� ���� �ڵ������� �ڿ��� ��ȯ��.
		// => �׷��� close()�� �̿��ؼ� ��Ʈ���� ���� �ʾƵ� ��!!
		
		outSrc = output.toByteArray(); // ����� �͵��� byteŸ�� �迭�� ����� 
		
		System.out.println("Input Source : "+Arrays.toString(inSrc)); // toString()������ ������ ��ü �ּҰ��� ��µ�.
		System.out.println("Output Source : "+Arrays.toString(outSrc));
		
		
	}

}
