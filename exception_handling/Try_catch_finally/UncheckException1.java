package exception_handling.Try_catch_finally;

public class UncheckException1 {
    void show(){
        int a[]=new int[4];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        int sum=0;
        System.out.println("hello1 ......");
        try {
            System.out.println("hello2 ......");
            for (int j : a) {
                System.out.println(j);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("hello3 ......");
    }


    public static void main(String[] args) {
        UncheckException1 UncheckException1=new UncheckException1();
        UncheckException1.show();
        System.out.println("program execute success full");
    }
}
