package ch15;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			
			dos = new DataOutputStream(new FileOutputStream("sample.dat"));
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			
			dos.close(); // 출력한 값들은 이진 데이터로 저장됨
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}
