public class Array2 {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            System.out.println("sum  of values is :" + sum);

        }
    }
}
