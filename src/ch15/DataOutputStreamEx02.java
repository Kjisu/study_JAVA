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
				System.out.println("���� : "+score);
				sum += score;
			
			}
		} catch (EOFException e) { //EOFException e : �� �̻� ���� �����Ͱ� ������ �߻� 
			
			// �� �̻� ���� �����Ͱ� ���� ��� �����
			System.out.println("������ ������ "+score+" �Դϴ�.");
			
		} catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			
			// �������� dis�� null�϶� close()�� ȣ���ϸ� NullPointException�� �߻�
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
