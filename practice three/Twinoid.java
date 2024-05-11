/**
 * A twinoid is defined to be an array that has exactly two even values that are adjacent to one another. 
 * For example {3, 3, 2, 6, 7} is a twinoid array because it has exactly two even values (2 and 6) and 
 * they are adjacent to one another. The following arrays are not twinoid arrays.
{3, 3, 2, 6, 6, 7} because it has three even values.
{3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another
{3, 8, 5, 7, 3} because it has only one even value.
Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise it returns 0.
 */

// countEvens
// have a boolean for evenFound
// check next if its an even

public class Twinoid {
  public static void main(String[] args) {

    int[] arr1 = {3, 3, 2, 6, 7};
    int[] arr2 = {6, 7, 2, 4, 3, 12};
    int[] arr3 = {3, 3, 2, 6, 6, 7};
    int[] arr4 = {3, 3, 2, 7, 6, 7};
    int[] arr5 = {3, 8, 5, 7, 3};
    int[] arr6 = {3, 5, 7, 3, 14, 16};

    System.out.println(isTwinoid(arr1)); // Output: 1
    System.out.println(isTwinoid(arr2)); // Output: 0
    System.out.println(isTwinoid(arr3)); // Output: 0
    System.out.println(isTwinoid(arr4)); // Output: 0
    System.out.println(isTwinoid(arr5)); // Output: 0
    System.out.println(isTwinoid(arr6)); // Output: 1
  }
    public static int isTwinoid(int[] arr) {
      int evenCounts = 0;
      for(int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0) {
          evenCounts++;
        }
      }

      for(int j = 0; j < arr.length - 1; j++) {
        if(arr[j] % 2 == 0 && arr[j+1] % 2 == 0 && evenCounts == 2) {
          return 1;
        }
      }
      return 0;
    }
}