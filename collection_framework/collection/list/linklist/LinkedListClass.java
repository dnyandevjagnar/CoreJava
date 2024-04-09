package collection_framework.collection.list.linklist;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.pop();
        linkedList.push(600);

        for(Object ll:linkedList){
            System.out.println(ll);
        }
        System.out.println(linkedList.hashCode());
    }
}
