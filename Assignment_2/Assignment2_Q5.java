public class Assignment2_Q5 {
    public static void main(String args[]){
		int n = 5, temp;
		System.out.println("n n^2 n^3 n^4");
		for(int i=1; i <= n; i++){
			temp = i;
			for(int j=0; j < 4; j++){
				System.out.print(temp + "  ");
				temp *= i;
			}
			System.out.println(" ");
		}
	}
}