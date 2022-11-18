import java.util.Scanner;

class Marks{
	public String name;
	public int roll_no;
	public int marks;
}

class Physics extends Marks{
	Physics(int m,String namee,int roll){
	    marks = m;
	    roll_no = roll;
	    name = namee;
	}
}

class Mathematics extends Marks{
	Mathematics(int m,String namee, int roll){
	    marks = m;
	    roll_no = roll;
	    name = namee;
	}
}
class Chemistry extends Marks{
	Chemistry(int m,String namee,int roll){
	    marks = m;
	    roll_no = roll;
	    name = namee;
	}
}

class Assignment5_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            int roll_no;
            System.out.println("Enter name: ");
            String name = sc.next();
            roll_no=i;
            int marks;
            System.out.print("Enter marks in Physics: ");
            marks = sc.nextInt();
	        Physics P = new Physics(marks,name,roll_no);
            System.out.print("Enter marks in Mathematics: ");
            marks = sc.nextInt();
	        Mathematics M = new Mathematics(marks,name,roll_no);
            System.out.print("Enter marks in Chemistry: ");
	        marks = sc.nextInt();
	        Chemistry C = new Chemistry(marks,name,roll_no);
        	System.out.println("Total marks: ");
	        System.out.println((P.marks+C.marks+M.marks));
        	System.out.println("Average marks: ");
	        System.out.println(((P.marks+C.marks+M.marks)/3.000));
        }
    }
}

// OUTPUT will be:

// 1
// Enter name:
// Arihant
// Enter marks in Physics: 25
// Enter marks in Mathematics: 50
// Enter marks in Chemistry: 75
// Total marks:
// 150
// Average marks:
// 50.0