package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx02 {
	
	public static void main(String[] args) {
		
// int read(byte[] b, int off,int len)�� void write(byte[] b, int off, int len)�� ����ؼ� ������ϱ�
// int read(byte[] b, int off,int len) : �ִ� len���� �����͸� �о �迭 b�� ������ ��ġ(off)���� ����
// void write(byte[] b, int off, int len) : �迭 b�� ����� ������ off��°���� len�� ��ŭ �о ���
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; // ������� �迭�� ��� ���� �������� 
		byte[] tmp = new byte[10]; // ��������� 10���� byteŸ�� �迭 ���� - �ʱ�ȭX
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		// �о�� �����͸� tmp�迭�� 0������ ���̸�ŭ ����
		input.read(tmp, 0, tmp.length);
		
		// tmp[5]���� 5���� �����͸� ���
		output.write(tmp,5,5);
		
		outSrc = output.toByteArray(); // ��Ʈ���� �ִ� ��� �����͵��� ����Ʈ �迭 ���·� �����
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("tmp : "+Arrays.toString(tmp));
		System.out.println("output Source : "+Arrays.toString(outSrc));
		
		
		
		
	}

}
