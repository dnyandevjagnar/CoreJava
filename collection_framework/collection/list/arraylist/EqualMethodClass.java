package collection_framework.collection.list.arraylist;

import java.util.ArrayList;

public class EqualMethodClass {
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
        System.out.println(al.equals(al2));

    }
}
