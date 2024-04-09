package collection_framework.collection.list.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("java");
        al.add("edso");
        al.add("practice");
        al.add("class");
        al.add(null);
        al.add(66);
        al.add("null");

        System.out.println(al.size());
        
        Iterator iterable=al.iterator(); //getting the iterator
                while( iterable.hasNext()){//printing the element using the for loop
            System.out.println(iterable.next());
        }
//
//        for(Object fruit:al){ //printing the element using the for loop
//            System.out.println(fruit);}

}
}
