package finalkeyword;

public  class FinalKeyWordDemo {
    final int a;
    FinalKeyWordDemo(){
        a=20;
    }

    final void show(int a){
        System.out.println("FinalKeyWordDemo class final method "+a);
    }

    public static void main(String[] args) {
        FinalKeyWordDemo  FinalKeyWordDemo=new FinalKeyWordDemo();
        System.out.println(FinalKeyWordDemo.a);
        FinalKeyWordDemo.show(10);

    }

}
