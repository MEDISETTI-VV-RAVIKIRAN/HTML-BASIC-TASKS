import java.util.Scanner;

public class Prtcs {

    public static void main(String [] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter the number");
         int number = sc.nextInt();

         boolean isprime=true;
         if (number<=1){

             isprime=false;
         }
         else {
             for (int i=2;i<=Math.sqrt(number);i++){
                 if (number % i==0) {
                     isprime = false;
                 }
             }
             if(isprime){
                 System.out.println(number+"the number is prime");
             }
             else {
                 System.out.println(number+"the number is  not prime");

             }
         }
    }

}