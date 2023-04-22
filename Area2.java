/*Write a program to print the area of a rectangle by creating a class
named 'Area' taking the values of its length and breadth as parameters of
its constructor and having a method named 'returnArea' which returns the
area of the rectangle. Length and breadth of rectangle are entered through
keyboard.*/

import java.io.*;

public class Area2 
 	{
		int length,breadth;

	public Area2(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public int returnArea()
	{
		return length * breadth;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter length of the rectangle: ");
		int length = Integer.parseInt(br.readLine());
		System.out.print("Enter breadth of the rectangle: ");
		int breadth = Integer.parseInt(br.readLine());
		Area2 rectangle = new Area2(length, breadth);
		int area = rectangle.returnArea();
		System.out.println("Area of the rectangle : "+ area);
	}
}