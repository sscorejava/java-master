package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>(); 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("GeeksforGeeks"); 
        System.out.println(list);
        
        // Iterator<Integer> iter = list.iterator(); // An iterator made for iterating over Integer cannot be used to iterate over String data type.
        Iterator<String> iter = list.iterator();
        
        while (iter.hasNext()) 
            System.out.printf(iter.next() + " "); 
  
        System.out.println(); 

	}

}
