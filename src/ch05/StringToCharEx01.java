package ch05;

public class StringToCharEx01 {
	
	public static void main(String[] args) {
		
		// ���ڿ����� Ư�� ��ġ�� �ִ� ���ڿ��� �̾Ƴ��� ���� �� -> charAt(int index)
		// ���ڿ��� '����'�� �˰� ���� ��(���� ����) -> length()
		// ���ڿ����� Ư�� ��ġ(����)�� �ִ� ���ڿ��� �̾Ƴ��� ���� �� -> substring(int from,int to) // to�ε����� ����X
		// ���ڿ� -> ���ڹ迭�� ����� ���� �� -> toCharArray() 
		
		
		
		String source = "HelpMe";
		
		String[] morse= {".-","-...","-.-.","-..","."
						,"..-.","--.","....","..",".---"
						,"-.-",".-..","--","-.","---"
						,".--.","--.-",".-.","...","-"
						,"..-","...-",".--","-..-","-.--"
						,"--.."};
		
		String result = "";
		
		for(int i=0;i<source.length();i++) {
			// ��
			result += morse[source.charAt(i)-'A']; // 'S'-'A' -> 83-65 -> morse[18]
		}
 		
		
	}

}
