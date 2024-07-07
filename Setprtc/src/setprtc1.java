import java.util.HashSet;
import java.util.Set;

public class setprtc1 {

    public static void main(String[] args) {

       // Set<Integer> s = new HashSet<>();
// 1 : creation of Hashset like below

        HashSet<Integer> hs = new HashSet<>();

        // 2: To add the data = hs.add(); // ** this Hashset does'nt follows INSERTION ORDER **

        hs.add(3);
        hs.add(6);
        hs.add(9);
        System.out.println(hs);

        hs.add(12);
        hs.add(15);
        hs.add(18);
        System.out.println(hs);

// 3 : To remove data in Hashset we have to use = " hs.remove"

        hs.remove(6);
        hs.remove(9);
        System.out.println(hs);

 // 4: To retrival the data we have to use = 's' represents single key  and 'hs' represents all keys

        for ( Integer s:hs){

        System.out.println(s);
        // 5:
            System.out.println(hs);
}



    }
}
