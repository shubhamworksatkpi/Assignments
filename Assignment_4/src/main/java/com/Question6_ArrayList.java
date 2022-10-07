package com;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

public class Question6_ArrayList {
	

	    public static void main(String[] args)
	    {

	        ArrayList<String> arr1 = new ArrayList<String>();
	        ArrayList<String> arr2 = new ArrayList<String>();
	        ArrayList<String> arr3 = new ArrayList<String>();
	        ArrayList<String> arr4 = new ArrayList<String>();
	        ArrayList<String> arr5 = new ArrayList<String>();
	        //String newline = System.lineSeparator();
	        
	        

	        arr1.add("Shubham Khule");
	        arr1.add("arraylist1string2");
	        arr1.add("arraylist1string3");
	        arr1.add("arraylist1string4");
	        arr1.add("arraylist1string5");
	        
	        arr2.add("arraylist2string1");
	        arr2.add("Shubham Khule");
	        arr2.add("arraylist2string3");
	        arr2.add("arraylist2string4");
	        arr2.add("arraylist2string5");
	        arr2.add("arraylist2string6 /n");
	      
	        
	        arr3.add("arraylist3string1");
	        arr3.add("arraylist3string2");
	        arr3.add("Shubham Khule");
	        arr3.add("arraylist3string4");
	        arr3.add("arraylist3string5");
	        arr3.add("arraylist3string6");
	        arr3.add("arraylist3string7");

	        
	        arr4.add("arraylist4string1");
	        arr4.add("arraylist4string2");
	        arr4.add("arraylist4string3");
	        arr4.add("Shubham Khule");
	        arr4.add("arraylist4string5");
	        arr4.add("arraylist4string6");
	        arr4.add("arraylist4string7");
	        arr4.add("arraylist4string8");

	        
	        arr5.add("arraylist5string1");
	        arr5.add("arraylist5string2");
	        arr5.add("arraylist5string3");
	        arr5.add("arraylist5string4");
	        arr5.add("Shubham Khule");
	        arr5.add("arraylist5string6");
	        arr5.add("arraylist5string7");
	        arr5.add("arraylist5string8");
	        arr5.add("arraylist5string9");
	
	        System.out.println(arr1);
	        System.lineSeparator();
	        System.out.println(arr2);
	        System.lineSeparator();
	        System.out.println(arr3);
	        System.lineSeparator();
	        System.out.println(arr4);
	        System.lineSeparator();
	        System.out.println(arr5);
	        

     ArrayList retain = arr1.stream().
     					filter(arr2::contains).
     					filter(arr3::contains).
     					filter(arr4::contains).
     					filter(arr5::contains).
     					collect(Collectors.toCollection(ArrayList::new));
     
     System.out.print(retain);
     System.lineSeparator();
     int position = retain.indexOf("Shubham Khule");
     System.lineSeparator();
     System.out.println("the position of the common element is:"+position);
     
	   
	    }

}
