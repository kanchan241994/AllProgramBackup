package collection;

import java.util.Iterator;
import java.util.Vector;

public class Vectorrr {
	public static void main(String[]args) {
		Vector<String> vec =new Vector<String>(); 
		
		vec.add("Mango");
		vec.add("Orange");
		vec.add("Chikoo");
		vec.add("Apple");
		vec.add("Mango");
		
		Iterator loop=vec.iterator();
		
		while(loop.hasNext()) {
		System.out.println(loop.next());
	}

}

}
