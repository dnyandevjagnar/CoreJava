package collection_framework.collection.list.vector;

import java.util.Stack;
import java.util.Vector;

public class VectorDemoClass {
    public static void main(String[] args) {
        Vector<Integer> vector1=new Vector<>();
        Vector<Integer> vector2=new Vector<>();
        vector1.add(100);
        vector1.add(200);
        vector1.add(300);
        vector1.add(400);
        vector2.add(500);
        vector2.add(600);
        vector2.add(700);
        vector2.add(800);
        vector2.add(900);
        vector2.add(1000);
        System.out.println(vector1);
        System.out.println("removing index one element ="+vector1.remove(1));
        System.out.println(vector1);

        System.out.println("100 is a contains of vector1 ="+vector1.contains(100));
        System.out.println("hashcode of vector1  ="+vector1.hashCode());
        System.out.println("vector are empty ="+vector1.isEmpty());
        System.out.println("add all vector1 into vector2 ="+vector1.addAll(vector2));
        System.out.println(vector1);

    }
}
