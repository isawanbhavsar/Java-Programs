/*Write a program to print the area of a rectangle by creating a class
named 'Area' having two methods. First method named as 'setDim' takes
length and breadth of rectangle as parameters and the second method
named as 'getArea' returns the area of the rectangle. Length and breadth
of rectangle are entered through keyboard.*/

import java.util.Scanner;
public class Area {
	private double length;
	private double breadth;
	public void setDim(double l, double b) {
	length = l;
	breadth = b;
	}
	public double getArea() {
	return length * breadth;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Area rectangle = new Area();
	System.out.print("Enter the length of the rectangle: ");
	double l = sc.nextDouble();
	System.out.print("Enter the breadth of the rectangle: ");
	double b = sc.nextDouble();
	rectangle.setDim(l, b);
	System.out.println("Area of the rectangle is: " + rectangle.getArea());
	}
}
