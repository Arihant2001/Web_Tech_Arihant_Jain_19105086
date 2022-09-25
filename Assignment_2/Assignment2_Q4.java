public class Assignment2_Q4 {
    public static void main(String args[]){
		int Old_Population = 80000, New_Population = 80000, Year_Count = 0;
		System.out.println("Old population: " + Old_Population);

		while(New_Population <= 150000){
			New_Population += (New_Population * 5) / 100;
			Year_Count++;
		}

		System.out.println("Year count when population exceeds 15000: " + Year_Count);
		System.out.println("New population: " + New_Population);
	}
}