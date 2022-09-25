public class Assignment2_Q1 {
    public static void main(String args[]){
        double score = 86.00000000000001d;
        System.out.println("Score before operation = " + score);
        if(score > 80 && score < 90){      // this statement will increase the score if it is between 80 and 90 (both excluded)
            score += 5;
        }
        System.out.println("Score after operation = " + score);
    }
}