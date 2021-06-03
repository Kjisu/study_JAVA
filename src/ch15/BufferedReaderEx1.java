package ch15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("BufferedReaderEx1.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			while((line=br.readLine()) != null){
				
				if(line.indexOf(";") != -1) {
					System.out.println(line);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
