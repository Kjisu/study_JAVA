package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {

	public static void main(String[] args) {
		
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
	// HashSet�� objArr�� ��ҵ��� �����Ѵ�
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]);
		}
		
	// HashSet�� ����� ��ҵ��� ����Ѵ�
		System.out.println(set); // [1,1,2,3,4] : �Ȱ��� ���� �ߺ� ������� �ʴ´�. 
		
	// HashSet�� ����� ��ҵ� ��� (Iterator �̿�)
		Iterator it = set.iterator();
		
		if(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
