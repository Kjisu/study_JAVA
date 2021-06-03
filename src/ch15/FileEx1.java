package ch15;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("C:\\java\\workout\\ruleOfJava\\src\\ch15\\FileEx1.java");
		
		String fileName = f.getName(); // 파일 이름 가져옴
		int pos = fileName.lastIndexOf("."); // 특정 문자 위치 찾기
		System.out.println("pos - "+pos);
		
		System.out.println("경로를 제외한 파일 이름 : " +f.getName());
		System.out.println("확장자를 제외한 파일 이름 : " +fileName.substring(0, pos));
		System.out.println("확장자 : "+fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일이름 : "+f.getPath());
		System.out.println("파일의 절대 경로 : "+f.getAbsolutePath());
		System.out.println("파일의 정규 경로 : "+f.getCanonicalPath()); // 정규 경로 : 기호, 링크 등을 포함하지 않는 유일한 경로
		// OS에 따라, 하나의 파일에 대해 둘 이상의 절대경로가 존재할 수 있다.
		// C:\java\workout\ruleOfJava\src\ch15\FileEx1.java
		// C:\java\workout\ruleOfJava\src\.\FileEx1.java  // '.' => 현재 디렉토리 의미 
		
		System.out.println();
		
		// File.pathSeparator : (멤버변수) OS에서 사용하는 경로(path) 구분자. 윈도우 ";" 유닉스":"
		System.out.println("File.pathSeparator : "+File.pathSeparator);
		// File.pathSeparatorChar : (멤버변수) OS에서 사용하는 경로(path) 구분자. 윈도우 ";" 유닉스":"
		System.out.println("File.pathSeparatorChar : "+File.pathSeparatorChar);
		// File.separator : OS에서 사용하는 '이름' 구분자. 윈도우 "₩" 유닉스 "\"
		System.out.println("File.separator : "+File.separator); // File.separatorChar
		// File.separatorChar: OS에서 사용하는 '이름' 구분자. 윈도우 "₩" 유닉스 "\"
		System.out.println("File.separatorChar : " +File.separatorChar);
		
		System.out.println();
		
		//현재 디렉토리(폴더) 출력
		System.out.println("user.dir : "+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path?? : "+System.getProperty("sun.boot.class.path"));
		
		  
		  
		 
	}

}
