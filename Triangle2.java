/*Write a program to print the area and perimeter of a triangle having
sides of 3, 4 and 5 units by creating a class named 'Triangle' with
constructor having the three sides as its parameters.*/

public class Triangle2{

	private int side1,side2,side3;

	public Triangle2(int side1, int side2, int side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	public double getPerimeter()
	{
		return (double) side1 + side2 + side3;
	}

	public double getArea()
	{
		double s = getPerimeter() /2;
		return Math.sqrt(s * ( s - side1 ) * ( s - side2 ) * ( s - side3 ) );
	}

	public static void main(String [] args)
	{
		Triangle2 t2 = new Triangle2(3, 4, 5);
		System.out.println("Perimeter of triangle : "+t2.getPerimeter());
		System.out.println("Area of triangle : "+t2.getArea());
		System.out.println("\n");
	}
}