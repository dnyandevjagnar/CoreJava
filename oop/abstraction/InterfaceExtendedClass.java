package oop.abstraction;

public class InterfaceExtendedClass implements InterfaceDemo ,Interface2{
      public void show1(){
          System.out.println("Interface1 override show method");
      }
      public void show2(){
       System.out.println("Interface2 override show method");
       }
    public void show3(){
        System.out.println("InterfaceDemo override show method");
    }
    public static void main(String[] args) {
        InterfaceExtendedClass InterfaceExtendedClass=new InterfaceExtendedClass();
        InterfaceExtendedClass.show1();
        InterfaceExtendedClass.show2();
        InterfaceExtendedClass.show3();
        Interface2.display();
        InterfaceExtendedClass.defaultMethod();//private method call in default method through
    }
}
