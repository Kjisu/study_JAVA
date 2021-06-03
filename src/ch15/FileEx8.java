package ch15;

import java.io.File;
import java.util.Scanner;

public class FileEx8 {
	
	// ������ ���丮�� ���� ���丮�� �ִ� ���� �߿��� ������ Ȯ���ڸ� ���� ������ delete()ȣ���� ���� �����ϱ�
	// delete()�� ������ ���� -> true  �����ϸ� -> false ��ȯ
	
	
	public static void main(String[] args) {
		
		// scanner�� ���� ������ Ȯ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ Ȯ���ڸ� �Է����ּ���>>");
		String delThing = "."+sc.nextLine();
		System.out.println(delThing);
		
		// ���� ��ü ����
		File f = new File("C:/test");
		
		// ����ڰ� �Է��� Ȯ���ڿ� ���� Ȯ���ڸ� ���� ������ �����ִ� �۾����ִ� �޼��� ����
		deleteFile(delThing, f);

		
	}
	
	public static void deleteFile(String delThing,File f ) {
		
		File[] list = f.listFiles();
		
		// list - ����,���� ���� ����  -> ���ϸ� ��󳻾� ��
		for(int i=0;i<list.length;i++) {
			
			if(list[i].isDirectory()) { // ������ ���
				deleteFile(delThing, list[i]);
			}else { // ������ ���
				
				String filename = list[i].getName();
				
				// ����ڰ� �Է��� Ȯ���ڿ� ���� Ȯ���ڸ� ���� �������� Ȯ��
				if(filename.indexOf(delThing) != -1) {
					
					// ���� �۾� ����
					if(list[i].delete()) {
						System.out.println("'"+delThing+"' Ȯ���ڸ� ���� ���� ���� �Ϸ�!!");
					}else {
						System.out.println("���� ����===");
					}
				}else {
					System.out.println("������ Ȯ���ڸ� ���� ������ �������� �ʽ��ϴ�.");
				}
			}

		}
		
		
	}

}
