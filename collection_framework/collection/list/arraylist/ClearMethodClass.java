package collection_framework.collection.list.arraylist;

import java.util.ArrayList;

public class ClearMethodClass {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("java");
        al.add("edso");
        al.add("practice");
        al.add("class");
        al.add(null);
        al.add(66);
        al.add("null");

        System.out.println("before using the clear method arraylist are empty = "+al.isEmpty());
        al.clear();
        System.out.println("after using the cleear method arraylist are empty="+al.isEmpty());


    }
}
