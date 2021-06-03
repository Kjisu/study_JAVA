package ch15;

import java.io.File;

public class FileEx9 {
	
	// 파일 이름 바꾸기
	// 이미지 뷰어를 통해서 파일명이 숫자인 이미지파일들을 슬라이드로 볼 때 순서를 바로잡기 위해 사용.
	
	public static void main(String[] args) {
		
		File dir = new File("C:/test");
		
		if(!dir.exists()||!dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
		}
		
		File[] list = dir.listFiles();
		
		for(int i=0;i<list.length;i++) {
			
			String fileName = list[i].getName();
			// 파일명
			String newFileName = "0000"+fileName;
			newFileName = newFileName.substring(newFileName.length());
			list[i].renameTo(new File(dir, newFileName));
		}
	}

}
