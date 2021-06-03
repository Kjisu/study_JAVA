package ch05;

public class StringToCharEx01 {
	
	public static void main(String[] args) {
		
		// 문자열에서 특정 위치에 있는 문자열을 뽑아내고 싶을 때 -> charAt(int index)
		// 문자열의 '길이'를 알고 싶을 때(문자 갯수) -> length()
		// 문자열에서 특정 위치(범위)에 있는 문자열을 뽑아내고 싶을 때 -> substring(int from,int to) // to인덱스는 포함X
		// 문자열 -> 문자배열로 만들고 싶을 때 -> toCharArray() 
		
		
		
		String source = "HelpMe";
		
		String[] morse= {".-","-...","-.-.","-..","."
						,"..-.","--.","....","..",".---"
						,"-.-",".-..","--","-.","---"
						,".--.","--.-",".-.","...","-"
						,"..-","...-",".--","-..-","-.--"
						,"--.."};
		
		String result = "";
		
		for(int i=0;i<source.length();i++) {
			// ★
			result += morse[source.charAt(i)-'A']; // 'S'-'A' -> 83-65 -> morse[18]
		}
 		
		
	}

}
