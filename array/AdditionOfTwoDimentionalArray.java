package array;

public class AdditionOfTwoDimentionalArray {
    public static void main(String[] args) {

        int a[][]={
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++) {
                sum=sum+a[i][j];
               // System.out.print(a[i][j]+",");
            }
        }
        System.out.println( sum);
    }
}
