import java.util.Scanner;

public class Assignment1_Q4 {
    public static void main(String args[]){
        int firstNumber = 10, secondNumber = 20;

        // using temporary variable
        // System.out.println("\n");
        System.out.println("\nUsing temporary variable:\n");

        System.out.println("Before Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber + "\n");

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);

        System.out.println("\n-----------------------------------------\n");

        // without using temporary variable

        firstNumber = 30;
        secondNumber = 40;

        System.out.println("WITHOUT using temporary variable:\n");

        System.out.println("Before Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber + "\n");
        
        firstNumber = firstNumber + secondNumber;      // add both the numbers and assign it to first
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("After Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);
    }
}