package ch15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx4 {

	public static void main(String[] args) {
		
	// 현재 디렉토리에 속한 파일과 디렉토리의 이름과 크기 등 상세정보를 보여주는 예제
		
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd a HH:mm ");
		
		// 현재 폴더 아래에 있는 하위폴더,파일을 배열 형태로 반환
		File[] files = dir.listFiles();
		
		System.out.println("\t날짜\t시간\t종류\t\t파일 용량\t\t이름");
		
		for(int i=0;i<files.length;i++) {
			
			File f = files[i];
			String name = f.getName();
			String attribute = "";
			String fileSize = "";
			
			if(f.isDirectory()) { // 하위 폴더인경우
				attribute = "DIR";
			}else { // 파일인 경우
				fileSize = f.length() + ""; // 파일 크기 반환
				
				attribute = f.canRead() ? "reable" : " ";
				attribute += f.canWrite() ? "writable" : " ";
				attribute += f.isHidden() ? "hiddenable" : " ";
			}
			System.out.printf("%s  %3s  %6s  %s\n",df.format(new Date(f.lastModified())),attribute,fileSize,name);
		}
		
		

	}

}
