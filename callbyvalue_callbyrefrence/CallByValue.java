package callbyvalue_callbyrefrence;

public class CallByValue {
   int a=100;
    void show(int a){
       ++a;
       System.out.println("inside the show method a="+a);
    }

    public static void main(String[] args) {
        CallByValue CallByValue=new CallByValue();

        System.out.println("before change the value a="+CallByValue.a);
        CallByValue.show(200);
        System.out.println("after change the value "+CallByValue.a);


    }
}
