package practice;

public class Person {
	
	/* DTO타입의 클래스 설계시 , 반드시 만들어줘야 하는 6가지 (쓰든 안 쓰든)*/
	
	///////////////////////1. 멤버변수 (되도록이면 private, 외부에서 접근하지 못 하도록)
	private String name;
	private int age;

	///////////////////////2. 생성자
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	Person(){}
	
	/////////////////////// 3. setter/getter 메서드 (멤버변수 초기화 위함)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//////////////////////// 4. equals()메서드 : 알아서 블럭 안의 내용은 커스텀 하면 된다.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//////////////////////// 5. hashtag()메서드

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	////////////////////////// 6. toString()메서드 

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
