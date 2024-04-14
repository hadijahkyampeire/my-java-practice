/**
 * A Meera array is defined to be an array such that for all values n in the array, the value 2*n is not in the array. 
So {3, 5, -2} is a Meera array because 3*2, 5*2 and -2*2 are not in the array. 
But {8, 3, 4} is not a Meera array because for n=4, 2*n=8 is in the array.
Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isMeera(int [ ] a)
*/

// steps
// loop through an array get a product of each number with 2, check if it exists in the array


 public class MeeraArray2 {
  public static void main(String[] args) {
    int[] arr1 = {3, 5, -2};
    int[] arr2 = {8, 3, 4};
    int[] arr3 = {1, 2, 5, 6, 10};
    int[] arr4 = {2, 5, 6, 11, 13};

    System.out.println(isMeeraArray(arr1)); // 1
    System.out.println(isMeeraArray(arr2)); // 0
    System.out.println(isMeeraArray(arr3)); // 0
    System.out.println(isMeeraArray(arr4)); // 1
  }

  public static int isMeeraArray(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr.length; j++) {
        if(2 * arr[i] == arr[j]) {
          return 0;
        }
      } 
    }
    return 1; 
  }
 }