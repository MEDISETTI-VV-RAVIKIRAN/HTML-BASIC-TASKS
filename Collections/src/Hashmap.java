import java.security.Key;
import java.util.HashMap;

public class Hashmap {
     public static void main( String[] args){
         HashMap<String,Integer> map=new HashMap<>();
          map.put("ravi",25);
         map.put("mani",35);
         map.put("nagu",35);

         for (  String key :map.keySet() ){
             System.out.println(key+":"+map.get(key));

         }


     }
}
