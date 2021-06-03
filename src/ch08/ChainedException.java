package ch08;

public class ChainedException {
	
	public static void main(String[] args) {
		
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		}catch(Exception e) {
			// ��ġ �� �߻��� ���� �̿��� ���ܵ��� �ٷ��.
			e.printStackTrace();
		}
		
	}
	
	
	static void install() throws InstallException{
		
		try {
			
			// ���α׷� ��ġ�� �ʿ��� ���� �غ�
			startInstall();
			
			// ���ϵ��� ������
			copyFile();
			
		} catch (SpaceException e) {
			InstallException ie = new InstallException("��ġ�� ���� �߻�");
			ie.initCause(e); // SpaceException�� InstallException�� ���� ���ܷ� ���������ν� SpaceException�� �ִ´�.
			throw ie;
		} catch (MemoryException e) {
			InstallException ie = new InstallException("��ġ �� ���� �߻�");
			ie.initCause(e);
			throw ie;
		}finally {
			
			// ���α׷� ��ġ�� ���� �ӽ� ���� ����� 
			deleteTempFile();
		}
		// ���ϵ� ����

	}//install() ��
	
	static void startInstall() throws SpaceException,MemoryException {
		
		// ����� ��ġ ������ ������..
		if(!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		
		// ����� �޸𸮰� ���ٸ�...
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�");
		}
	}// startInstall() ��
	
	static void copyFile() {/* ���ϵ��� �����ϴ� �ڵ带 ���´� */}
	
	static void deleteTempFile() {/* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´� */}
	
	static boolean enoughSpace() {
		// ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ� �ۼ�
		return false;
	}// enoughSpace() ��
	
	static boolean enoughMemory() {
		// ��ġ�ϴµ� �ʿ��� �޸� ������ �ִ��� Ȯ���ϴ� �ڵ� �ۼ�
		return false;
	}// enoughMemory() ��
	

}//ChainedException.java��

	
class InstallException extends Exception {
	
	InstallException(String msg) {
		super(msg);
	}
}//InstallException Ŭ���� ��


class SpaceException extends Exception {
	
	SpaceException(String msg) {
		super(msg);
	}
}// SpaceException Ŭ���� ��


class MemoryException extends Exception{
	
	MemoryException(String msg) {
		super(msg);
	}
}//MemoryException Ŭ���� ��

