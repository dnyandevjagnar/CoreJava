package collection_framework.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableClass {
    public static void main(String[] args) {
        Hashtable hashtable=new Hashtable();
        hashtable.put(1,100);
        hashtable.put(2,200);
        hashtable.put(3,300);
        hashtable.put(4,400);
        hashtable.put(5,500);


        System.out.println(hashtable);

        for(Object map: hashtable.entrySet()){
           System.out.println(map);
                   }
    }
}
