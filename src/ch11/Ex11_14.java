package ch11;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_14 {

	
	public static void main(String[] args) {
		
		Set set = new TreeSet();
		
		String[] words = {"apple","alien","bat","car","Car","dance","DamCe","egg","eraser"};
		
		for(int i=0;i<words.length;i++) {
			set.add(words[i]);
		}
		
		System.out.println(set instanceof TreeSet);
		
		String from = "b";
		String to = "d";
		
		System.out.println(set);
		System.out.println("range Search : from "+from+" to "+to );
		System.out.println("result1 : "+((TreeSet) set).subSet("b","e")); // b로 시작해서 e로 시작하는 것 사이의 데이터 출력(범위 검색 ->TreeSet)
		System.out.println("result1 : "+((TreeSet) set).subSet(from, "dzzz")); // d포함해서 출력하고 싶다면(범위 검색 -> TreeSet)

	}
}
