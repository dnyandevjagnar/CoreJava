package collection_framework.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapClass {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"java");
        treeMap.put(2,"python");
        treeMap.put(3,"angular");
        treeMap.put(4,"C++");
        treeMap.put(5,"ruby");
        treeMap.put(6,"html");

        System.out.println(treeMap);

//        for(Map.Entry map: treeMap.entrySet()){
//            System.out.println(map);
//        }

    }
}
