/* An array is defined to be complete if the conditions (a), (d) and (e) below hold.
a. The array contains even numbers
b. Let min be the smallest even number in the array.
c. Let max be the largest even number in the array.
d. min does not equal max
e. All numbers between min and max are in the array
For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because
a. The array contains even numbers
b. 2 is the smallest even number
c. 8 is the largest even number
d. 2 does not equal 8
e. the numbers 3, 4, 5, 6, 7 are in the array.
Examples of arrays that are not complete are:
{5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
{2, 2} condition (d) does not hold
{2, 6, 3, 4} condition (e) does not hold (5 is missing)
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.
If you are writing in Java or C#, the function signature is
int isComplete (int[ ] a) */

public class IsComplete {
  public static void main(String[] arg) {
      int[] arr1 = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
      int[] arr2 = {5, 7, 9, 13};
      int[] arr3 = {2, 2};
      int[] arr4 = {2, 6, 3, 4};

      System.out.println(isComplete(arr1)); // Output: 1
      System.out.println(isComplete(arr2)); // Output: 0
      System.out.println(isComplete(arr3)); // Output: 0
      System.out.println(isComplete(arr4)); // Output: 0

  }

  public static int isComplete(int[] arr) {
      int minEven = Integer.MAX_VALUE;
      int maxEven = Integer.MIN_VALUE;
      boolean evenNumberFound = false;

      // Iterate through the array to find min and max even numbers
      for (int num : arr) {
          if (num % 2 == 0) {
              evenNumberFound = true;
              minEven = Math.min(minEven, num);
              maxEven = Math.max(maxEven, num);
          }
      }

      // If no even numbers found, array cannot be complete
      if (!evenNumberFound) {
          return 0;
      }

      if (minEven == maxEven) {
        return 0;
      }

      // Check if min and max are the same or any number between them is missing
      for (int i = minEven + 1; i < maxEven; i++) {
          boolean found = false;
          for (int num : arr) {
              if (num == i) {
                  found = true;
                  break;
              }
          }
          if (!found) {
              return 0;
          }
      }

      // If all conditions met, array is complete
      return 1;
  }
}
