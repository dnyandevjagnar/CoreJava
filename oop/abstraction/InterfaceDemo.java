package oop.abstraction;

public interface InterfaceDemo  {

    void show3();
    private void view(){
        System.out.println("interfaceDemo private view method ");
    }
    default void defaultMethod(){
        view();
        System.out.println("interfaceDemo default view method call the private method ");
    }
}
