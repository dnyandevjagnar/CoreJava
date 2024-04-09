package oop.abstraction;

public abstract class AbstractDemoClass {

    private int b;
    AbstractDemoClass(int a){
        System.out.println(" parameterize constructor in abstract class a="+a);
    }
    AbstractDemoClass(int c,int d){
        this.b=200;
        System.out.println(" abstract class  non-parameterize constructor "+(b+c+d));
    }

    abstract void abstractMethod();

    void show(){
        System.out.println("non abstract method in abstract class");
        privateMethod();
    }
     static  void staticMethod(){
        System.out.println("static method in abstract class");
    }
     final void finalMethod(){
         System.out.println("final in abstract class");
     }
    private  void privateMethod() {
         System.out.println("private in abstract class");
     }

}
