package ch12;

import java.util.ArrayList;

class Fruit { public String toString() { return "Fruit";}}

class Apple extends Fruit { public String toString() { return "Apple";}}

class Grape extends Fruit { public String toString() { return "Grape";}}

class Juice{ // Juicer클래스로 인해 만들어진 주스 
	
	String name;
	
	Juice(String name) {
		this.name = name+"Juice";
	}
	
	public String toString() {
		return name;
	}
}

class Juicer{
	
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		
		String tmp = "";
		
		for(Fruit f : box.getList()) { // 과일 박스에 들어있는 과일들 이름 합치기 
			tmp += f+" ";
		}

		return new Juice(tmp); // 과일 박스에 들어있는 과일들로 만들어진 주스 인스턴스 생성
	}
	
}

class Box <T>{
	
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList(){
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
} // Box class 끝

class FruitBox<T extends Fruit> extends Box<T>{ }



public class FruitBoxEx3 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		

	}

}






