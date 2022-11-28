import java.util.Scanner;

public class Assignment6_Q1 {
	
	public static void division(int number1, int number2) { 
		if(number1 == 0 || number2 == 0) { 
			throw new ArithmeticException("Exception: numbers should not be zero");
		}
		else {
		    double result = (double) number1 / number2;  
		    System.out.println("Division: " + result);
		}
	}
	
	public static void multiply(int number1, int number2) {
		if(number1 == 0 || number2 == 0) { 
			throw new ArithmeticException("Exception: numbers should not be zero");
		}
		else {
			int result = number1 * number2; 
		    System.out.println("Multiplication: " + result);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
		int number1 = scan.nextInt();

        System.out.print("Enter second number: ");
		int number2 = scan.nextInt();

        System.out.println("");
		
		try {
			division(number1, number2);   			
			multiply(number1, number2);
		}
		catch(ArithmeticException e) { 
			System.out.println(e);
		}
	}
}