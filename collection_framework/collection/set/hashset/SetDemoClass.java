package collection_framework.collection.set.hashset;

import java.util.*;

public class SetDemoClass {
    public static void main(String[] args) {
        Set hashSet=new HashSet();
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        hashSet.add(400);
        hashSet.add(500);
        hashSet.add(100);
        System.out.println(hashSet);//don't be follow index or insertion order


    }
}
