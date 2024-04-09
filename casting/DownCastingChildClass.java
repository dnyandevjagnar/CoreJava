package casting;

public class DownCastingChildClass extends DownCastingParentClass{
    int a=100;
    @Override
    void show(){
        System.out.println(" child  class override show method");
    }
    void display(){
        System.out.println("child class display method");
    }
    public static void main(String[] args) {
        DownCastingParentClass UpCasting=new DownCastingChildClass();//Child c = (Child)p;
        System.out.println("parent class instance variable a="+UpCasting.a);//Its call the child class override method
        UpCasting.show();//Its call the instance  variable of parent class
        UpCasting.view();


        DownCastingChildClass DownCasting=(DownCastingChildClass)UpCasting;
        System.out.println("child class instance variable a="+DownCasting.a);
        DownCasting.show();
        DownCasting.display();
        DownCasting.view();

    }
}
