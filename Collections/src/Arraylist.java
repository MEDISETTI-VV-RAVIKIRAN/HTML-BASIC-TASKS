import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args ){
        ArrayList< Integer>  list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.remove(2);


        for (int number : list){

            System.out.println(list);
        }
    }
}
