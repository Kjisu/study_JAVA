package practice;

public class MemberExample {
	
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다");
		}else {
			System.out.println("obj1과 obj2는 동일하지 않습니다.");
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
		if(obj instanceof Member) {//DTO 타입의 클래스 만들 때, 이런 처리 해줘야.
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	
}