package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileViewer {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream input = new FileInputStream(args[0]);
			FileOutputStream output = new FileOutputStream(args[1]);
			
			int data = 0;
			while((data=input.read()) != -1) {
				output.write(data);
			}
			output.close();
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
