package collectiontest;

import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String str= "hi";
		list.add("string");
		list.add(str);
		list.add(str+str);
		for(String sl : list)
			System.out.println(sl + " ");
		    System.out.println(list.size());
		    System.out.println(list.contains("string"));
		    System.out.println(list.contains("hihi"));
		 list.remove("hi");
		 System.out.println(list.size());
		 list.add("hi");
		 list.add(str);
		 System.out.println(list.size());
		 for(String index : list)
			 System.out.println(index + " ");
		}
	}


