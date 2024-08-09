public class ExceptionExmpl {

    public static void main ( String [] args ){

        try {
            int data = 100/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);

        }
        finally {
            System.out.println(" rest of the code prints ");
        }
        System.out.println(" rest of the code j prints ");


    }
}
