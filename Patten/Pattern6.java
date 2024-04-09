package Patten;

public class Pattern6 {
//            *******
//             ******
//              *****
//               ****
//                ***
//                 **
//                  *
    public static void main(String[] args) {
        for(int i=0;i<=7;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=7;k>i;k--){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
