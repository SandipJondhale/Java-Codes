package collectiontest;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapDemo {

	public static void main(String[] args) {
		// Creating HashMap 
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		System.out.println("Enter the Name you wish to added:");
		Scanner sc = new Scanner(System.in);
		String sl = sc.next();
		
		map.put(1, sl);
		map.put(2, "Onkar");
		map.put(3, "kushal");
		map.put(4, "Arun");
		
		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" " +m.getValue());
		}

	}

}
