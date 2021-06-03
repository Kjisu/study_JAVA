package practice;

public class PolyArgument2 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv(1000));

	}

}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
	Product(){}
	
}

class Tv extends Product{
	
	Tv(int price){
		super(price);}
}

class Computer extends Product{}

class Buyer{
	int money;
	int bonusPoint;
	
	void buy(Product p) {
		
	}
	
}
