import java.util.Scanner;       // Import the Scanner class

public class Assignment3_Q4 {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
		int number = scnr.nextInt();
		System.out.println("Input number: " + number);
		System.out.print("Hailstone sequence: " + number + " ");
		while(number!=1){
			if(number % 2==0){
				number /= 2;
			}
			else{
				number = 3*number + 1;
			}
			System.out.print(number + " ");
		}
    }
}