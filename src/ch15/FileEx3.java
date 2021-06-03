package ch15;

import java.io.File;
import java.util.ArrayList;

public class FileEx3 {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx3 DIRECTORY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�");
			System.exit(0);
		}
		
		printFileList(dir);

	}
	
	public static void printFileList(File dir) { // ���� ��� ��� �ϴ� ����� ���� �޼���
		
		// ���� ��� ��� 
		System.out.println(dir.getAbsolutePath()+ "���丮");
		
		// ���� �ȿ� �ִ� ���� ����Ʈ ���
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList();
		
		for(int i=0;i<files.length;i++) {
			String fileName = files[i].getName();
			
			// �ش� ���� �ȿ� ���丮�� �ִٸ� 
			if(files[i].isDirectory()) {
				fileName = "["+fileName+"]";
				subDir.add(i+"");
			}
			
			System.out.println("����(��������) �̸� : "+fileName);
		}
		
		// ���� ���� ����
		int dirNum = subDir.size();
		// ���� ����
		int fileNum = files.length - dirNum;
		
		System.out.println(fileNum+ "���� ���� , "+ dirNum+ " ���� ����");

		
	}

}
