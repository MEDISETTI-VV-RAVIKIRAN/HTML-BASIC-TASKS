import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Enumerationprtc {

    public static void main(String[] args) {

        // Enumeration - Interface
        // Introduced for iterating the legacy collection objects
        // Legacy classes - 1.0 version
        // HASHTABLE , STACK,VECTOR , DICTIONARY
        // New classes - 1.2 v

        Vector<Integer> v = new Vector<>();

        v.add(3);
        v.add(6);
        v.add(9);
        v.add(12);
        v.add(15);
        v.remove(2);

        Enumeration<Integer> e = v.elements();

         // Methods used are = hasMoreElements() , nextElements()

        while (e.hasMoreElements()){

            System.out.println(e.nextElement());


        }


    }
}
