package com;

import java.util.HashSet;
import java.util.Set;

public class Question7_Set {
	
	public int setprogram()
	{	    
		
	
	        Set<Integer> set = new HashSet<Integer>();
			set.add(1);set.add(1);set.add(1);set.add(1);set.add(1);set.add(1);set.add(1);set.add(1);set.add(1);set.add(1);
			// adding 10 duplicate elements in the set is done above
			set.add(2);
			set.add(3);
			set.add(4);
			set.add(5);
			set.add(6);
			set.add(7);
			set.add(8);
			set.add(9);
			set.add(10);
		

	Integer[] elements = new Integer[set.size()];
		        
		        // Convert HashSet to Array
     elements = set.toArray(elements);
		  
		        // Get the last element with the help of the index.
		        int lastEle = elements[elements.length - 1];
		        
		    System.out.println("Last element of Set is: "+ lastEle);
		          
			return lastEle;
	}


}
