public class Assignment3_Q2 {
    public static void main(String args[]){
        int size_of_array = 20;
		int frequency_array[] = new int[size_of_array];
		for(int i=0; i < size_of_array; i++){
			frequency_array[i] = 0;
		}
		int input_array[] = {7,1,2,3,2,1,7,6,5,6,8,3,4,5,6,3,6,7};
		System.out.print("Input array: { ");
		for(int i=0; i < input_array.length; i++){
			if(i==input_array.length - 1){
				System.out.print(input_array[i] + " }");
			}
			else{
				System.out.print(input_array[i]+", ");
			}
			frequency_array[input_array[i]]++;
		}
		int index = 0;
		for(int i=0; i < size_of_array; i++){
			while(frequency_array[i]!=0){
				input_array[index] = i;
				index++;
				frequency_array[i]--;
			}
		}
		System.out.print("\nSorted array: { ");
		for(int i=0;i < input_array.length; i++){
			if(i==input_array.length - 1){
				System.out.print(input_array[i] + " }");
			}
			else{
				System.out.print(input_array[i] + ", ");
			}
		}
    }
}