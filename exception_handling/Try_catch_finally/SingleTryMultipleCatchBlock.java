package exception_handling.Try_catch_finally;

public class SingleTryMultipleCatchBlock {
    static void view(int a ,String sc,int f){
        try{

                System.out.println(100 / a);
                System.out.println(sc.length());
                System.out.println(100 / f);

        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch ( NullPointerException c){
           c.printStackTrace();
        }catch (Exception b){
            b.printStackTrace();
        }
    }
    public static void main(String[] args) {
        view(10,"master",0);
    }
}
