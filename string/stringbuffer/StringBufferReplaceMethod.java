package string.stringbuffer;

public class StringBufferReplaceMethod {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Edso Services");
        System.out.println(s1);
        s1.replace(5,13,"class");
        System.out.println(s1);
    }
}
