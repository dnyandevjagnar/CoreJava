package looping;
//a number that can be divided exactly only by itself and 1
// prime number are divided exactly only by itself and one
public class PrimeNumber {
    public static void main(String[] args) {
        int a=5;
        if(a%2==0){
            System.out.println(a+"= isn't prime number");
        }
        else if(a%2==1) {
            System.out.println(a+"= is prime number");
        }
    }
}
