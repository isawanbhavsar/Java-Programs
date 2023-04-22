/*Print the sum, difference and product of two complex numbers by
creating a class named 'Complex' with separate methods for each
operation whose real and imaginary parts are entered by user*/

import java.util.Scanner;
public class Complex {
		private double real;
		private double imaginary;

	public Complex(double real, double imaginary) {
			this.real = real;
			this.imaginary = imaginary;
		}

	public void add(Complex c) {
			this.real += c.real;
			this.imaginary += c.imaginary;
		}

	public void subtract(Complex c) {
			this.real -= c.real;
			this.imaginary -= c.imaginary;
		}

	public void multiply(Complex c) {
			double tempReal = this.real * c.real - this.imaginary * c.imaginary;
			double tempImaginary = this.real * c.imaginary + this.imaginary * c.real;
			this.real = tempReal;
			this.imaginary = tempImaginary;
		}

	public void display() {
			System.out.println("Complex Number: " + this.real + " + " + this.imaginary + "i");
		}

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the real part of the first complex number : ");
			double real1 = scanner.nextDouble();
			System.out.print("Enter the imaginary part of the first complex number : ");
			double imaginary1 = scanner.nextDouble();
			System.out.print("Enter the real part of the second complex number : ");
			double real2 = scanner.nextDouble();
			System.out.print("Enter the imaginary part of the second complex number : ");
			double imaginary2 = scanner.nextDouble();
			Complex cpx1 = new Complex(real1, imaginary1);
			Complex cpx2 = new Complex(real2, imaginary2);
			cpx1.add(cpx2);
			cpx1.display();
			cpx1 = new Complex(real1, imaginary1);
			cpx2 = new Complex(real2, imaginary2);
			cpx1.subtract(cpx2);
			cpx1.display();
			cpx1 = new Complex(real1, imaginary1);
			cpx2 = new Complex(real2, imaginary2);
			cpx1.multiply(cpx2);
			cpx1.display();
		}	
}