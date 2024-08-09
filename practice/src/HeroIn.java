public class HeroIn extends BikeIn {

   @Override
   public   void speed() {
        int speed=300;
        float cc=350;
        System.out.println(" Hero bike the speed is :"+speed);
    }

    public static   void services( ) {
        int s=25000;

        System.out.println(" services charges conditions " +s);
    }
    public static void main ( String[] args) {
        HeroIn h = new HeroIn();
        h.speed();
        services();
        price();
    }
}
