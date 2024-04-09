package array;

public class TwoDimentionalArray1 {
    void arrayThreeByFour(){
        int arr[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34}};
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<=arr.length;j++){
                 System.out.print(arr[i][j]+",");
             }
             System.out.println( );
         }


    }
    public static void main(String[] args) {
        TwoDimentionalArray1 TwoDimentionalArray1=new TwoDimentionalArray1();
        TwoDimentionalArray1.arrayThreeByFour();
    }
}
