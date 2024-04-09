package basicjava;


public class IntanceVeriable {

    int a=100;
    int b=200;
    void display(){
        System.out.println("I am display method a="+a);
    }
    void show(){
        System.out.println("I am show method b="+b);
    }
    public static void main(String[] args) {

        IntanceVeriable IntanceVeriable=new IntanceVeriable();
        System.out.println("addition of a and b="+(IntanceVeriable.a+IntanceVeriable.b));
        IntanceVeriable.display();
        IntanceVeriable.show();


    }

}
