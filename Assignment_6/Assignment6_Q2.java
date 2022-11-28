import java.util.Scanner;

public class Assignment6_Q2 {
	
	public static void addition(int number1, int number2) {
		if(number1 < 0 || number2 < 0) {  
			throw new ArithmeticException("Exception: numbers should not be negative");
		}
		else {
			int result = number1 + number2;
			System.out.println("Addition: " + result);
		}
	}
	
	public static void subtraction(int number1, int number2) {
		if(number1 < 0 || number2 < 0) {  
			throw new ArithmeticException("Exception: numbers should not be negative");
		}
		else {
			int result = number1 - number2;  
			System.out.println("Subtraction: " + result);
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
			addition(number1, number2);
			subtraction(number1, number2);
		}
		catch(ArithmeticException e) { 
			System.out.println(e);
		}
	}
}