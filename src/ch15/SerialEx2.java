package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerialEx2 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("UserInfo.ser");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			// ��ü�� ���� ���� ����� ������ ��ġ�ؾ� �Ѵ�.
			UserInfo u1 = (UserInfo)in.readObject();
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)in.readObject();
			
		}catch(Exception e) {
			
		}
	}

}
