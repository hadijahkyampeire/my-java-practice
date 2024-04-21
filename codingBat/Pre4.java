/**
 * Given a non-empty array of ints, return a new array containing the elements from the original array 
 * that come before the first 4 in the original array. The original array will contain at least one 4. 
 * Note that it is valid in java to create an array of length 0.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
 */

public class Pre4 {
  public static void main(String[] args) {
    // check twin array
    int[] arr1 = {1, 2, 4, 1};
    int[] arr2 = {3, 1, 4};
    int[] arr3 = {1, 4, 4};

    printArray(pre4Array(arr1)); // [1, 2]
    printArray(pre4Array(arr2)); // [3, 1]
    printArray(pre4Array(arr3)); // [1]
  }

  public static int[] pre4Array(int[] arr) {
    int index = 0;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == 4) {
        index = i;
        break;
      }
    }

    int[] newArray = new int[index];
    for(int i = 0; i < index; i++) {
      newArray[i] = arr[i];
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