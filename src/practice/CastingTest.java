package practice;

public class CastingTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine("red", 2);
		Car car = null;
		car = fe;
		if(car instanceof FireEngine) {
			FireEngine fe2 = (FireEngine)car ;
			System.out.println("Çüº¯È¯ ¿Ï·á!!");
			fe2.water();
			System.out.println(fe.toString());
		}
		

	}

}

class Car{
	
	private String color;
	private int door;
	
	Car(String color, int door){
		this.color = color;
		this.door = door;
	}
	
	void drive() {System.out.println("drive~~~~~");}
	void stop() {System.out.println("stop~~~~~~~~~~~~~~~~~~");}

	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + "]";
	}
	
	
}

class FireEngine extends Car{
	
	FireEngine(String color,int door){
		super(color,door);
	}
	
	void water() {System.out.println("water~~~~~");}


	
	
}

class Ambulance extends Car{
	
	Ambulance(String color, int door){
		super(color,door);
	}
	
	void sound() {System.out.println("»ß»Ç»ß»Ç~~~~");}
}
