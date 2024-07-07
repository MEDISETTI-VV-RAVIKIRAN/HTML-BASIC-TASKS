import java.util.*;


public class Maprctc {

     public static void main(String[] args) {


        // List<String> list = new ArrayList<>();

         // 1 : creation of Map = by keys,values

         Map<Integer,String> m = new Hashtable();

          // 2: Addition of elements into MAp = "put"
         // put= add

         m.put(533449,"chebrolu");
         m.put(533445,"vizag");
         m.put(533446,"raymndry");

         System.out.println(m);

          // 3:retrival of "keys" from data by  =  "set, for, m.keyset"

         Set<Integer> keys = m.keySet();

         for ( Integer key:keys){

             System.out.println(key);

             // 3.1 : Retrival of "values"from the map by = "collections , for , m.values "

             Collection< String> values =  m.values();

             for ( String value:values){

                 System.out.println(value);

                 // 4: Deletion of elements from map by using = " m.remove"

                 m.remove(533449);

                 System.out.println(m);

                 // 5: Verfication is done by using = "m.contains"

                 System.out.println(m.containsKey( 533446));

                 // 6: If we want to add data with check just use = " putIfabsent"

                 m.putIfAbsent( 533450 , "kakinada");

                 System.out.println(m);

                 // 7: If we want to replace the data by = "m.replace"

                 m.replace(533449, "gollaprolu");

                 System.out.println(m);

                 // 8 : If we want to clear the date by = "m.clear"

                 m.clear();

                 System.out.println(m);


             }
         }
    }
}
