package assignment2;

public class Question2_Main {
	
	public static void main(String args[])
    {
		Question2_Animal animal = new Question2_Horse();
		Question2_Mammal mammal = new Question2_Human();
  
        animal = mammal;
        System.out.println("interface named Animal and derived relationships with classes implemented successfully");
    }
}


