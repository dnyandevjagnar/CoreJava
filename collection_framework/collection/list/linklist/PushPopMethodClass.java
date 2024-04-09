package collection_framework.collection.list.linklist;

import java.util.LinkedList;

public class PushPopMethodClass {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.push(100);
        linkedList.push(200);
        linkedList.push(300);
        linkedList.push(400);
        linkedList.push(500);
        linkedList.push(null);

         for(Object ll:linkedList){
             System.out.print(ll+",");
                   }
            linkedList.pop();

            System.out.println( );
            for(Object ll:linkedList){
            System.out.print(ll+",");
             }
    }
}
