/**
A Bean array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array. 
For example, {2, 10, 9, 3} is a Bean array because 
2 = 3-1 
10 = 9+1 
3 = 2 + 1 
9 = 10 -1 
Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}. 
The array {3, 4, 5, 7} is not a Bean array because of the value 7 which requires that the array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array. 
Write a function named isBean that returns 1 if its array argument is a Bean array. Otherwise it returns a 0. 
 */

public class BeanArraySimilars {
  public static void main(String[] args) {
    int[] arr1 = {2, 10, 9, 3};
    int[] arr2 = {2, 2, 3, 3, 3};
    int[] arr3 = {1, 1, 1, 2, 1, 1};
    int[] arr4 = {0, -1, 1};
    int[] arr5 = {3, 4, 5, 7};

    System.out.println(isBeanArray(arr1)); // Output: 1
    System.out.println(isBeanArray(arr2)); // Output: 1
    System.out.println(isBeanArray(arr3)); // Output: 1
    System.out.println(isBeanArray(arr4)); // Output: 1
    System.out.println(isBeanArray(arr5)); // Output: 0
  }

  public static int isBeanArray(int[] arr) {
      int count = 0;
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr.length; j++) {
            if(arr[i] == arr[j] - 1 || arr[i] == arr[j] + 1) {
                count++;
                break;
              }
          }
      
      }
      if (count == arr.length) {
          return 1;
      }
    return 0;
  }
}