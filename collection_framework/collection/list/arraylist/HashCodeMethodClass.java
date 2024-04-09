package collection_framework.collection.list.arraylist;

import java.util.ArrayList;

public class HashCodeMethodClass {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("java");
        al.add("edso");
        al.add("practice");
        al.add("class");
        ArrayList<Integer> al2=new ArrayList<Integer>();
        al2.add(100);
        al2.add(200);
        al2.add(300);
        al2.add(400);
        al2.add(500);
        ArrayList<Integer> al3=new ArrayList<Integer>();
        al3.add(100);
        al3.add(200);
        al3.add(300);
        al3.add(400);
        al3.add(500);
        System.out.println(al.hashCode());
        System.out.println(al2.hashCode());
        System.out.println(al3.hashCode());

    }
}
