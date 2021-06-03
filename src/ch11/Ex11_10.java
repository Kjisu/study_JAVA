package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		
	// 데이터 담을 Set 컬렉션 만들기
		Set set = new HashSet();
		
	// set의 크키가 6보다 작은 동안 1~45사이의 난수를 저장
		for(int i = 0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			//set.add(new Integer(num));
			set.add(num);
		}
		
   // Set에 저장된 객체 데이터들을 LinkedList 저장구조로 옮기기
   // set은 정렬할 수 없기 때문에 (순서 유지 안하는 특성) set의 객체 데이터들을 정렬하고 싶다면 
   // 1. set의 모든 요소들을 list에 저장
   // 2. list.sort() 로 정렬
   // 3. list 출력(결과 확인)
		  List list = new LinkedList(set);
		  	System.out.println(list); 
		  Collections.sort(list);
		  	System.out.println(list);
	}

}
