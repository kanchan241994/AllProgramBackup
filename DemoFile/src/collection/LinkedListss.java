package collection;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListss {
    
	public static void main(String[]args) {
		LinkedList<String> link =new LinkedList<String>(); 
		
		link.add("Mango");
		link.add("Orange");
		link.add("Chikoo");
		link.add("Apple");
		link.add("Mango");
		
		Iterator loop=link.iterator();
		
		while(loop.hasNext()) {
		System.out.println(loop.next());
	}

}
}
