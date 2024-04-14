/**
 * An array is defined to be a Bean array if it meets the following conditions
a. If it contains a 9 then it also contains a 13.
b. If it contains a 7 then it does not contain a 16.
So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are Bean arrays. 
The following arrays are not Bean arrays:
a. { 9, 6, 18} (contains a 9 but no 13)
b. {4, 7, 16} (contains both a 7 and a 16)
Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isBean (int[ ] a)
*/

// steps
// initialize booleans for found 9, found 13, found 7 and found 16
// loop through an array and compare the founds

public class BeanArray {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 9, 6, 13};
    int[] arr2 = {3, 4, 6, 7, 13, 15};
    int[] arr3 = {1, 2, 3, 4, 10, 11, 12};
    int[] arr4 = {3, 6, 9, 5, 7, 13, 6, 17};
    int[] arr5 = { 9, 6, 18};
    int[] arr6 = {4, 7, 16};

    System.out.println(isBeanArray(arr1)); // 1
    System.out.println(isBeanArray(arr2)); // 1
    System.out.println(isBeanArray(arr3)); // 1
    System.out.println(isBeanArray(arr4)); // 1
    System.out.println(isBeanArray(arr5)); // 0
    System.out.println(isBeanArray(arr6)); // 0

  }

  public static int isBeanArray(int[] arr) {
    boolean found9 = false;
    boolean found16 = false;
    boolean found7 = false;
    boolean found13 = false;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == 9) {
        found9 = true;
      } else if(arr[i] == 7) {
        found7 = true;
      } else if(arr[i] == 13) {
        found13 = true;
      } else if(arr[i] == 16) {
        found16 = true;
      }
    }
    if((found9 && !found13) || (found7 && found16)) {
      return 0;
    } else {
      return 1;
    }
  }
}
