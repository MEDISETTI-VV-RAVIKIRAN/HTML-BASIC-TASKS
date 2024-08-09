public class Honda extends Bike{
    @Override
    void run() {
        System.out.println(" the Honda bike running sucessfully");

    }
    public static void main ( String[] args ){
        Bike b = new Honda() ;

        b.run();


    }
}
