/**
 * An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded and followed by 
the same number of non-zero elements. 
Write a function named isHollow that accepts an integer array and returns 1 if it is a hollow array, 
otherwise it returns 0. The function signature is
int isHollow(int[ ] a).
Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns true. isHollow ({1,2,0,0,0,3,4,5}) returns false. 
: isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns false. isHollow ({1,2, 0,0, 3,4}) returns false.
 */

public class Hollow {
  public static void main(String[] args) {

    int[] arr1 = {1,2,4,0,0,0,3,4,5};
    int[] arr2 = {1,2,0,0,0,3,4,5};
    int[] arr3 = {1,2,4,9, 0,0,0,3,4, 5};
    int[] arr4 = {1,2, 0,0, 3,4};

    System.out.println(isHollow(arr1)); // Output: true
    System.out.println(isHollow(arr2)); // Output: false
    System.out.println(isHollow(arr3)); // Output: false
    System.out.println(isHollow(arr4)); // Output: false
  }
    public static boolean isHollow(int[] arr) {
      int zeroCount = 0;
      int prevCount = 0;
      int afterCount = 0;
      for(int i = 0; i < arr.length; i++) {
        if(arr[i] == 0) {
          zeroCount++;
        }
      }
      boolean found0 = false;
      for(int j = 0; j < arr.length; j++) {
        if(!found0 && arr[j] != 0) {
          prevCount++;
        } else if (found0 && arr[j] != 0) {
          afterCount++;
        } else if(arr[j] == 0) {
          found0 = true;
        }
      }

      if(prevCount == afterCount && zeroCount >= 3) {
        return true;
      }

      return false;
    }
}