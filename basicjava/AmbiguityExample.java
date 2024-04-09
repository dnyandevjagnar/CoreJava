package basicjava;

import constructor.Test;

public class AmbiguityExample {
    int a,b;
    AmbiguityExample(int a,int b){
        this.a=a;
        this.b=b;
    }
    void show(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        AmbiguityExample  AmbiguityExample=new   AmbiguityExample(10,20);
        AmbiguityExample.show(30,40);
        AmbiguityExample.display();

    }
}
