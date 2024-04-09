package array;

public class AdditionOfThreeDimentionalArray {
    public static void main(String[] args) {
        int a[][][]={{{11,12,13}, {21,22,23}, {31,32,33}}, {{41,42,43}, {51,52,53}, {61,62,63}}, {{71,72,73}, {81,82,83}, {91,92,93}}
        };
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    sum=sum+a[i][j][k];
                    System.out.print(a[i][j][k]+",");
                }
            }

        }
        System.out.println( sum);
    }
}
