/*Write a program that would print the information (name, year of
joining, salary, address) of three employees by creating a class named
'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C - WallsStreat
Sam 2000 68D-WallsStreat
John 1999 26B- WallsStreat*/

public class Employee {
	String name;
	int yearOfJoining, salary;
	String address;

	public Employee(String name, int yearOfJoining, int salary, String address) {
			this.name = name;
			this.yearOfJoining = yearOfJoining;
			this.salary = salary;
			this.address = address;
		}

public void columns() {
			System.out.println(name + " " + yearOfJoining + " " + address);
		}

public static void main(String[] args) {
			Employee e1 = new Employee("Robert", 1994, 50000, "64C - Wall Street");
			Employee e2 = new Employee("Sam", 2000, 35000, "68D - Wall Street");
			Employee e3 = new Employee("John", 1999, 45000, "26B - Wall Streat");
			System.out.println("\nName Year of joining Address");
			e1.columns();
			e2.columns();
			e3.columns();
	}
}