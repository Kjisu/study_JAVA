package ch15;

public class UserInfo implements java.io.Serializable{ // ��ü�� �ܺη� ���������� �ݵ�� implements �����!!
	
	String name;
	String password;
	int age;
	
	public UserInfo(String name, String password,int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public UserInfo(){
		this("Unknown","1111",0);
	}
	
	public String toString() {
		return "("+name+ ","+password+","+age+")";
	}

}
