package ch15;

import java.io.File;

public class FileEx9 {
	
	// ���� �̸� �ٲٱ�
	// �̹��� �� ���ؼ� ���ϸ��� ������ �̹������ϵ��� �����̵�� �� �� ������ �ٷ���� ���� ���.
	
	public static void main(String[] args) {
		
		File dir = new File("C:/test");
		
		if(!dir.exists()||!dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
		}
		
		File[] list = dir.listFiles();
		
		for(int i=0;i<list.length;i++) {
			
			String fileName = list[i].getName();
			// ���ϸ�
			String newFileName = "0000"+fileName;
			newFileName = newFileName.substring(newFileName.length());
			list[i].renameTo(new File(dir, newFileName));
		}
	}

}
