package Patten;

public class Pattern5 {
 //       * * * * * * *
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            for(int j=7;j>i;j--){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
