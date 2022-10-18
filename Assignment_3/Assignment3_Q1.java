public class Assignment3_Q1 {
    public static void main(String args[]){
        String first_string = "alexa";
		String second_string = "siri";
		int i = 0, j = 0;
		int length1 = first_string.length(), length2 = second_string.length();
		while(i!=length1 && j!=length2){
			if((int)first_string.charAt(i)==(int)second_string.charAt(j)){
				i++;
				j++;
			}
			else if((int)first_string.charAt(i) < (int)second_string.charAt(j)){
				System.out.println("Lexicographically smaller string: " + first_string);
				return;
			}
			else{
				System.out.println("Lexicographically smaller string: " + second_string);
				return;
			}
		}
		if(i==length1){
			System.out.println("Lexicographically smaller string: " + first_string);
		}
		if(j==length2){
			System.out.println("Lexicographically smaller string: " + second_string);
		}
	}
}