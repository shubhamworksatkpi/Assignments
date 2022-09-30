// 1. Create 2 functional interfaces by 2 different ways.

//2nd way

package assignment3;

public class Question1_FunctionalInterface2 {
	
	public static void main(String args[])
	
	{
		
// Runnable is one of the examples of functional interface
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("this is a functional interface");
			}
			
		}).start();;
	}}

