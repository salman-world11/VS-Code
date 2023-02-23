import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        System.out.print("Enter your marks:-  ");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if (marks>99){
            System.out.println("Beta Aukaat me raho:-  ");
        } else if(marks>90){
            System.out.println("Pass with A+");
        } else if(marks>75){
            System.out.println("Pass with A");
        } else if (marks >65){
            System.out.println("Pass with B");
        } else if(marks>55){
            System.out.println("Pass with c");
        } else if (marks > 45){
            System.out.println("Pass with D bach gya beta");
        }else {
            System.out.println("Beta acche se padhoo");
        }
    

    
    }
}

