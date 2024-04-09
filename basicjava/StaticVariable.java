package basicjava;

public class StaticVariable {
    static int st=100;
    static int st1=200;
    void display(){
        System.out.println("I am display method "+st);
    }
    void show(){
        System.out.println("I am show method "+st1);
    }
    int add(){
        return st+st1;
    }
    public static void main(String[] args) {
        System.out.println("I am main method "+st);
        StaticVariable StaticVariable=new StaticVariable();
        StaticVariable.display();
        StaticVariable.show();
      int a= StaticVariable.add();
      System.out.println("addition of "+ st+" and "+st1 +"="+a);




    }
}
