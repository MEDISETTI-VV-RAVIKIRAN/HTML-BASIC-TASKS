public class IciciBank extends Overridding {

    int bankIntrestRates(){
        return 9 ;
    }

    public static void main( String[] args ){
        IciciBank c = new  IciciBank();
        c.bankIntrestRates();
        System.out.println("the rate of interest at Icici bank is :"+c.bankIntrestRates());
    }
}
