package ch15;

import java.io.File;
import java.util.Scanner;

public class FileEx8 {
	
	// 지정된 디렉토리와 하위 디렉토리에 있는 파일 중에서 지정된 확장자를 가진 파일을 delete()호출을 통해 삭제하기
	// delete()는 삭제에 성공 -> true  실패하면 -> false 반환
	
	
	public static void main(String[] args) {
		
		// scanner를 통해 삭제할 확장자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 확장자를 입력해주세요>>");
		String delThing = "."+sc.nextLine();
		System.out.println(delThing);
		
		// 파일 객체 생성
		File f = new File("C:/test");
		
		// 사용자가 입력한 확장자와 같은 확장자를 가진 파일을 지워주는 작업해주는 메서드 생성
		deleteFile(delThing, f);

		
	}
	
	public static void deleteFile(String delThing,File f ) {
		
		File[] list = f.listFiles();
		
		// list - 파일,폴더 섞여 있음  -> 파일만 골라내야 함
		for(int i=0;i<list.length;i++) {
			
			if(list[i].isDirectory()) { // 폴더인 경우
				deleteFile(delThing, list[i]);
			}else { // 파일인 경우
				
				String filename = list[i].getName();
				
				// 사용자가 입력한 확장자와 같은 확장자를 가진 파일인지 확인
				if(filename.indexOf(delThing) != -1) {
					
					// 삭제 작업 실행
					if(list[i].delete()) {
						System.out.println("'"+delThing+"' 확장자를 가진 파일 삭제 완료!!");
					}else {
						System.out.println("삭제 실패===");
					}
				}else {
					System.out.println("지정한 확장자를 가진 파일이 존재하지 않습니다.");
				}
			}

		}
		
		
	}

}
