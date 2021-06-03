package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("사용중인 OS의 인코딩 : "+isr.getEncoding());
		
		String line ="";
		do {
			System.out.print("문장을 입력하세요. 마치시려면 Q를 입력하세요>>");
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("입력하신 문장 : "+line);
		}while(!line.equalsIgnoreCase("q"));
		
		//br.close(); // System.in과 같은 표준입출력은 닫지 않아도 된다.

	}

}
