import java.util.*;
public class primenum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" please enter the number :");

        int number = sc.nextInt();


         boolean isprime = true ;

         if (number <= 1) {
                isprime=false;
            }

         else {

             for (int i = 2; i <= Math.sqrt(number); i++) {

                 if (number % i== 0){
                 isprime=false;
                 break;
             }
         }
if (isprime){
    System.out.println(number+" is a prime nunber ");
}
else {
    System.out.println(number+" is not  a prime nunber ");
}
        }
    }
}
