import java.util.Scanner;

public class Assignment1_Q3 {
    public static void main(String args[]){
        int dividend = 25, divisor = 4;

        // Dividend = (Divisor * Quotient) + Remainder

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient when dividend is " + dividend + " and divisor is " + divisor + " = " + quotient);
        System.out.println("Remainder when dividend is " + dividend + " and divisor is " + divisor + " = " + remainder);
    }
}