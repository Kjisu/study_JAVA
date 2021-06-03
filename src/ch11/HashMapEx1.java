package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		
	// 키-값 쌍으로 저장하기 위해 HashMap(=class) 객체 생성
		HashMap map = new HashMap();
	// 값 저장
		map.put("myId", "1234");
		map.put("asdf", "11111");
		map.put("asdf", "1234"); // 키 값이 같은 경우, 마지막 값으로 저장됨을 유의.
		
	// 입력된 아이디를 통해 HashMap에서 검색하여 얻은 비밀번호와 입력받은 비밀번호를 비교하기
	// 화면으로부터 라인단위로 입력 받는다.
		Scanner s = new Scanner(System.in);
	// 일치할 때까지 무한 반복, 일치하면 반복문은 중단된다
		while(true) {
			System.out.println("id와 Password를 입력해 주세요.");
			System.out.println("id >> ");
			String id = s.nextLine().trim(); // 공백 제거(사용자가 실수로 공백 넣었다고 해서 비밀번호가 틀려버리면 안되니까)
			System.out.println("pwd >> ");
			String pwd = s.nextLine().trim();
			
			// HashMap 객체에 저장되어 있는 데이터와 입력받은 데이터 비교(검색)
			if(map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("id와 pwd가 일치합니다.");
					break;
				}else{
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}// if문 끝
			
			
		}// while 문 끝
		
		
		
	}

}
