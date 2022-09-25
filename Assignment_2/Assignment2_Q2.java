public class Assignment2_Q2 {
    public static void main(String args[]){
        int firstNumber = 7, secondNumber = 15, thirdNumber = 11;
        System.out.println("Three numbers are: " + firstNumber + ", " + secondNumber + ", " + thirdNumber);
        System.out.print("Minimum of these numbers is: ");
        if(firstNumber > secondNumber){
            if(secondNumber > thirdNumber){
                System.out.println(thirdNumber);
            }
            else{
                System.out.println(secondNumber);
            }
        }
        else{
            if(firstNumber < thirdNumber){
                System.out.println(firstNumber);
            }
            else{
                System.out.println(thirdNumber);
            }
        }
    }
}