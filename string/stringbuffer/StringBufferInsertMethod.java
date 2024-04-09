package string.stringbuffer;

public class StringBufferInsertMethod {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("good ");
        System.out.println("'"+s1+"'=length= "+s1.length());
        s1.insert(5,"evening ");
        System.out.println("'"+s1+"'=length= "+s1.length());
    }
}
