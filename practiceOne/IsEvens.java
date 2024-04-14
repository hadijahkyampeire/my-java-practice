/* An Evens number is an integer whose digits are all even. For example 2426 is an Evens number
but 3224 is not.
Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it
returns 0. */

public class IsEvens {
    public static void main(String[] args) {
      System.out.println("0 means its not Evens and 1 mean is Evens");
      System.out.println(isEvens(3224));
      System.out.println(isEvens(2426));
      System.out.println(isEvens(14));
      System.out.println(isEvens(0));
    }
    public static int isEvens(int n) {
      if (n == 0) {
        return 0; // Zero is not an even number
      }
      while (n != 0) {
        int x = n % 10;
        if (x % 2 != 0) 
        return 0;
        n = n / 10;
      }
      return 1;
    }
}