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
		
	// �������� set�� ���� ����Ű�� �ִ� ��ü�� TreeSet������, ��������Ÿ���� Set�̱⿡ TreeSet���� �ٿ�ĳ���� ����� �Ѵ�.
	// (���� �˻��� �� �ִ� �޼���� TreeSetŬ������ ���ǵǾ� �ִ�.)
		TreeSet set2 = (TreeSet)set;
		System.out.println("50���� ���� ��(50 ���� X) : "+set2.headSet(new Integer(50)));
		System.out.println("50���� ū ��(50 ����) : "+set2.tailSet(50));
		System.out.println("40�� 80 ������ ��(80 ����X) : "+set2.subSet(40, 80));
		
	}

}
