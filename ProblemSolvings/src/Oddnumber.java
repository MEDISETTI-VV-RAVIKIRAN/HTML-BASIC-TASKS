import java.util.Scanner;

public class Oddnumber
{

    public static void main(String []args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println(" please enter the number");
                int number = sc.nextInt();
//                if (number%2==0){
//                    System.out.println("  the number is even");
//                }
//                else {
//                    System.out.println("  the number is odd");
//                }
        System.out.println("  the number is even");
                for (int i=1;i<=number;i++)
                {
                    if (i % 2 != 0)
                    {


                        System.out.println(i);
                    }
//                    else
//                    {
//                        System.out.println("  the number is odd");
//                    }



                }







    }
}
