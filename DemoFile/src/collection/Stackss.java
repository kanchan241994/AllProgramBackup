package collection;

import java.util.Iterator;

import java.util.Stack;

public class Stackss {
	public static void main(String[]args) {
	 Stack<String> st =new Stack<String>(); 
		
		st.push("Mango");
		st.push("Orange");
		st.push("Chikoo");
		st.push("Apple");
		st.push("Mango");
		st.push("JackFruit");
		st.pop();
		Iterator loop=st.iterator();
		
		while(loop.hasNext()) {
		System.out.println(loop.next());
	}

}

}	