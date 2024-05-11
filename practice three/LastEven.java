/**
 * Write a function named lastEven that returns the index of the last even value in its array argument. 
 * For example, lastEven will return 3 if the array is {3, 2, 5, 6, 7}, because that is the index of 6 which is 
 * the last even value in the array. 
If the array has no even numbers, the function should return -1. 
 */

public class LastEven {
  public static void main(String[] args) {

    int[] arr1 = {3, 2, 5, 6, 7};
    int[] arr2 = {6, 7, 2, 3, 12};
    int[] arr3 = {7, 15, 2, 3};
    int[] arr4 = {16, 6, 2, 3};
    int[] arr5 = {1, 5, 3, 7};

    System.out.println(isLastEven(arr1)); // Output: 3
    System.out.println(isLastEven(arr2)); // Output: 4
    System.out.println(isLastEven(arr3)); // Output: 2
    System.out.println(isLastEven(arr4)); // Output: 2
    System.out.println(isLastEven(arr5)); // Output: -1
  }

    public static int isLastEven(int[] arr) {
      int lastEvenIndex = arr.length - 1;
      int evensCount = 0;

      for(int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0) {
          evensCount++;
        }
      }

      if (evensCount == 0) {
        return -1;
      }

      for(int i = arr.length - 1; i >= 0; i--) {
        if(arr[i] % 2 == 0) {
          lastEvenIndex = i;
          break;
        }
      }
      return lastEvenIndex;
    }
}