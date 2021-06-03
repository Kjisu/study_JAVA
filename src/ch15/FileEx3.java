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
			System.out.println("유효하지 않은 디렉토리 입니다");
			System.exit(0);
		}
		
		printFileList(dir);

	}
	
	public static void printFileList(File dir) { // 파일 목록 출력 하는 기능을 가진 메서드
		
		// 절대 경로 출력 
		System.out.println(dir.getAbsolutePath()+ "디렉토리");
		
		// 폴더 안에 있는 파일 리스트 출력
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList();
		
		for(int i=0;i<files.length;i++) {
			String fileName = files[i].getName();
			
			// 해당 폴더 안에 디렉토리가 있다면 
			if(files[i].isDirectory()) {
				fileName = "["+fileName+"]";
				subDir.add(i+"");
			}
			
			System.out.println("파일(하위폴더) 이름 : "+fileName);
		}
		
		// 하위 폴더 갯수
		int dirNum = subDir.size();
		// 파일 갯수
		int fileNum = files.length - dirNum;
		
		System.out.println(fileNum+ "개의 파일 , "+ dirNum+ " 개의 폴더");

		
	}

}
