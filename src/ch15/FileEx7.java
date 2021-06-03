package ch15;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class FileEx7 {
	
	// Ư�� ���ǿ� �´� ������ ����� ��� ���
	// FileNameFilter �������̽� ���� �ʿ� - �͸� Ŭ���� (�� ���� ���ɲ��ϱ�)
	
	public static void main(String[] args) {
		
		// ����ڰ� �Է°� �ҷ����� 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���>>");
		String condition = sc.nextLine();
		
		// ��ȸ �ϰ� ���� ����(���丮) �ּ� �ҷ�����
		String currDir = System.getProperty("user.dir");
		
		// ���� ��ü ����
		File dir = new File(currDir);
		
		// String[] list() :  ���� �ȿ� �ִ� ����(or����)�̸��� ����(String Ÿ�Թ迭)
		// String[] list(FileNameFilter filter) : FileNameFilter�ν��Ͻ��� ������ ���ǿ� �´� ������ String�迭(File�迭)�� ��ȯ
		// File[] list(FileNameFilter filter)
		
		//?????? // accept�� ������������ �͸� Ŭ���� ���� �κп��� accept�� �ٽ� ȣ���ؼ� ������� �ʳ�?
		String[] files = dir.list(new FilenameFilter() { 
			
			@Override
			public boolean accept(File dir, String name) {
				return name.indexOf(condition) != -1;
			}
		});
		
		//?????
		for(String file:files) {
			System.out.println("���ǿ� �����ϴ� ���� �̸� : "+file);
		}
		
	}
	

}
