package assignment;

public abstract class Question2_AbsEncaps {
	
	String color;

	abstract double area();
	public abstract String toString();
	
	
	


	public Question2_AbsEncaps(String color)
	{
		//System.out.println("Shape constructor called");
		this.color = color;
	}

	
	public String getColor()
	{
		return color;
	}
	
	
	
	}


	

	


  