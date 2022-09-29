package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author AbhishekYadav
 *
 */
public class TestCollection1 {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList();
		//list.add("a");
		//list.add("b");
		//list2.add(11);
		//System.out.println(list.get(0));
		//System.out.println(list2);
		for(int i=0; i<list.size(); i++) {
			if (list.get(i)== "b") 
				System.out.println(i);
		}
		for(int j=0; j<10; j++) {
			list2.add(j);
			
		}
		//System.out.println(list2);
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		list3.add("b");
		list3.add("c");
		list3.add("c");
		list3.add("c");
		list3.add("d");
		list3.add("d");
		list3.add("d");
		list3.add("d");
		//ystem.out.println(list3);
		/*
		 * String arr[]= {"a","b","c","d"}; 
		 * for (int i=0;i<4;i++) { for(int
		 * j=0;j<=i;j++) { list3.add(arr[i]); } }
		 */
		Set<String> set1 = new HashSet<String>();
		set1.add("a");
		set1.add("a");
		set1.add("b");
		//System.out.println(set1);
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("a", 200);
		hm.get("a");
		hm.get("b");
		hm.get("c");
		System.out.println(hm);
	}
	
	

}
