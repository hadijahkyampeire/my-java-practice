/**
 * 
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */

 public class ModThree {
  public static void main(String[] args) {
    int[] arr1 = {2, 5, 2, 5, 5};
    int[] arr2 = {3, 1, 1, 2, 2};
    int[] arr3 = {1, 2, 1, 3, 3, 2};
    int[] arr4 = {2, 1, 3, 5};
    int[] arr5 = {2, 4, 2, 5};

    System.out.println(modThree(arr1)); // false
    System.out.println(modThree(arr2)); // true
    System.out.println(modThree(arr3)); // true
    System.out.println(modThree(arr4)); // true
    System.out.println(modThree(arr5)); // true

  }
  public static boolean modThree(int[] nums) {
    int countEven = 0;
    int countOdd = 0;
  
    for (int num : nums) {
        if (num % 2 == 0) {
            countEven++;
            countOdd = 0;
        } else {
            countOdd++;
            countEven = 0;
        }
  
        if (countEven == 3 || countOdd == 3) {
            return true;
        }
    }
  
    return false;
  }
 }