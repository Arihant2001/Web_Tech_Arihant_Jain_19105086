import java.util.ArrayList;

public class Assignment3_Q5 {
    static int dp[][];

	static ArrayList<ArrayList<String> > arrs =	new ArrayList<ArrayList<String> >();
	
	static void printAllChanges(String string1, String string2, ArrayList<String> changes){
		int i = string1.length();
		int j = string2.length();
		while(true){
			if(i==0 || j==0){
				arrs.add(changes);
				break;
			}
			if(string1.charAt(i-1)==string2.charAt(j-1)){
				i--;
				j--;
			}
			else{
				boolean if1 = false, if2 = false;
				if(dp[i][j]==dp[i-1][j-1] + 1){
					changes.add("Change " + string1.charAt(i-1) + " to " + string2.charAt(j-1));
					i--;
					j--;
					if1 = true;
				}
				if(dp[i][j]==dp[i-1][j] + 1){
					if(if1==false){
						changes.add("Delete " + string1.charAt(i-1));
						i--;
					}
					else{
						ArrayList<String> changestring2 = new ArrayList<String>();
						changestring2.addAll(changes);
						changestring2.remove(changes.size() - 1);
						changestring2.add("Delete " + string1.charAt(i));
						printAllChanges(string1.substring(0, i), string2.substring(0, j+1), changestring2);
					}
					if2 = true;
				}
				if(dp[i][j]==dp[i][j-1] + 1){
					if(if1==false && if2==false) {
						changes.add("Add " + string2.charAt(j-1));
						j--;
					}
					else{
						ArrayList<String> changestring2 = new ArrayList<String>();
						changestring2.addAll(changes);
						changestring2.remove(changes.size() - 1);
						changestring2.add("Add " + string2.charAt(j));
						printAllChanges(string1.substring(0, i+1), string2.substring(0, j), changestring2);
					}
				}
			}
		}
	}

	static void editDP(String string1, String string2){
		int temp1 = string1.length();
		int temp2 = string2.length();
		int[][] DP = new int[temp1+1][temp2+1];
		for(int i = 0; i <= temp1; i++){
			DP[i][0] = i;
        }
		for(int j = 0; j <= temp2; j++){
			DP[0][j] = j;
        }
		for(int i = 1; i <= temp1; i++){
			for(int j = 1; j <= temp2; j++){
				if(string1.charAt(i-1)==string2.charAt(j-1)){
					DP[i][j] = DP[i-1][j-1];
                }
				else{
					DP[i][j] = min(DP[i-1][j-1], DP[i-1][j], DP[i][j-1]) + 1;
				}
			}
		}
		dp = DP;
	}
	static int min(int a, int b, int c){
		int z = Math.min(a, b);
		return Math.min(z, c);
	}
	static void printWays(String string1, String string2,	ArrayList<String> changes){
		printAllChanges(string1, string2, new ArrayList<String>());
		int i = 1;
		for(ArrayList<String> ar : arrs){
			System.out.println("\nMethod " + i++ + " : \n");
			for(String s:ar){
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args){
		String string1 = "abcdef";
		String string2 = "axcdfdh";
		editDP(string1, string2);
		printWays(string1, string2, new ArrayList<String>());
	}
}