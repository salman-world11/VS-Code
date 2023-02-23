import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /// there are three input in scanner class

        System.out.print("Enter the x number--");
        int x=sc.nextInt();
        System.out.print("Enter the y number--");
        int y=sc.nextInt();
        System.out.print   ("Enter the z number--");
        int z=sc.nextInt();

        // addition all number
        System.out.print("total number--");
        int add=x+y+z;
        System.out.println(add);

        // subtraction any two number

        System.out.print("Subtrct two number");
        int sub=x-z;
        System.out.println(sub);

        // multiplication all number
        System.out.print("Multiplication all number");
        int mult=y*z;
        System.out.println(mult);

        // division any two number

        System.out.print("Division two number");
        int div=x/z;
        System.out.println(div);

        // post increment x number

        int postin=x++;

        int prein=++y;
        int postde=z--;
        int prede=--z;
        System.out.println("print Increment number");
        System.out.println(postin);
        System.out.println(prein);
        System.out.println("print Decrement number");
        System.out.println(postde);
        System.out.println(prede);

    
        

    }
}