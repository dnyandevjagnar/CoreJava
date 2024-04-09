package exception_handling.Try_catch_finally;

import java.util.Scanner;

public class UsingTheFinallyBlock {
    void show(String sc) {
        try {
          System.out.println("length of String "+"'"+sc+"'"+"="+sc.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("I am a finally block");
        }
    }
    public static void main(String[] args) {
        UsingTheFinallyBlock UsingTheFinallyBlock=new UsingTheFinallyBlock();
        UsingTheFinallyBlock.show(null);

    }
}
