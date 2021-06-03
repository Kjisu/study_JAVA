package ch12;

import java.util.ArrayList;

class Fruit { public String toString() { return "Fruit";}}

class Apple extends Fruit { public String toString() { return "Apple";}}

class Grape extends Fruit { public String toString() { return "Grape";}}

class Juice{ // JuicerŬ������ ���� ������� �ֽ� 
	
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
		
		for(Fruit f : box.getList()) { // ���� �ڽ��� ����ִ� ���ϵ� �̸� ��ġ�� 
			tmp += f+" ";
		}

		return new Juice(tmp); // ���� �ڽ��� ����ִ� ���ϵ�� ������� �ֽ� �ν��Ͻ� ����
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
} // Box class ��

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






