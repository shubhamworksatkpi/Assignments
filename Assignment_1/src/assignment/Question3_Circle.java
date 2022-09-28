package assignment;

public class Question3_Circle extends Question2_AbsEncaps{

	double radius;

	public Question3_Circle(String color, double radius)
	{

	
		super(color);
		System.out.println("Here, we have called the Circle constructor ");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is "+ super.color+ "and area is : "+ area();
	}

	
}
