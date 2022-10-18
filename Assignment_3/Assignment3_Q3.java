import java.util.Arrays;

public class Assignment3_Q3 {
    public static void main(String args[]){
        String input = new String("qwertyuiopasdfghjklzxcvbnm");
		System.out.print("Input string: " + input);
		char temp[] = input.toCharArray();
		Arrays.sort(temp);
		String input2 = new String(temp);
		System.out.print("\nSorted string: "+ input2);
    }
}