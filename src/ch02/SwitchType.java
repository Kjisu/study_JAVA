package ch02;

public class SwitchType {
	
	public static void main(String[] args) {
		
		String str = "3";
		int num = 5;
		
	// ���ڿ� ���ڰ��� ��ȯ
		System.out.println(str.charAt(0)); // "3" -> '3'���� ��ȯ
		System.out.println(str.charAt(0)-'0'); // ���� 3 : '0'�� ���� ���� Ÿ������ ����
		System.out.println(str.charAt(0)-'0' + 2); // 3+2 = 5
	// ���ڿ��� ��ȯ 
		System.out.println(num+"");
	// ���ڿ� -> ���ڷ� ��ȯ
		System.out.println("���ڿ� -> ���ڷ� ��ȯ : "+Integer.parseInt(str));
	// ���ڿ�  + ���� int Ÿ�� ������ ���ϱ�
		System.out.println(str+num);
	// ���� + ���� '0' ���ϸ� => ���ڰ� ��
		System.out.println(num+'0'); // '0'�� ���ڷ� 48 // 5+48 = 53
		System.out.println((char)(num+'0')); // charŸ�� 5�� �� 
	}

}
