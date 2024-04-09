package exception_handling.Try_catch_finally;

import java.io.FileReader;

public class UncheckException {
    public static void main(String[] args) {

        System.out.println("Addition ="+(10+20));
        System.out.println("subtraction ="+(20-10));
        try{
            System.out.println("Division =" + (20 / 0));
        }
        catch(ArithmeticException e){
            e.getStackTrace();

        }
        System.out.println("Multiplication  ="+(20*10));


    }
}
