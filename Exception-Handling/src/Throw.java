  public class Throw {

    public  static  void valid(int age ){

        if (age<18){
            throw new ArithmeticException(" you are not eligible to vote ");

        }
        else {
            System.out.println(" yes you are eligible to vote ");
        }


    }
}
