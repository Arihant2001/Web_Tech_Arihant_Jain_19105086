public class Assignment2_Q6 {
    public static void main(String args[]){
		int number = 3, count = 1;
		System.out.print("All multiples of 3 from 3 to 36 are: ");
		do{
			System.out.print(number * count + " ");
			count++;
		}
		while(count * number <= 36);
	}
}