package ch11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex11_11 {

	public static void main(String[] args) {
		
	// set저장공간 만들어서 객체 데이터 저장하기
		Set set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);

	}
}


class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
			this.name = name;
			this.age = age;
	}

	@Override
	public String toString() {
		return name+":"+age;
	}

	
// 클래스 만들 때 항상 hashCode(), equals()를 오버라이딩 하는게 좋다
// hashCode(), equals()를 오버라이딩 해야 HashSet이 바르게 동작할 수 있다.
	
	@Override
	public int hashCode() {
		// int hash(Object...values); // 가변인자
		return Objects.hash(name,age); // 매개변수로 iv넣기 // iv를 넣는 이유? 객체를 구분하는 기준이 iv이기 때문
	}

	
	@Override
	public boolean equals(Object obj) {
		
		// 항상 형변환 하기 전에 매개변수로 주어진 객체가 Person객체가 맞는지 확인!!
			if(!(obj instanceof Person)) return false;
			
			Person p = (Person)obj;
			
		return name.equals(p.name) && this.age == p.age;
	}
}
