/**
 * Write a function sumIsPower with signatuare boolean sumIsPower(int[] arr) which outputs true if the sum of 
the elements in the input array arr is a power of 2, false otherwise. 
Recall that the powers of 2 are 1, 2, 4, 8, 16, and so on. In general a number is a power of 2 if and only 
if it is of the form 2^n for some nonnegative integer n. You may assume (without verifying in your code) 
that all elements in the array are positive integers. If the input array arr is null, the return value should be false.
Examples: sumIsPower({8,8,8,8}) is true since 8 + 8 + 8 + 8 = 32. 
sumIsPower({8,8,8}) is false, since 8 + 8 +8 = 24, not a power of 2.
 */

public class SumIsPower {
    public static void main(String[] args) {
      int[] arr1 = {8, 8, 8, 8};
      int[] arr2 = {8, 8, 8};

      System.out.println(sumIsPower(arr1)); // Output: 1
      System.out.println(sumIsPower(arr2)); // Output: 1
    }
    
    public static boolean sumIsPower(int[] arr) {
      if (arr == null) {
        return false;
      }
      int sum = 0;
      for(int num: arr) {
        sum += num;
      }

      // Check if the sum is a power of 2
      while (sum > 1) {
        if (sum % 2 != 0) {
            return false; // Sum is not a power of 2
        }
        sum /= 2;
      }

      return sum == 1; // Sum is a power of 2
    }
}