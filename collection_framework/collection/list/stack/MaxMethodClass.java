package collection_framework.collection.list.stack;

import java.util.*;

public class MaxMethodClass {
    public static void main(String[] args) {
      Stack<Integer> stack=new Stack<>();
         stack.add(100);
         stack.add(200);
         stack.add(300);
         stack.add(400);
         stack.add(500);

          Integer max1=Collections.max(stack);
          System.out.println(max1);

           System.out.println(Collections.max(stack));



    }
}
