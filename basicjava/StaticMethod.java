package basicjava;
public class StaticMethod {
    static int a=100;
    int b=200;
    static void show(){
        System.out.println("i am a static show method");
        System.out.println(a);
        //System.out.println(b);//static method access the only static data
    }

    public static void main(String[] args) {
       StaticMethod.show();
    }
}
