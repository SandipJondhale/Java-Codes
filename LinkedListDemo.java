package collectiontest;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// Creating Linked List
		
		List<String> list = new LinkedList<String>();
		
		list.add("Ram");
		list.add("Sham");
		list.add("Sunil");
		list.add("Anil");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
