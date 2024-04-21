/**
 * 
Given a non-empty array of ints, return a new array containing the elements from the original array that come after 
the last 4 in the original array. The original array will contain at least one 4. 
Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */

public class Post4 {
  public static void main(String[] args) {
    // check twin array
    int[] arr1 = {2, 4, 1, 2};
    int[] arr2 = {4, 1, 4, 2};
    int[] arr3 = {4, 4, 1, 2, 3};

    printArray(post4Array(arr1)); // [1, 2]
    printArray(post4Array(arr2)); // [2]
    printArray(post4Array(arr3)); // [1, 2, 3]
  }

  public static int[] post4Array(int[] arr) {
  int lastIndex = -1;
  for(int i = arr.length - 1; i >= 0; i--) {
    if(arr[i] == 4) {
      lastIndex = i;
      break;
    }
  }

  int newLength = arr.length - lastIndex - 1;
  int[] newArray = new int[newLength];

  for(int i = lastIndex + 1, j = 0; i < arr.length; i++, j++) {
    newArray[j] = arr[i];
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