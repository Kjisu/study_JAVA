package practice;

public class Person {
	
	/* DTOŸ���� Ŭ���� ����� , �ݵ�� �������� �ϴ� 6���� (���� �� ����)*/
	
	///////////////////////1. ������� (�ǵ����̸� private, �ܺο��� �������� �� �ϵ���)
	private String name;
	private int age;

	///////////////////////2. ������
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	Person(){}
	
	/////////////////////// 3. setter/getter �޼��� (������� �ʱ�ȭ ����)

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
	
	//////////////////////// 4. equals()�޼��� : �˾Ƽ� �� ���� ������ Ŀ���� �ϸ� �ȴ�.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//////////////////////// 5. hashtag()�޼���

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
	
	////////////////////////// 6. toString()�޼��� 

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
