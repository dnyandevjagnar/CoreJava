package basicjava;

public class LogicalOperatos {

    public static void main(String[] args) {
        LogicalOperatos lgo=new LogicalOperatos();
        int x=10;
        int y=20;
        int z=30;
        System.out.println(x<y && y<z); //true
        System.out.println(x>y && y<z); // false
        System.out.println(x<y || y<z); //true
        System.out.println(x>y || y>z); //true



    }
}
