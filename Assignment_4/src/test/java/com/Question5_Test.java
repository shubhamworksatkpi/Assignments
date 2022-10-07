package com;

import org.junit.Test;
import static org.junit.Assert.assertEquals; 

public class Question5_Test {
	
	@Test
	public void tryout()
	{
		Question5_Main kathakali=new Question5_Main("Joker1","Kathakali");
		Question5_Main bhangda=new Question5_Main("Joker5","Bhangda");
		assertEquals("Kathakali",kathakali.dance);
		assertEquals("Bhangda",bhangda.dance);
		
		
	}

}
