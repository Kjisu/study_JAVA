package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	
	// Queue ����ϱ� ���� ��ü ����
		static Queue q = new LinkedList();
		
	// Queue�� �ִ� 5���� ����ǵ��� �Ѵ� (�ֱ� 5���� �Է��� ��ɾ� 5���� �����ش�)
		static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			
			System.out.println(">>");
			
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim(); // �Է¹��� ���ڿ��� ��,�� ������ ��������
			
			if("".equals(input)) continue; // �Է��� ������ ������ ���� ������ �������� �ʰ� while(true)�� ����
										   // input.equals(null);�̶�� ���� ���� ������ -> input���� null�� ��� nullPointException�� �߻��ؼ� 
										   // �������� ���� �ʱ� ����.
			if(input.equalsIgnoreCase("q")) {
				System.exit(0); // q �Է½� ���α׷� ����
				
			}else if(input.equalsIgnoreCase("help")) {
				System.out.println("help - ������ �����ܴϴ�");
				System.out.println("q �Ǵ� Q - ���α׷��� �����մϴ�");
				System.out.println("history - �ֱٿ� �Է��� ��ɾ�"+MAX_SIZE+"���� �����ݴϴ�");
				save(input);
				
			}else if(input.equalsIgnoreCase("history")) {
				// �Է¹��� ��ɾ �����ϰ�
				save(input);
				
				// linkedlist�� ������ �����ش�
				LinkedList list = (LinkedList)q;
				
				final int SIZE = list.size();
				for(int i=0;i<SIZE;i++) {
					System.out.println((i+1)+". "+list.get(i));
				}
			}else {
				save(input);
				System.out.println(input);
			}
			
			
		}// while(true)

	}//main()
	
	public static void save(String input) {
		
		// ����ڰ� �Է��� �ܾ queue�� �����Ѵ�
		if(!"".equals(input)) q.offer(input); 
		
		// q�� ����Ǿ� �ִ� ������ 5�� �ʰ��� ��� �� ���� ���� �����ͺ��� �����Ѵ�
		if(q.size()>MAX_SIZE) q.remove();// ������ ��������Ÿ���� Queue���� size()�� ����� �� ������ �߰��� Linkedlist�� ���� ����� �� �ְ� ��
	}

}
