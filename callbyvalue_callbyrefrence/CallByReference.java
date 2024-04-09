package callbyvalue_callbyrefrence;

public class CallByReference {
    int b=200;
    void view(CallByReference Reference ){
      Reference.b++;
        Reference.b=Reference.b+300;

    }
    public static void main(String[] args) {
        CallByReference obj=new CallByReference();
        System.out.println("before change the value a="+obj.b);
        obj.view(obj);
        System.out.println("after change the value "+obj.b);
    }
}
