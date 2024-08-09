package Practice;

public class febnoci {

    public static void main(String[] args) {
        int n = 10;
        int next = 0;// Number of terms
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(first+ " " );
             next = first + second;
            first = second;
            second = next ;

        } }

}
















