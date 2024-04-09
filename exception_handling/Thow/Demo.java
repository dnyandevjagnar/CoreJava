package exception_handling.Thow;

import java.util.Scanner;

public class Demo {
  public void show(int a){
        System.out.println("i am show method a="+a);
        if(a>0) {
            System.out.println(+200/a);
        }else{
            throw new ArithmeticException("don't divide zero");
        }
        }

    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        Demo Demo=new Demo();
        System.out.print("Enter the value od a=");
        int a=sc.nextInt();
        Demo.show(a);

    }

}
