package ch15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx4 {

	public static void main(String[] args) {
		
	// ���� ���丮�� ���� ���ϰ� ���丮�� �̸��� ũ�� �� �������� �����ִ� ����
		
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd a HH:mm ");
		
		// ���� ���� �Ʒ��� �ִ� ��������,������ �迭 ���·� ��ȯ
		File[] files = dir.listFiles();
		
		System.out.println("\t��¥\t�ð�\t����\t\t���� �뷮\t\t�̸�");
		
		for(int i=0;i<files.length;i++) {
			
			File f = files[i];
			String name = f.getName();
			String attribute = "";
			String fileSize = "";
			
			if(f.isDirectory()) { // ���� �����ΰ��
				attribute = "DIR";
			}else { // ������ ���
				fileSize = f.length() + ""; // ���� ũ�� ��ȯ
				
				attribute = f.canRead() ? "reable" : " ";
				attribute += f.canWrite() ? "writable" : " ";
				attribute += f.isHidden() ? "hiddenable" : " ";
			}
			System.out.printf("%s  %3s  %6s  %s\n",df.format(new Date(f.lastModified())),attribute,fileSize,name);
		}
		
		

	}

}
