package com;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;  

public class Question1_EmployeeInterfaceTest {
	
		
		@Test
		public void evaluatesExpression()
		{
			Question2_ImplementationClass1 object1 = new Question2_ImplementationClass1();
			Question2_ImplementationClass1 object2 = new Question2_ImplementationClass1();
			
			Question2_ImplementationClass2 object3 = new Question2_ImplementationClass2();
			Question2_ImplementationClass2 object4 = new Question2_ImplementationClass2();
			
			Question2_ImplementationClass3 object5 = new Question2_ImplementationClass3();
			Question2_ImplementationClass3 object6 = new Question2_ImplementationClass3();
			
			Question2_ImplementationClass4 object7 = new Question2_ImplementationClass4();
			Question2_ImplementationClass4 object8 = new Question2_ImplementationClass4();
			
			Question2_ImplementationClass5 object9 = new Question2_ImplementationClass5();
			Question2_ImplementationClass5 object10 = new Question2_ImplementationClass5();
			
			Question2_ImplementationClass6 object11 = new Question2_ImplementationClass6();
			Question2_ImplementationClass6 object12 = new Question2_ImplementationClass6();
			
			Question2_ImplementationClass7 object13 = new Question2_ImplementationClass7();
			Question2_ImplementationClass7 object14 = new Question2_ImplementationClass7();
			
			Question2_ImplementationClass8 object15 = new Question2_ImplementationClass8();
			Question2_ImplementationClass8 object16 = new Question2_ImplementationClass8();
		
			
			int m1=object1.interfacemethod1();
			int m2=object2.interfacemethod2();
			
			int m3=object3.interfacemethod1();
			int m4=object4.interfacemethod2();
			
			int m5=object5.interfacemethod1();
			int m6=object6.interfacemethod2();
			
			int m7=object7.interfacemethod1();
			int m8=object8.interfacemethod2();
			
			int m9=object9.interfacemethod1();
			int m10=object10.interfacemethod2();
			
			int m11=object11.interfacemethod1();
			int m12=object12.interfacemethod2();
			
			int m13=object13.interfacemethod1();
			int m14=object14.interfacemethod2();
			
			int m15=object15.interfacemethod1();
			int m16=object16.interfacemethod2();
			
			assertEquals(0,m1);
			assertEquals(0,m2);
			assertEquals(0,m3);
			assertEquals(0,m4);
			assertEquals(0,m5);
			assertEquals(0,m6);
			assertEquals(0,m7);
			assertEquals(0,m8);
			assertEquals(0,m9);
			assertEquals(0,m10);
			assertEquals(0,m11);
			assertEquals(0,m12);
			assertEquals(0,m13);
			assertEquals(0,m14);
			assertEquals(0,m15);
			assertEquals(0,m16);
	
	}

}
