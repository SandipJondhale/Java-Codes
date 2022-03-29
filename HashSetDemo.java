package collectiontest;

import java.util.Iterator;
import java.util.*;
public class HashSetDemo{

	public static void main(String[] args) {
		// Creating HashSet and adding Elements
			
		HashSet<String> set=new HashSet();

			set.add("Sandip");
			set.add ("Onkar");
			set.add("kushal");
			set.add("Shubham");
			set.add("Arun");
			Iterator<String> i=set.iterator();		
		
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

	}

}
