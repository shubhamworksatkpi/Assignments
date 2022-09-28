package assignment;

public class Question2_Theory {
	
	/*
	 * 
* Can we create an object of an abstract class?
	 
	 We cannot create objects of an abstract class. 
	 To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass. 
	 A subclass must override all abstract methods of an abstract class. 
	 However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
	 
* Justify your answer with coding example
	 * 
	 * 
	package assignment;

abstract class Employee 
{
	public abstract void salary();
{
		
}

}

package assignment;

public class AbstractTest {
	
	public static void main(String[] args)
	{
	
		Employee emp = new Employee();  //throws an error as abstract class cannot be instantiated
		emp.salary(); 					//throws an error as abstract class cannot be instantiated

}
}
	 * 
*/
}
