package collections;

import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		TreeSet<Integer> treeSet1 = new TreeSet<>();
		  
        treeSet.add("Geeks"); 
        treeSet.add("for"); 
        treeSet.add("Geeks"); 
        treeSet.add("GeeksforGeeks"); 
        
        treeSet1.add(50); 
        treeSet1.add(5); 
        treeSet1.add(150); 
        treeSet1.add(75);
        treeSet1.add(50);
        
        System.out.println(treeSet);
        System.out.println(treeSet1);
        
        for (String temp : treeSet) 
            System.out.printf(temp + " "); 

	}
	
	/* A TreeSet sorts the data in ascending order that is inserted in it. 
	 * Therefore, the output string contains all the strings arranged in ascending order. 
	 * A TreeSet does not contain any duplicate element as it is a set. 
	 * So in the output, there is just a single occurance of string ‘Geeks’. 
	 * */

}
