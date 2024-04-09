package Patten;

public class Pattern4 {
//                              *
//                             **
//                            ***
//                           ****
//                          *****
//                         ******
//                        *******
//                       ********

    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            for(int j=8;j>=i;j--){

                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
