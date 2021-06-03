package ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataOutputStreamEx02 {
	
	public static void main(String[] args ) {
		
		int score = 0;
		int sum = 0;
		
		FileInputStream input = null;
		DataInputStream dis = null;
		
		try {
			input = new FileInputStream("score.dat");
			dis = new DataInputStream(input);
			
			while(true) {
				score = dis.readInt();
				System.out.println("점수 : "+score);
				sum += score;
			
			}
		} catch (EOFException e) { //EOFException e : 더 이상 읽을 데이터가 없으면 발생 
			
			// 더 이상 읽을 데이터가 없는 경우 실행됨
			System.out.println("점수의 총합은 "+score+" 입니다.");
			
		} catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			
			// 참조변수 dis가 null일때 close()를 호출하면 NullPointException이 발생
			if(dis != null) {
				try {
					dis.close(); 
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
