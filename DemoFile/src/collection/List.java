package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
	
	public static void main(String[]args) {
		ArrayList<String> list =new ArrayList<String>(); 
		
		list.add("Mango");
		list.add("Orange");
		list.add("Chikoo");
		list.add("Apple");
		list.add("Mango");
		
		Iterator loop=list.iterator();
		
		while(loop.hasNext()) {
		System.out.println(loop.next());
	}

}
}