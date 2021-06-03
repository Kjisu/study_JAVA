package ch15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class FileEx0 {

	public static void main(String[] args)throws Exception {
		
		// File객체 생성
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");

		// 파일 or 폴더가 존재하지 않으면 생성
		if(!dir.exists()) {
			dir.mkdirs(); // 폴더 생성
		}
		if(!file1.exists()) {
			file1.createNewFile(); // 파일 생성
		}
		if(!file2.exists()) {
			file2.createNewFile();
		}
		if(!file3.exists()) {
			file3.createNewFile();
		}
		
		// C:/Temp 폴더의 내용 목록을 File배열로 얻음
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("-------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file:contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));//마지막 수정된 날짜
			
			if(file.isDirectory()) { // 폴더인지 여부 확인
				System.out.println("\t<DIR>\t\t\t " + file.getName()); // 폴더 이름
			}else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName()); // 파일 크기 , 폴더 이름
			}
		}
		
	}

}
