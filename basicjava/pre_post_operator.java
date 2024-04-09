package basicjava;

public class pre_post_operator {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=10;
        int d=10;

        System.out.println(a  +","+ ++a);//pre increment
        System.out.println(b  +","+ --b);//pre decrement
        System.out.println(c  +","+ c++);//post increment
        System.out.println(d  +","+ d--);//post decrement

    }
}
