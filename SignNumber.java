
import java.util.Scanner;
public class SignNumber {

	public static void main(String [] args)
	{
		System.out.print("Input number :");
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		
		if(num<0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is positive");
	}
}
