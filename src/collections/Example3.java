package collections;

import java.util.LinkedList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<>(); 
        list1.add("Geeks"); 
        list1.add("for"); 
        list1.add("Geeks"); 
        list1.add("GFG"); 
        list1.add("GeeksforGeeks"); 
        System.out.println("list1 -> " + list1);
  
        List<String> list2 = new LinkedList<>(); 
        list2.add("Geeks"); 
        System.out.println("list2 -> " + list2);
  
        list1.removeAll(list2); 
        System.out.println("list1 after removeAll list2 elements -> " + list1);
        
        for (String temp : list1) 
            System.out.printf(temp + " "); 
  
        System.out.println(); 
	}
	
	/* list1.removeAll(list2) function deletes all the occurance of string in list2 from list1. 
	 * Here, the string ‘Geeks’ appears in list2, 
	 * so all the nodes of linked list in list1 that contains ‘Geeks’ as its data is removed from list1.
	 *  */

}
