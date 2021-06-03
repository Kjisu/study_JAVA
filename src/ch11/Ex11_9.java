package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {

	public static void main(String[] args) {
		
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
	// HashSet에 objArr의 요소들을 저장한다
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]);
		}
		
	// HashSet에 저장된 요소들을 출력한다
		System.out.println(set); // [1,1,2,3,4] : 똑같은 값은 중복 저장되지 않는다. 
		
	// HashSet에 저장된 요소들 출력 (Iterator 이용)
		Iterator it = set.iterator();
		
		if(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
