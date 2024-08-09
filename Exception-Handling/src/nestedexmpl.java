public class nestedexmpl {

    public static void main (String []args){

        try {

            try {
                int arr[] = new int[9];
                arr[10] = 6;
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println(e);
            }


            catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
        finally {
            System.out.println(" file moved to next data ");
        }
        System.out.println(" file moved to data ");
    }
}
