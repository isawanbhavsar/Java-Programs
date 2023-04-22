/*Write a program to print the area and perimeter of a triangle having
sides of 3, 4 and 5 units by creating a class named 'Triangle' without any
parameter in its constructor.*/

public class Triangle {

	private int side1,side2,side3;

	public Triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}

	public Double getPerimeter() {
		return (double) side1 + side2 + side3 ;
	}

	public double getArea() {
	double s = getPerimeter() / 2;
	return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public static void main(String[] args) {
	Triangle t = new Triangle();
	double perimeter = t.getPerimeter();
	double area = t.getArea();
	System.out.println("\nPerimeter of traingle: " + perimeter);
	System.out.println("Area of triangle: " + area);
	System.out.println("\n");
	}
}
