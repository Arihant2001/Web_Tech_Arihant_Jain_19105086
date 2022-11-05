import java.util.Scanner;
import java.util.*;

public class Assignment4_Q1 {
    public static void main(String args[]){
        Scanner scan_var = new Scanner(System.in);
	    System.out.println("Enter the initial size of the vector:");
	    int vector_size = scan_var.nextInt(),adding;                    // defining size of vector
	    String input;
		Vector<String> temp = new Vector<String>(vector_size);          // defining the vector
		System.out.println("Want to add an element in the vector? y or n");
		input = scan_var.next();
		while(input.equals("y") )
		{
			System.out.println("Enter a number:");
			adding = scan_var.nextInt();
			temp.addElement(String.valueOf(adding));
			System.out.println("Want to add an element in the vector? y or n");
			input = scan_var.next();
		}
		System.out.print("Elements of the Vector: ");
		for (String x:temp)
		{
			System.out.print(x + " ");
		}
	}
}