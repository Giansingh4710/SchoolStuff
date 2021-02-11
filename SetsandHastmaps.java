package basics;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class SetsandHastmaps {

	public static void main(String[] args) {
		// Sets
		Set<Integer> set=new HashSet<Integer>();//instead of HastSet, you can use TreeSet. TreeSet just has the set in ordered fashion
		for (int i=0;i<10;i++) {
			set.add(i);
		}
		System.out.println(set);
		set.add(0);//won't do anything because set already has 0
		System.out.println(set);
		set.size();//tells you the size
		boolean cont= set.contains(0);
		System.out.println(cont);
		//ArrayLists
		ArrayList<Integer> lst= new ArrayList<Integer>();
		lst.add(1);//with arraylist, you can index unlike in hastsets.
		System.out.println(lst.get(0));//put index and give you num at that index
		lst.add(65);
		lst.add(1);
		for (int i=0;i<10;i++) {
			lst.add(i);
		}
		lst.set(1,5);//the first parameter is the index. the set func takes the num in the second parameter and sets it at that index
		System.out.println(lst);
		System.out.println(lst.subList(1,4));// sublist is like slices, you put from what indexes you want
		
		
		//Maps and Hashmaps/Dictionarys
		Map m = new HashMap();
		System.out.println("HashMaps\n\n\n");
		m.put("Gian",18);
		m.put("Komal","23");
		m.put("Satjiwan",27);
		System.out.println(m);
		System.out.println(m.containsKey("Gian"));
		System.out.println(m.containsValue(27));
		System.out.println(m.get("Komal"));
	}

}
