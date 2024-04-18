/**
 * Let us define two arrays as “set equal” if every element in one is also in the other and vice-versa. 
 * For example, any two of the following are equal to one another: 
 * {1, 9, 12}, {12, 1, 9}, {9, 1, 12, 1}, {1, 9, 12, 9, 12, 1, 9}.
 * Note that {1, 7, 8} is not set equal to {1, 7, 1} or {1, 7, 6}.
Write a function named isSetEqual(int[ ] a, int[ ] b) that returns 1 if its array arguments are set equal, 
otherwise it returns 0.
 */

 public class SetEqual {
  public static void main(String[] args) {
    // check twin array
    int[] arr11 = {1, 9, 12};
    int[] arr12 = {12, 1, 9};
    int[] arr21 = {9, 1, 12, 1};
    int[] arr22 = {1, 9, 12, 9, 12, 1, 9};
    int[] arr31 = {1, 7, 8};
    int[] arr32 = {1, 7, 1};

    System.out.println(isSetEqual(arr11, arr12)); // 1
    System.out.println(isSetEqual(arr21, arr22)); // 1
    System.out.println(isSetEqual(arr31, arr32)); // 0
  }
    public static int isSetEqual(int[] a, int[] b) {
      boolean foundEquals = false;

      for(int i = 0; i < a.length; i++) {
        for(int j = 0; j < b.length; j++) {
          if(a[i] == b[j]) {
            foundEquals = true;
            i++;
          }
          j++;
        }
      }
      return foundEquals ? 1 : 0;
    }
    
 }