package com;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;  

public class Question1_EmployeeAbstractTest {
	
	@Test
	public void evaluatesExpression()
	{
		Question2_ChildClass1 object1 = new Question2_ChildClass1();
		Question2_ChildClass1 object2 = new Question2_ChildClass1();
		
		Question2_ChildClass2 object3 = new Question2_ChildClass2();
		Question2_ChildClass2 object4 = new Question2_ChildClass2();
		
		Question2_ChildClass3 object5 = new Question2_ChildClass3();
		Question2_ChildClass3 object6 = new Question2_ChildClass3();
		
		Question2_ChildClass4 object7 = new Question2_ChildClass4();
		Question2_ChildClass4 object8 = new Question2_ChildClass4();
		
		Question2_ChildClass5 object9 = new Question2_ChildClass5();
		Question2_ChildClass5 object10 = new Question2_ChildClass5();
		
		Question2_ChildClass6 object11 = new Question2_ChildClass6();
		Question2_ChildClass6 object12 = new Question2_ChildClass6();
		
		Question2_ChildClass7 object13 = new Question2_ChildClass7();
		Question2_ChildClass7 object14 = new Question2_ChildClass7();
		
		Question2_ChildClass8 object15 = new Question2_ChildClass8();
		Question2_ChildClass8 object16 = new Question2_ChildClass8();
		
		Question2_ChildClass9 object17 = new Question2_ChildClass9();
		Question2_ChildClass9 object18 = new Question2_ChildClass9();
		
		Question2_ChildClass10 object19 = new Question2_ChildClass10();
		Question2_ChildClass10 object20 = new Question2_ChildClass10();
		
		int m1=object1.abstractmethod1();
		int m2=object2.abstractmethod2();
		
		int m3=object3.abstractmethod1();
		int m4=object4.abstractmethod2();
		
		int m5=object5.abstractmethod1();
		int m6=object6.abstractmethod2();
		
		int m7=object7.abstractmethod1();
		int m8=object8.abstractmethod2();
		
		int m9=object9.abstractmethod1();
		int m10=object10.abstractmethod2();
		
		int m11=object11.abstractmethod1();
		int m12=object12.abstractmethod2();
		
		int m13=object13.abstractmethod1();
		int m14=object14.abstractmethod2();
		
		int m15=object15.abstractmethod1();
		int m16=object16.abstractmethod2();
		
		int m17=object17.abstractmethod1();
		int m18=object18.abstractmethod2();
		
		int m19=object19.abstractmethod1();
		int m20=object20.abstractmethod2();
		
		assertEquals(1,m1);
		assertEquals(2,m2);
		assertEquals(1,m3);
		assertEquals(2,m4);
		assertEquals(1,m5);
		assertEquals(2,m6);
		assertEquals(1,m7);
		assertEquals(2,m8);
		assertEquals(1,m9);
		assertEquals(2,m10);
		assertEquals(1,m11);
		assertEquals(2,m12);
		assertEquals(1,m13);
		assertEquals(2,m14);
		assertEquals(1,m15);
		assertEquals(2,m16);
		assertEquals(1,m17);
		assertEquals(2,m18);
		assertEquals(0,m19);
		assertEquals(0,m20);
}
}