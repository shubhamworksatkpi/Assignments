package assignment;

public class Question3_Rectangle extends Question3_Encaps{

	double length;
	double width;

	public Question3_Rectangle(String color,
					double length,
					double width)
	{


		super(color);
		System.out.println("Here, we have called the Rectangle constructor ");
		this.length = length;
		this.width = width;
}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is "+ super.color+ "and area is : "+ area();
	}
}