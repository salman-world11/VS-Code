import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //enter your name and surname

        System.out.print("Enter your name and surname:-  ");
        String write=scan.nextLine();
        System.out.println(write);

        //enter your emailid

        System.out.print("Enter your emailid:-  ");
        String emailid=scan.nextLine();
        System.out.println(emailid);

        //enter your address

        System.out.print("Enter your address:-  ");
        String address=scan.nextLine();
        System.out.println(address);

        // enter your pin code

        System.out.print("Enter your pin code:-   ");
        String pin=scan.nextLine();
        System.out.println(pin);

        //enter your college name

        System.out.print("Enter your college name:-  ");
        String college_name=scan.nextLine();
        System.out.println(college_name);


    }
}
