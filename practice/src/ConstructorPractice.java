public class ConstructorPractice {

   public  int i ;

    public static void main ( String [] args) {

        ConstructorPractice cp = new ConstructorPractice(63);
         System.out.println(cp.i);

        }
    public ConstructorPractice() {
        i=30;

    }
    public ConstructorPractice( int a ) {
        i=a;
    }
}
