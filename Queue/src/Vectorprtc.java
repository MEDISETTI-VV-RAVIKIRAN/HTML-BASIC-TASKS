import java.util.Vector;

public class Vectorprtc {

    public static void main(String[] args) {



        Vector<Integer> V1 = new Vector<>();

        V1.add(12);
        V1.add(14);
        V1.add(0,16);

        System.out.println(V1);
        System.out.println(V1.size());
        System.out.println(V1.capacity());




    }
}
