/**
 * Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.


sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
 */

 public class SameEnds {
  public static void main(String[] args) {
    // check twin array
    int[] arr1 = {5, 6, 45, 99, 13, 5, 6};
    int[] arr2 = {5, 6, 45, 99, 13, 5, 6};
    int[] arr3 = {5, 6, 45, 99, 13, 5, 6};

    System.out.println(sameEnds(arr1, 1)); // 1
    System.out.println(sameEnds(arr2, 2)); // 1
    System.out.println(sameEnds(arr3, 3)); // 0
  }

  public static boolean sameEnds(int[] nums, int len) {
  
    if(len == 0) return true;
    for(int i = 0; i < len; i++) {
      if (nums[i] != nums[nums.length - len + i]) {
        return false; // If corresponding elements are not the same, return false
      }
    }
  
    return true;
    
  }
 }