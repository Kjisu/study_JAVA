package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		
	// Ű-�� ������ �����ϱ� ���� HashMap(=class) ��ü ����
		HashMap map = new HashMap();
	// �� ����
		map.put("myId", "1234");
		map.put("asdf", "11111");
		map.put("asdf", "1234"); // Ű ���� ���� ���, ������ ������ ������� ����.
		
	// �Էµ� ���̵� ���� HashMap���� �˻��Ͽ� ���� ��й�ȣ�� �Է¹��� ��й�ȣ�� ���ϱ�
	// ȭ�����κ��� ���δ����� �Է� �޴´�.
		Scanner s = new Scanner(System.in);
	// ��ġ�� ������ ���� �ݺ�, ��ġ�ϸ� �ݺ����� �ߴܵȴ�
		while(true) {
			System.out.println("id�� Password�� �Է��� �ּ���.");
			System.out.println("id >> ");
			String id = s.nextLine().trim(); // ���� ����(����ڰ� �Ǽ��� ���� �־��ٰ� �ؼ� ��й�ȣ�� Ʋ�������� �ȵǴϱ�)
			System.out.println("pwd >> ");
			String pwd = s.nextLine().trim();
			
			// HashMap ��ü�� ����Ǿ� �ִ� �����Ϳ� �Է¹��� ������ ��(�˻�)
			if(map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("id�� pwd�� ��ġ�մϴ�.");
					break;
				}else{
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
			}else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}// if�� ��
			
			
		}// while �� ��
		
		
		
	}

}
