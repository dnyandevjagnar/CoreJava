package looping;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 4562, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("reverse the given number : " + reverse);
    }
}
