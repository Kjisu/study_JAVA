package ch15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class FileEx0 {

	public static void main(String[] args)throws Exception {
		
		// File��ü ����
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");

		// ���� or ������ �������� ������ ����
		if(!dir.exists()) {
			dir.mkdirs(); // ���� ����
		}
		if(!file1.exists()) {
			file1.createNewFile(); // ���� ����
		}
		if(!file2.exists()) {
			file2.createNewFile();
		}
		if(!file3.exists()) {
			file3.createNewFile();
		}
		
		// C:/Temp ������ ���� ����� File�迭�� ����
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("�ð�\t\t\t����\t\tũ��\t�̸�");
		System.out.println("-------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file:contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));//������ ������ ��¥
			
			if(file.isDirectory()) { // �������� ���� Ȯ��
				System.out.println("\t<DIR>\t\t\t " + file.getName()); // ���� �̸�
			}else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName()); // ���� ũ�� , ���� �̸�
			}
		}
		
	}

}
