import java.util.Scanner;

class Calculator {
    private int number1; 
    private int number2;

    public Calculator(int number1, int number2) { 
        this.number1 = number1;
        this.number2 = number2;
    }

 	public void addition() {  
 		int result = number1 + number2; 
		System.out.println("Addition : " + result);
	}
	
	public void subtraction() { 
		int result = number1 - number2;
		System.out.println("Subtraction: " + result);
	}

    public void multiply() {
		int result = number1 * number2; 
	    System.out.println("Multiplication : " + result);
	}
	
	public void division() {
		double result = (double) number1 / number2; 
		System.out.println("Division : " + result);
	}
}

public class Assignment6_Q3 {
    public static void main(String ar[]) {
        Scanner scan = new Scanner(System.in);
        int number1, number2;
        try {
            System.out.print("Enter first number: ");
            number1 = Integer.parseInt(scan.nextLine());

            System.out.print("Enter second number: ");
            number2 = Integer.parseInt(scan.nextLine());

            System.out.println("");
            
            Calculator obj1 = new Calculator(number1, number2); 
            obj1.addition(); 
            obj1.subtraction(); 
            obj1.multiply(); 
            obj1.division(); 
        }
        catch(NumberFormatException e) { 
            System.out.println("Wrong input entered! " + e);
        }
    }
}