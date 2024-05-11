/**
 * A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that first two 
Fibonacci numbers are 1 and any Fibonacci number other than the first two is the sum ofthe previous two Fibonacci numbers. 
For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number, otherwise it returns 0.
The signature of the function is
int isFibonacci (int n)
 */

public class Fibonacci {
  public static void main(String[] args) {

    System.out.println(isFibonacci(2)); // Output: 1
    System.out.println(isFibonacci(3)); // Output: 1
    System.out.println(isFibonacci(5)); // Output: 1
    System.out.println(isFibonacci(6)); // Output: 0
    System.out.println(isFibonacci(7)); // Output: 0
  }
    public static int isFibonacci(int n) {
      int prev = 0;
      int curr = 1;

      while(curr < n) {
        int next = prev + curr;
        prev = curr;
        curr = next;
      }
      if(curr == n) {
        return 1;
      } else {
        return 0;
      }
    }
}