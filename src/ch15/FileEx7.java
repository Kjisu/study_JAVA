package ch15;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class FileEx7 {
	
	// 특정 조건에 맞는 파일의 목록을 얻는 방법
	// FileNameFilter 인터페이스 구현 필요 - 익명 클래스 (한 번만 사용될꺼니까)
	
	public static void main(String[] args) {
		
		// 사용자가 입력값 불러오기 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("조건을 입력해 주세요>>");
		String condition = sc.nextLine();
		
		// 조회 하고 싶은 폴더(디렉토리) 주소 불러오기
		String currDir = System.getProperty("user.dir");
		
		// 파일 객체 생성
		File dir = new File(currDir);
		
		// String[] list() :  폴더 안에 있는 파일(or폴더)이름을 리턴(String 타입배열)
		// String[] list(FileNameFilter filter) : FileNameFilter인스턴스에 구현된 조건에 맞는 파일을 String배열(File배열)로 변환
		// File[] list(FileNameFilter filter)
		
		//?????? // accept를 정의해줬으면 익명 클래스 밖의 부분에서 accept를 다시 호출해서 써야하지 않나?
		String[] files = dir.list(new FilenameFilter() { 
			
			@Override
			public boolean accept(File dir, String name) {
				return name.indexOf(condition) != -1;
			}
		});
		
		//?????
		for(String file:files) {
			System.out.println("조건에 만족하는 파일 이름 : "+file);
		}
		
	}
	

}
