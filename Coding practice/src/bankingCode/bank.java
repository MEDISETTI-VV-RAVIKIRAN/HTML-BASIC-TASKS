package bankingCode;

public class bank
{

    static int currentAccountBalance = 1000;

    public static void greetcustmer  (String[] args) {

        System.out.println("welcome to the banking");

    }
    public static void deposit(int amount) {
         currentAccountBalance = currentAccountBalance + amount;
        System.out.println("your deposit is successfull");

    }
    public static void withdrawl(int amount) {
        currentAccountBalance=currentAccountBalance - amount;
        System.out.println("your withdrawl is successfull");

    }
    public  int getCurrentBalance() {
        return currentAccountBalance;


    }

    public static void main(String[] args) {

        //greetcustmer();
       // System.out.println("current Account Balance is :"+getCurrentBalance());
      //  deposit();
      //  System.out.println("current Account Balance is :"+getCurrentBalance());
//withdrawl();
       // System.out.println("current Account Balance is :");


    }
}

