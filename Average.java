/*Print the average of three numbers entered by user by creating a class
named 'Average' having a method to calculate and print the average*/
import java.util.Scanner;
public class Average{

	public void getAverage(float num1 , float num2 , float num3)
	{
		float avg = (num1 + num2 + num3) / 3;
		System.out.printf("Average of given three numbers : %.2f",avg);
	}

	public static void main (String [] args)
	{
		System.out.print("Enter first number : ");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();

		System.out.print("Enter Second numnber : ");
		float num2 = sc.nextFloat();

		System.out.print("Enter Third numnber : ");
		float num3 = sc.nextFloat();

		Average avg = new Average();
		avg.getAverage(num1,num2,num3);

	}


}