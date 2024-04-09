package array;

public class AdditionOfArrayElement {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("addition of all element of array a ="+sum);

    }
}
