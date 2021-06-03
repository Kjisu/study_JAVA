package practice;

import java.util.Date;

public class SmartPhoneExample {
	public static void main(String[] args) {
		Date date = new Date();
		SmartPhone sp = new SmartPhone("구글", "안드로이드");
		System.out.println(date);
		System.out.println(sp.toString());
		System.out.println(sp);
		
	}
}


class SmartPhone{
	
	private String company;
	private String os;
	
	SmartPhone(String company,String os){
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}

	
	
	
	
}
