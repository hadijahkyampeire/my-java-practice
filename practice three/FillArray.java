/**
 * Write a function fill with signature int[] fill(int[] arr, int k, int n)
which does the following: It returns an integer array arr2 of length n whose first k elements are the same as 
the first k elements of arr, and whose remaining elements consist of repeating blocks of the first k elements. 
You can assume array arr has at least k elements. The function should return null if either k or n is not positive.
Examples: fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}. 
Fill({4, 2, -3, 12}, 1, 5) returns {4, 4, 4, 4, 4}. fill({2, 6, 9, 0, -3}, 0, 4) returns null.
 */

public class FillArray {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,5, 9, 12,-2,-1};
    int[] arr4 = {4, 2, -3, 12};
    int[] arr3 = {2, 6, 9, 0, -3};

    int k1 = 3;
    int n1 = 10;

    int k2 = 1;
    int n2 = 5;
    
    int k3 = 0;
    int n3 = 4;

    printArray(fill(arr1, k1, n1)); // {1,2,3,1,2,3,1,2,3,1}
    printArray(fill(arr4, k2, n2)); // {4, 4, 4, 4, 4}
    printArray(fill(arr3, k3, n3)); // null
 
  }
    public static int[] fill(int[] arr, int k, int n) {
      int[] newArray = new int[n];
      if(k < 1 || n < 1) return null;
      int count = 0;

      for(int i = 0; i < n; i++) {
        if(count < k) {
          newArray[i] = arr[count];
          count++;
        } else if (count == k) {
          count = 0;
          newArray[i] = arr[count];
          count++;
        }
      }
      return newArray;
    }

    // To help print my array
  public static void printArray(int[] arr) {
    if (arr == null) {
        System.out.println("null");
        return;
    }
    System.out.print("{");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("}");
  }
}