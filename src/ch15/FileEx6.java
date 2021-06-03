package ch15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// ������ ���丮�� ���� ���丮�� ���Ե� , Ȯ���ڰ� 'java','txt','bak'�� ��� ������ ������ �о 
// 3���� ���Ͽ� ������ Ű���尡 ���Ե� ������ ���.

public class FileEx6 {
	
	static int found = 0;
	
	public static void main(String[] args) {
		
		// ����ڷκ��� Ű���� �Է¹ޱ� - ������ ����
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű���带 �Է��� �ּ���>>");
		String keyword = sc.nextLine();
		
		// ���� ��ü ����
		File currDir = new File("C:/test");
		
		// �ش� ���丮�� �����ϴ���, ���丮�� �´��� Ȯ��
		if(!currDir.exists() || !currDir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		// Ȯ���ڰ� java, txt,bak �̸鼭 ���� ���� �ȿ� ����ڷ� ���� �Է¹��� Ű���尡 �ִ��� Ȯ���ϴ� �޼��� ȣ��
		try {
			searchKeyword(currDir,keyword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// �� �� ���� ���ο��� Ű���尡 �ִ��� ��� 
		System.out.println("�� "+found+"���� ���ο��� '"+keyword+"'��/�� �߰��Ͽ����ϴ�."); 
	
	}
	
	public static void searchKeyword(File dir, String keyword) throws Exception {
		
		// ���� ���� �Ʒ��� �ִ� ���� ����, ���ϵ� ���.
		File[] file = dir.listFiles();
		
		for(int i=0;i<file.length;i++) {
			
			if(file[i].isDirectory()) { // ������ ���
				searchKeyword(file[i], keyword);
			}else { // ������ ���
				// Ȯ���ڰ� txt, java, bar���� Ȯ��
				String filename = file[i].getName(); // �����̸� 
				String extension = filename.substring(filename.lastIndexOf(".")+1); // Ȯ���ڸ� �����̽�
				extension = ","+extension+",";
				
				if(",java,txt,bak".indexOf(extension) != -1) { // Ȯ���ڰ� ��ġ�ϴٸ�
					
					// ������ ������ �о���̸鼭 Ư�� Ű���尡 �� °�ٿ� �ִ��� �ľ�
					
					filename = dir.getAbsolutePath()+"\\"+filename;
					
					// ���� �б����� fileReader ����
					FileReader fr = new FileReader(file[i]);
					BufferedReader br = new BufferedReader(fr);
					
					String data = "";
					int lineNum = 0;
					
					// �� �پ� �����鼭 Ű���尡 ����ִ��� Ȯ�� 
					while((data = br.readLine()) != null) { // ���� ������ �ִٸ� �ݺ�����
						lineNum++;
						
						if(data.indexOf(keyword) != -1) { // �ش� Ű���尡 �ִ� ���
							found++;
							System.out.println("["+filename+"(�ٹ�ȣ :"+lineNum+")"+"]"+"Ű���尡 ���Ե� ����: "+data);
						}
					}
				}
			}
		}
	}
}
