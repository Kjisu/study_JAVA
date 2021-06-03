package ch08;

public class ChainedException {
	
	public static void main(String[] args) {
		
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		}catch(Exception e) {
			// 설치 중 발생한 예외 이외의 예외들을 다룬다.
			e.printStackTrace();
		}
		
	}
	
	
	static void install() throws InstallException{
		
		try {
			
			// 프로그램 설치에 필요한 파일 준비
			startInstall();
			
			// 파일들을 복사함
			copyFile();
			
		} catch (SpaceException e) {
			InstallException ie = new InstallException("설치중 예외 발생");
			ie.initCause(e); // SpaceException을 InstallException의 원인 예외로 지정함으로써 SpaceException을 넣는다.
			throw ie;
		} catch (MemoryException e) {
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(e);
			throw ie;
		}finally {
			
			// 프로그램 설치에 사용된 임시 파일 지우기 
			deleteTempFile();
		}
		// 파일들 복사

	}//install() 끝
	
	static void startInstall() throws SpaceException,MemoryException {
		
		// 충분한 설치 공간이 없으면..
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		// 충분한 메모리가 없다면...
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다");
		}
	}// startInstall() 끝
	
	static void copyFile() {/* 파일들을 복사하는 코드를 적는다 */}
	
	static void deleteTempFile() {/* 임시파일들을 삭제하는 코드를 적는다 */}
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드 작성
		return false;
	}// enoughSpace() 끝
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드 작성
		return false;
	}// enoughMemory() 끝
	

}//ChainedException.java끝

	
class InstallException extends Exception {
	
	InstallException(String msg) {
		super(msg);
	}
}//InstallException 클래스 끝


class SpaceException extends Exception {
	
	SpaceException(String msg) {
		super(msg);
	}
}// SpaceException 클래스 끝


class MemoryException extends Exception{
	
	MemoryException(String msg) {
		super(msg);
	}
}//MemoryException 클래스 끝

