import java.util.Scanner;
import java.util.*;

class Employee{
    String name, address;
	int joining_year;
	public Employee(int x, String y, String z)
	{
		joining_year = x;
		name = y;
		address = z;
	}
}

public class Assignment4_Q2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of organization:");
		int employee_number = scan.nextInt();
        String name, address;
		int joining_year;
		Employee info[] = new Employee[employee_number];
		for(int i=0; i < employee_number; i++)
		{
			System.out.println("Enter name:");
			name = scan.next();
			System.out.println("Enter year of joining:");
			joining_year = scan.nextInt();
			System.out.println("Enter address:");
			address = scan.next();
			Employee new_employee = new Employee(joining_year, name, address);
			info[i] = new_employee;
			System.out.println();
		}
		System.out.println("Name        Year of joining        Address");
		for (Employee x:info)
		{
			System.out.println(x.name + "        " + x.joining_year + "           " + x.address);
		}
    }
}