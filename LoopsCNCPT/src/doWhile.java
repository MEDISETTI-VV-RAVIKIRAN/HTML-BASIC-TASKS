import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Hello, please enter your Btech Percentage :  ");

       int i = scanner.nextInt();

       do {

             System.out.println("That's Great You are Eligible ");
         }
         while ( i>=70);

         System.err.println( " Sorry your are not Eligible");




    }
}
