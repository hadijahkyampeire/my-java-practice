/*
An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly 
greater than the value of the middle element. 
Note that only arrays with an odd number of elements have a middle element. 
Write a function named isCentered that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
Examples: 
{5, 3, 3, 4, 5} is not a centered array (the middle element 3 is not strictly less than all other elements), 
{3, 2, 1, 4, 5} is centered (the middle element 1 is strictly less than all other elements), 
{3, 2, 1, 4, 1} is not centered (the middle element 1 is not strictly less than all other elements), 
{3, 2, 1, 1, 4, 6} is not centered (no middle element since array has even number of elements), 
{} is not centered (no middle element), 
{1} is centered (satisfies the condition vacuously).
If you are programming in Java or C#, the function signature is
int isCentered(int[ ] a)
*/

// If it is empty return 0, if it is length 1 return true
// Get the one in the center
// check if it is less that the rest of the numbers

public class Centered {
  public static void main(String[] arg) {
    int[] arr1 = {5, 3, 3, 4, 5};
    int[] arr2 = {3, 2, 1, 4, 5};
    int[] arr3 = {3, 2, 1, 4, 1};

    int[] arr4 = {3, 2, 1, 1, 4, 6};
    int[] arr5 = {};
    int[] arr6 = {1};

    System.out.println(isCentered(arr1)); // Output: 0
    System.out.println(isCentered(arr2)); // Output: 1
    System.out.println(isCentered(arr3)); // Output: 0


    System.out.println(isCentered(arr4)); // Output: 0
    System.out.println(isCentered(arr5)); // Output: 0
    System.out.println(isCentered(arr6)); // Output: 1

}
  public static int isCentered(int[] array) {
    if (array.length == 0) return 0;
    if (array.length == 1) return 1;
    if (array.length % 2 == 0) return 0;

    int centerIndex = array.length / 2;
    int centerNumber = array[centerIndex];

    for(int i = 0; i < array.length; i++) {
      if(i != centerIndex) {
        if(centerNumber >= array[i]) {
          return 0;
        }
      }
    }
    return 1;
  }
}