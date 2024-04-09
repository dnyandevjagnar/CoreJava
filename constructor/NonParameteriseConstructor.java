package constructor;

public class NonParameteriseConstructor {
        int a=200,b=300;
    NonParameteriseConstructor(){

        System.out.println(a+b);
    }
    public static void main(String[] args) {

        NonParameteriseConstructor NonParameteriseConstructor=new NonParameteriseConstructor();
    }
}
