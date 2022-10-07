package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Question7_SetTest {
	

	@Test
	public void evaluatesExpression()
	{
		
		Question7_Set setobject = new Question7_Set();
		int b = setobject.setprogram();
		assertEquals(10,b);

}
}

