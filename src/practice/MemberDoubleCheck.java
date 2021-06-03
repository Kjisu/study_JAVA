package practice;

public class MemberDoubleCheck {
	
	public static void main(String[] args) {
		
		MemberBean mb1 = new MemberBean();
		MemberBean mb2 = new MemberBean();
		
		mb1.setName("angele");
		mb2.setName("angele");
		
		if(mb1.equals(mb2)) {
			System.out.println("중복된 아이디 입니다");
		}else {
			System.out.println("사용 가능 아이디 입니다.");
		}
		
	}
	}
	
class MemberBean{
	
	private String id;
	private String pwd;
	
	public MemberBean() {}
	
	
	public String getName() {
		return id;
	}
	public void setName(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", pwd=" + pwd + "]";
	}


	@Override // 같은 클래스 타입을 가진 서로 다른 두 객체의 인스턴스 변수의 값이 일치하는지 아닌지 비교하는 메서드
	public boolean equals(Object obj) {
		if(!(obj instanceof MemberBean)) return false;
			MemberBean mb = (MemberBean)obj;
			return mb.id == this.id;
	}
	
	
	
}

