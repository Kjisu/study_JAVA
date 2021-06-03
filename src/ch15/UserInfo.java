package ch15;

public class UserInfo implements java.io.Serializable{ // 객체를 외부로 내보내려면 반드시 implements 해줘야!!
	
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
