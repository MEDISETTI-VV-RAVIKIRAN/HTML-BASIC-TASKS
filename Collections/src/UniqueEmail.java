import java.util.HashSet;

public class UniqueEmail {

    public static void main(String[] args){

        String[] emails = {
                "ravi@gmail.com","main@gmail.com","sai@gmail.com"
        };

        HashSet<String> uniqueEmail= new HashSet<>();

        for (String email:emails){

            uniqueEmail.add(email);
        }
        System.out.println("the unique emialId created "+uniqueEmail


        );
    }
}
