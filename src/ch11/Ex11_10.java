package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		
	// ������ ���� Set �÷��� �����
		Set set = new HashSet();
		
	// set�� ũŰ�� 6���� ���� ���� 1~45������ ������ ����
		for(int i = 0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			//set.add(new Integer(num));
			set.add(num);
		}
		
   // Set�� ����� ��ü �����͵��� LinkedList ���屸���� �ű��
   // set�� ������ �� ���� ������ (���� ���� ���ϴ� Ư��) set�� ��ü �����͵��� �����ϰ� �ʹٸ� 
   // 1. set�� ��� ��ҵ��� list�� ����
   // 2. list.sort() �� ����
   // 3. list ���(��� Ȯ��)
		  List list = new LinkedList(set);
		  	System.out.println(list); 
		  Collections.sort(list);
		  	System.out.println(list);
	}

}
