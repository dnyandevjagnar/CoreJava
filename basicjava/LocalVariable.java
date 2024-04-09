package basicjava;

public class LocalVariable {
    void display(){
        int  a=10;//local variable its access only display method
       System.out.println("i am a display method a="+a);

    }
    void show(){
        int a=20;//local variable its access only show method
        System.out.println("i am a show method a="+a);
    }
    public static void main(String[] args) {
        LocalVariable LocalVariable=new LocalVariable();
       LocalVariable.display();
      LocalVariable.show();
      //  StaticVariable Static=new   StaticVariable();
       System.out.println( StaticVariable.st);
        IntanceVeriable intancevariable=new IntanceVeriable();
        System.out.println(intancevariable.a );



    }
}
