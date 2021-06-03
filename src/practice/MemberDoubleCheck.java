package practice;

public class MemberDoubleCheck {
	
	public static void main(String[] args) {
		
		MemberBean mb1 = new MemberBean();
		MemberBean mb2 = new MemberBean();
		
		mb1.setName("angele");
		mb2.setName("angele");
		
		if(mb1.equals(mb2)) {
			System.out.println("�ߺ��� ���̵� �Դϴ�");
		}else {
			System.out.println("��� ���� ���̵� �Դϴ�.");
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


	@Override // ���� Ŭ���� Ÿ���� ���� ���� �ٸ� �� ��ü�� �ν��Ͻ� ������ ���� ��ġ�ϴ��� �ƴ��� ���ϴ� �޼���
	public boolean equals(Object obj) {
		if(!(obj instanceof MemberBean)) return false;
			MemberBean mb = (MemberBean)obj;
			return mb.id == this.id;
	}
	
	
	
}

