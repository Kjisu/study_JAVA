package ch13;

public class ThreadEx4 {

	public static void main(String[] args) {
		
		// �ϳ��� ������(=���� ������)�� �۾��ϴ� ���
		
		// �۾� �����ϱ� �� �ý����� �ð� ����
			long startTime = System.currentTimeMillis();
		
		// ù ��° �۾��� ���� : - �� 300�� ����ϱ�
			for(int i=0;i<300;i++) {
				System.out.println("-");
			}
		
		// ù ��° �۾� �� �ð�
			System.out.println("ù ��° �۾� �ҿ�ð� : "+(System.currentTimeMillis() - startTime));
			
		// �� ��° �۾��� ���� : | �� 300�� ����ϱ�
			for(int i=0;i<300;i++) {
				System.out.println("|");
			}
			
		// �� ��° �۾� �� �ð�
			System.out.println("�� ��° �۾� �ҿ�ð� : "+(System.currentTimeMillis() - startTime));
			
	}

}
