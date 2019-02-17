package collections;

import java.util.HashSet;

public class Example4 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>(); 
        hashSet.add("Geeks"); 
        hashSet.add("for"); 
        hashSet.add("Geeks"); 
        hashSet.add("GeeksforGeeks"); 
  
        System.out.println(hashSet); 

	}
	
	/* A HashSet is a set and as a set doesn’t contain any duplicate element therefore, 
	 * the string ‘Geeks’ appears only once in the output. 
	 * */

}
