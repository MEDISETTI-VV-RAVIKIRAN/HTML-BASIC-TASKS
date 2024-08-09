public class ReverseString {

    public static void main( String[] args ){

        String origianl = " MANTHA TECH SOLUTIONS ";
        String reversed = new StringBuilder(origianl).reverse().toString();

        System.out.println(" The Reversed output of string is "+reversed );
    }
}
