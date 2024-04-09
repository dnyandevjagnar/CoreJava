package collection_framework.collection.list.stack;

import java.util.Collections;
import java.util.Stack;

import static java.util.Collections.*;

public class RemoveMethodClass {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        System.out.println(stack);
        System.out.println("index 3 element are remove, element="+stack.remove(3));
        System.out.println(stack);
        System.out.println(stack);
        System.out.println("removeAll method, element="+stack.removeAll(stack));
        System.out.println(stack);
    }
}
