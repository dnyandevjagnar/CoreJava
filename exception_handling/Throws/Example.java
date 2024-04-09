package exception_handling.Throws;

import java.util.Scanner;

public class Example {

    void show(int a) throws ArithmeticException{

        if(a>0) {
            System.out.println("i am a show method ");
            System.out.println("100/" + a + "=" + 100 / a);
        }else {
            throw new ArithmeticException("don't be divided 100/0");
        }
    }
    public static void main(String[] args)throws ArithmeticException{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a=");
        int a= sc.nextInt();
        Example Example=new Example();
        Example.show(a);
    }
}
