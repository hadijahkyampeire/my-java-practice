/**
 * Write a function named countMax that returns the number of times that the max value occurs in the array. 
 * For example, countMax would return 2 if the array is {6, 3, 1, 3, 4, 3, 6, 5}because 6 occurs 2 times in the array.
If you are programming in Java or C#, the function signature is
int countMax (int[ ] a)
 */

public class CountMax {

    public static void main(String[] args) {

      int[] arr1 = {2, 3, 6, 7};
      int[] arr2 = {6, 3, 1, 3, 4, 3, 6, 5};
      int[] arr3 = {7, 15, 2, 3, 12};
      int[] arr4 = {16, 6, 2, 3, 16, 1, 16};
      int[] arr5 = {0, 1, 2, 3, 4, 2, 4};

      System.out.println(countMax(arr1)); // Output: 1
      System.out.println(countMax(arr2)); // Output: 2
      System.out.println(countMax(arr3)); // Output: 1
      System.out.println(countMax(arr4)); // Output: 3
      System.out.println(countMax(arr5)); // Output: 2
    }
    public static int countMax(int[] arr) {
      int max = 0;

      for(int i = 0; i < arr.length; i++) {
        if(max < arr[i]) {
          max = arr[i];
        }
      }
      int maxCount = 0;
      for(int j = 0; j < arr.length; j++) {
        if(arr[j] == max) {
          maxCount++;
        }
      }

      return maxCount;
    }
}