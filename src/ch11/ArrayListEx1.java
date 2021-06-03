package ch11;

import java.util.*;


public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
	// 기본 길이(용량,capacity)가 10인 arrayList객체 생성
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(0));
		list1.add(2); // 오토 박싱 되기에 이렇게 적어도 된다
		list1.add(new Integer(10));
		list1.add(new Integer(15));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
	// list1, list2에 들어있는 객체들을 순서대로 정렬하기
		Collections.sort(list1);
		Collections.sort(list2);
		
	// list1배열에 있는 객체들이 list2 배열에 있는 객체를 포함하고 있는지 확인하고 싶을 때
		System.out.println("list1.containsAll(list2) = "+list1.containsAll(list2));
		
	// list2객체 배열에 B문자 객체 넣기
		list2.add("B"); // 맨 뒤부터 저장된다
		list2.add("C"); // B 다음 칸에 저장된다
		
	// 인덱스 3번자리에 A객체 넣기
		list2.add(3, "A"); // 이렇게 중간에 끼워넣는 건 부담가는 작업이다
		
		print(list1,list2);
		
	// 인덱스 3에 있던 객체를 "AA"로 바꿈 (기존에 있던 객체는 없어지고)
		list2.set(3, "AA");
	
	// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제하기
		System.out.println("list1.retainAll(list2) ="+list1.retainAll(list2));
		
		print(list1,list2);
		
	// list2에서 list1에 포함된 객체들을 삭제한다
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		print(list1,list2);

	} // main()
	
	static void print(List list1, List list2) {
		
		System.out.println("[list1] : "+list1);
		System.out.println("[list2] : "+list2);
		System.out.println();
		
	}

}
