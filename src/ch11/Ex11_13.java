package ch11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
		
	// 1~45까지 랜덤한 숫자 - set에 저장해서 출력하기
		
		Set set = new TreeSet();
		//Set set = new TreeSet(new TestComp());
		
		for(int i=0;set.size()<3;i++) {
			set.add(new Test());
		}
		System.out.println(set);
	}
}

class Test implements Comparable{

	@Override
	public int compareTo(Object o) {
		return 1;
	}
}

/*
 * class TestComp implements Comparator{
 * 
 * @Override public int compare(Object o1, Object o2) { return 1; }
 * 
 * }
 */
