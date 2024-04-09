package basicjava;

public class StaticBlock {
    static int a=10;
     int b=20;
     void display(){
         System.out.println("i am a non-static display method");
     }
     static void add(){
         System.out.println("i am a static add method");
     }
    static {
        System.out.println("i am a static block");
        System.out.println(a);
        add();
       // System.out.println(b);//static block only access the static data variables and methods
       // display();
    }
    public static void main(String[] args) {

         StaticBlock StaticBlock=new StaticBlock();
    }
}
