package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) { // 학생 이름, 점수 출력받기
		
		HashMap map = new HashMap();	
		
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(95));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		// entry 객체 set 주머니에 저장시키기
		// 왜 set 객체에 저장 ? => map은 collection 클래스를 상속 하지 않아서 iterator() 메서드를 사용할 수 없기 때문.
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey() +", 점수 : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
			
		}
		
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+(float)total/set.size());
		System.out.println("최고점수 : "+Collections.max(values));
		System.out.println("최저점수 : "+Collections.min(values));
	}
	
	

}
