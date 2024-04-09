package collection_framework.collection.list.stack;

import java.util.Stack;

public class PushPopOperationClass {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println("before pop operation : "+stack);
        System.out.println(stack.pop());//stack is represent the list in first out
        System.out.println("after pop operation : "+stack);
    }
}
