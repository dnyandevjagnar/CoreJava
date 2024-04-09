package basicjava;

public class MethodCreation{

    public void addi(int a,int b){
         int c=a+b;
        System.out.println("Addition of "+ a+" and "+b+" ="+c);
    }
    public int mul(int a,int b){
     return a*b;
    }
    public static void main(String[] args) {
        MethodCreation MethodCreation=new MethodCreation();
        MethodCreation.addi(100,200);
       int result= MethodCreation.mul(100,200);
       System.out.println("Multiplication of a and b ="+result);
    }
}
