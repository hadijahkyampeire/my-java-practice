/**
 * 
We'll say that an element in an array is "alone" if there are values before and after it, and 
those values are different from it. Return a version of the given array where every instance of the given 
value which is alone is replaced by whichever value to its left or right is larger.

notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
 */

public class NotAlone {
  public static void main(String[] args) {
    // check twin array
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {1, 2, 3, 2, 5, 2};
    int[] arr3 = {3, 4};

    printArray(notAlone(arr1, 2)); // [1, 3, 3]
    printArray(notAlone(arr2, 2)); // [1, 3, 3, 5, 5, 2]
    printArray(notAlone(arr3, 3)); // [3, 4]
  }

  public static int[] notAlone(int[] nums, int val) {
    int itemLeft = 0;
    int itemRight = 0;
    
    
    for(int i = 1; i < nums.length - 1; i++) {
      if(nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
        itemLeft = nums[i-1];
        itemRight = nums[i + 1];
        
        if(itemLeft > itemRight) {
          nums[i] = itemLeft;
        } else {
          nums[i] = itemRight;
        }
      }
    }
    
    return nums;
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