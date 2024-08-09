public class testThrow {



        public  static  void valid(int age ){

            if (age<18){
                throw new ArithmeticException(" you are not eligible to vote ");

            }
            else {
                System.out.println(" yes you are eligible to vote ");
            }


        }
        public static void main( String[] args){
            valid(20);
            System.out.println(" next code continues ");
        }
    }

