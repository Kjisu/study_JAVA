package ch15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 지정한 디렉토리와 서브 디렉토리에 포함된 , 확장자가 'java','txt','bak'인 모든 파일의 내용을 읽어서 
// 3개의 파일에 지정한 키워드가 포함된 라인을 출력.

public class FileEx6 {
	
	static int found = 0;
	
	public static void main(String[] args) {
		
		// 사용자로부터 키워드 입력받기 - 변수에 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("키워드를 입력해 주세요>>");
		String keyword = sc.nextLine();
		
		// 파일 객체 생성
		File currDir = new File("C:/test");
		
		// 해당 디렉토리가 존재하는지, 디렉토리가 맞는지 확인
		if(!currDir.exists() || !currDir.isDirectory()) {
			System.out.println("유효하지 않은 디레토리입니다.");
			System.exit(0);
		}
		
		// 확장자가 java, txt,bak 이면서 파일 내용 안에 사용자로 부터 입력받은 키워드가 있는지 확인하는 메서드 호출
		try {
			searchKeyword(currDir,keyword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// 총 몇 개의 라인에서 키워드가 있는지 출력 
		System.out.println("총 "+found+"개의 라인에서 '"+keyword+"'를/을 발견하였습니다."); 
	
	}
	
	public static void searchKeyword(File dir, String keyword) throws Exception {
		
		// 현재 폴더 아래에 있는 하위 폴더, 파일들 출력.
		File[] file = dir.listFiles();
		
		for(int i=0;i<file.length;i++) {
			
			if(file[i].isDirectory()) { // 폴더인 경우
				searchKeyword(file[i], keyword);
			}else { // 파일인 경우
				// 확장자가 txt, java, bar인지 확인
				String filename = file[i].getName(); // 파일이름 
				String extension = filename.substring(filename.lastIndexOf(".")+1); // 확장자만 슬라이싱
				extension = ","+extension+",";
				
				if(",java,txt,bak".indexOf(extension) != -1) { // 확장자가 일치하다면
					
					// 파일의 내용을 읽어들이면서 특정 키워드가 몇 째줄에 있는지 파악
					
					filename = dir.getAbsolutePath()+"\\"+filename;
					
					// 파일 읽기위해 fileReader 생성
					FileReader fr = new FileReader(file[i]);
					BufferedReader br = new BufferedReader(fr);
					
					String data = "";
					int lineNum = 0;
					
					// 한 줄씩 읽으면서 키워드가 들어있는지 확인 
					while((data = br.readLine()) != null) { // 읽을 내용이 있다면 반복실행
						lineNum++;
						
						if(data.indexOf(keyword) != -1) { // 해당 키워드가 있는 경우
							found++;
							System.out.println("["+filename+"(줄번호 :"+lineNum+")"+"]"+"키워드가 포함된 문장: "+data);
						}
					}
				}
			}
		}
	}
}
