public class Factorial {
    public static void main( String[] args ){
        int number = 5;
        long factorial = 1;

        for (int i=5;i<=number;i++){
            factorial *=i;
        }

        System.out.println(number+" Factorial value is :"+factorial);
    }
}
