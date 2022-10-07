package com;

import org.junit.Test;
import static org.junit.Assert.assertEquals; 

public class Question5_Test {
	
	@Test
	public void tryout()
	{
		Question5_Main j=new Question5_Main("Joker1","kathakli");
		Question5_Main j1=new Question5_Main("Joker5","Bhangda");
		assertEquals("kathakli",j.dance);
		assertEquals("Bhangda",j1.dance);
		
		
	}

}
