package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("������� OS�� ���ڵ� : "+isr.getEncoding());
		
		String line ="";
		do {
			System.out.print("������ �Է��ϼ���. ��ġ�÷��� Q�� �Է��ϼ���>>");
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�Է��Ͻ� ���� : "+line);
		}while(!line.equalsIgnoreCase("q"));
		
		//br.close(); // System.in�� ���� ǥ��������� ���� �ʾƵ� �ȴ�.

	}

}
