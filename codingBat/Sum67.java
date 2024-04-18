/**
 * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
 */
public class Sum67 {
  public static void main(String[] arg) {
    int[] arr1 = {1, 2, 2};
    int[] arr2 = {1, 2, 2, 6, 99, 99, 7};
    int[] arr3 = {1, 1, 6, 7, 2};

    System.out.println(sum67(arr1)); // Output: 5
    System.out.println(sum67(arr2)); // Output: 5
    System.out.println(sum67(arr3)); // Output: 4

  }
  

  public static int sum67(int[] nums) {
    boolean found6 = false;
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      if(found6 && nums[i] != 6) {
        if(nums[i] == 7) {
          found6 = false;
          continue;
        }
      } else {
        if(nums[i] == 6) {
          found6 = true;
        } else {
          sum = sum + nums[i];
        }
      }
    }
    
    return sum;
  } 
}
 