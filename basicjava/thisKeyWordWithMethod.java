package basicjava;

public class thisKeyWordWithMethod {
    static int a=1;
    void show1(){
        System.out.println("Show1 method="+ a);
        this.show2();
    }
    void show2(){
        System.out.println("Show2 method="+ ++a);
        this.show3();
    }
    void show3(){
        System.out.println("Show3 method="+ ++a);
        this.show4();
    }
    void show4(){
        System.out.println("Show4 method="+ ++a);
       method();
    }
    static void method(){
        System.out.println("static method="+ ++a);
    }
    public static void main(String[] args) {
        thisKeyWordWithMethod obj=new thisKeyWordWithMethod();
        obj.show1();
    }
}
