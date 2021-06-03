package ch11;

import java.util.*;


public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
	// �⺻ ����(�뷮,capacity)�� 10�� arrayList��ü ����
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(0));
		list1.add(2); // ���� �ڽ� �Ǳ⿡ �̷��� ��� �ȴ�
		list1.add(new Integer(10));
		list1.add(new Integer(15));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
	// list1, list2�� ����ִ� ��ü���� ������� �����ϱ�
		Collections.sort(list1);
		Collections.sort(list2);
		
	// list1�迭�� �ִ� ��ü���� list2 �迭�� �ִ� ��ü�� �����ϰ� �ִ��� Ȯ���ϰ� ���� ��
		System.out.println("list1.containsAll(list2) = "+list1.containsAll(list2));
		
	// list2��ü �迭�� B���� ��ü �ֱ�
		list2.add("B"); // �� �ں��� ����ȴ�
		list2.add("C"); // B ���� ĭ�� ����ȴ�
		
	// �ε��� 3���ڸ��� A��ü �ֱ�
		list2.add(3, "A"); // �̷��� �߰��� �����ִ� �� �δ㰡�� �۾��̴�
		
		print(list1,list2);
		
	// �ε��� 3�� �ִ� ��ü�� "AA"�� �ٲ� (������ �ִ� ��ü�� ��������)
		list2.set(3, "AA");
	
	// list1���� list2�� ��ġ�� �κи� ����� �������� �����ϱ�
		System.out.println("list1.retainAll(list2) ="+list1.retainAll(list2));
		
		print(list1,list2);
		
	// list2���� list1�� ���Ե� ��ü���� �����Ѵ�
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
