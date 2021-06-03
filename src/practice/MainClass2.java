package practice;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		Card10 c10 = new Card10("clover",9);
		Card10 c20 =new Card10(c10);
		
		c10.getInfo();
		c20.getInfo();
		}
	}
	
	
class Card10{
	String shape;
	int number;
	private static int width=10;
	private static int height=20;
	
	Card10(){}
	
	Card10(String shape, int number){
		this.shape = shape;
		this.number = number;}
	
	Card10(Card10 cd){
		this(cd.shape,cd.number);
	}
	
	public void getInfo() {
		System.out.println("카드 정보 : " +shape+" , "+number+"번");
	}
}
