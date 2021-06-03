package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) { // �л� �̸�, ���� ��¹ޱ�
		
		HashMap map = new HashMap();	
		
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(95));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		
		// entry ��ü set �ָӴϿ� �����Ű��
		// �� set ��ü�� ���� ? => map�� collection Ŭ������ ��� ���� �ʾƼ� iterator() �޼��带 ����� �� ���� ����.
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry)it.next();
			System.out.println("�̸� : "+e.getKey() +", ���� : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� : "+set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
			
		}
		
		System.out.println("���� : "+ total);
		System.out.println("��� : "+(float)total/set.size());
		System.out.println("�ְ����� : "+Collections.max(values));
		System.out.println("�������� : "+Collections.min(values));
	}
	
	

}
