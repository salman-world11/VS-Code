package Strings;
import java.util.*;
class guesser
{
    int guessNum;

    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number");
        guessNum= scan.nextInt();
        return guessNum;

    }
}

class Player
{
    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
       void collecnumFromPlayers()
       {
           Guesser g=new Guesser();
           numFromGuesser=g.guessingNumber();
       }

}




public class game {
    public static void main(String[] args) {
        System.out.println();
    }
}
