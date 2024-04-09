package oop.abstraction;

public class AbstractDemoImplemented extends AbstractDemoClass {
    AbstractDemoImplemented(int a){
        super(a);
    }
    AbstractDemoImplemented(int a,int b){
        super(a,b);

    }

    @Override
    void abstractMethod(){
        System.out.println(" abstract class override  abstractMethod method");
    }

    public static void main(String[] args) {
        AbstractDemoImplemented AbstractDemoImplemented=new AbstractDemoImplemented(10);
        AbstractDemoImplemented AbstractDemoImplemented1=new AbstractDemoImplemented(10,20);
        AbstractDemoImplemented.abstractMethod();
        AbstractDemoImplemented.show();
        AbstractDemoClass.staticMethod();
        AbstractDemoImplemented.finalMethod();


    }
}
