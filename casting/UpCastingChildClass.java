package casting;

public class UpCastingChildClass extends UpCastingParentClass {
    int a=200;
    @Override
    void view(){
       System.out.println("view override method");
    };

    public static void main(String[] args) {
        UpCastingChildClass UpCastingChildClass=new UpCastingChildClass();
        UpCastingChildClass.view();
        UpCastingParentClass UpCasting=new UpCastingChildClass();
        System.out.println( UpCasting.a);//call the instance variable of parent class throw the upcasting
        UpCasting.view();//call the  override method in child class throw the upcasting


    }
}
