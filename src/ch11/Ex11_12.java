package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A : "+setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B : "+setB);
		
	// ������(���1) : setA.retainAll(setB); => ����� ��Ҹ� ����� ����
	// ������(���1) : setA.addAll(setB); => setB�� ��� ��Ҹ� �߰� (�ߺ��Ǵ°� ����)
	// ������(���1) : setA.removeAll(setB); => setB�� ����Ǵ� ��� ��� ����
		
	// ������(���2)
		Iterator i = setB.iterator();
		while(i.hasNext()) {
			Object tmp = i.next();
			if(setA.contains(tmp)) {
				setKyo.add(tmp);
			}
		}
		
	// ������(���2)
		i = setA.iterator();
		while(i.hasNext()) {
			Object tmp = i.next();
			if(!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		}
		
	// ������(���2)
		i = setA.iterator();
		while(i.hasNext()) {
			setHab.add(i.next());
		}
		
		i = setB.iterator();
		while(i.hasNext()) {
			setHab.add(i.next());
		}
		
	// ���
		System.out.println("A��B = "+setHab);
		System.out.println("A��B = "+setKyo);
		System.out.println("A-B = "+setCha);

	}
}
