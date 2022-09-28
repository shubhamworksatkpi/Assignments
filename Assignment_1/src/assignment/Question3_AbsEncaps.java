package assignment;

public abstract class Question3_AbsEncaps {
	
	String color;

	abstract double area();
	public abstract String toString();
	
	
	


	public Question3_AbsEncaps(String color)
	{
		//System.out.println("Shape constructor called");
		this.color = color;
	}

	
	public String getColor()
	{
		return color;
	}
	
	
	
	}


	

	


  