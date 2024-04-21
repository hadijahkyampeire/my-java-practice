/**
 * An Evens number is an integer whose digits are all even. For example 2426 is an Evens number but 3224 is not.
Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it returns 0.
 */

public class Evens {
  public static void main(String[] args) {
    System.out.println(isAllEvens(134));
    System.out.println(isAllEvens(2468));
    System.out.println(isAllEvens(8624));
  }

  public static int isAllEvens(int num) {
     if(num < 1) return num = -num;
     if(num == 0) return 1;
     
     while(num > 0) {
      int digit = num % 10;
      if(digit % 2 != 0) {
        return 0;
      }
      num = num / 10;
     }
     return 1;
  }
}