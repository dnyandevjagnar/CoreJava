package collection_framework.collection.list.arraylist;

import java.util.ArrayList;

public class ContainsMethodClass {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("java");
        al.add("edso");
        al.add("practice");
        al.add("class");

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("java");

        ArrayList<String> al3=new ArrayList<String>();
        al2.add("java");
        al2.add("edso");
        al2.add("practice");
        al2.add("class");

        System.out.println(al.contains(al2));
        System.out.println(al.containsAll(al3));

    }
}
