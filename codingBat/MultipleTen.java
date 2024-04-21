/**
 * For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
 * until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */

public class MultipleTen {
  public int[] tenRun(int[] nums) {
    // Initialize a variable to store the most recent multiple of 10
    int multipleOf10 = -1;

    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {
        // If the current element is a multiple of 10, update the most recent multiple of 10
        if (nums[i] % 10 == 0) {
            multipleOf10 = nums[i];
        }
        // If the most recent multiple of 10 is not -1, update the current element
        else if (multipleOf10 != -1) {
            nums[i] = multipleOf10;
        }
    }
    return nums;
  }
}