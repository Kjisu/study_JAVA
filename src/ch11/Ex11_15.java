package ch11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_15 {
	
	public static void main(String[] args) {
		
		Set set = new TreeSet();
		
		int[] score = {80,95,50,35,45,65,10,100};
		
		for(int i=0;i<score.length;i++) {
			set.add(score[i]);
		}
		
	// 참조변수 set이 실제 가리키고 있는 객체는 TreeSet이지만, 참조변수타입이 Set이기에 TreeSet으로 다운캐스팅 해줘야 한다.
	// (범위 검색할 수 있는 메서드는 TreeSet클래스에 정의되어 있다.)
		TreeSet set2 = (TreeSet)set;
		System.out.println("50보다 작은 값(50 포함 X) : "+set2.headSet(new Integer(50)));
		System.out.println("50보다 큰 값(50 포함) : "+set2.tailSet(50));
		System.out.println("40과 80 사이의 값(80 포함X) : "+set2.subSet(40, 80));
		
	}

}
