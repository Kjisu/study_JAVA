package ch11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex11_11 {

	public static void main(String[] args) {
		
	// set������� ���� ��ü ������ �����ϱ�
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

	
// Ŭ���� ���� �� �׻� hashCode(), equals()�� �������̵� �ϴ°� ����
// hashCode(), equals()�� �������̵� �ؾ� HashSet�� �ٸ��� ������ �� �ִ�.
	
	@Override
	public int hashCode() {
		// int hash(Object...values); // ��������
		return Objects.hash(name,age); // �Ű������� iv�ֱ� // iv�� �ִ� ����? ��ü�� �����ϴ� ������ iv�̱� ����
	}

	
	@Override
	public boolean equals(Object obj) {
		
		// �׻� ����ȯ �ϱ� ���� �Ű������� �־��� ��ü�� Person��ü�� �´��� Ȯ��!!
			if(!(obj instanceof Person)) return false;
			
			Person p = (Person)obj;
			
		return name.equals(p.name) && this.age == p.age;
	}
}
