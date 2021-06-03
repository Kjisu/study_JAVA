package practice;

public class MemberExample {
	
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�");
		}else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
	}
}

class Member{
	
	String id;
	
	Member(String id){
		this.id= id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {//DTO Ÿ���� Ŭ���� ���� ��, �̷� ó�� �����.
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	
}