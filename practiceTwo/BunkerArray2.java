/**
 * A Bunker array is defined to be an array in which at least one odd number is immediately followed by a prime number. 
So {4, 9, 6, 7, 3} is a Bunker array because the odd number 7 is immediately followed by the prime number 3. 
But {4, 9, 6, 15, 21} is not a Bunker array because none of the odd numbers are immediately followed by a prime number.
Write a function named isBunkerArray that returns 1 if its array argument is a Bunker array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isBunkerArray(int [ ] a)
*/

// steps
// initiate boolean for odd number found
// loop through the array and find an odd number which is immediately followed by a prime number

public class BunkerArray2 {
  public static void main(String[] args) {
    // check for isPrime
    System.out.println(isPrime(3)); // true
    System.out.println(isPrime(6)); // false
    System.out.println(isPrime(17)); // true
    System.out.println(isPrime(21)); // false
    System.out.println(isPrime(23)); // true

    // check bunker array
    int[] arr1 = {4, 9, 6, 7, 3};
    int[] arr2 = {4, 9, 6, 15, 21};
    System.out.println(isBunkerArray2(arr1)); // 1
    System.out.println(isBunkerArray2(arr2)); // 0
  }
  public static boolean isPrime(int n) {
    for(int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int isBunkerArray2(int[] arr) {
    if(arr.length < 2) return 0;

    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr.length; j++) {
        if(arr[i] % 2 != 0 && isPrime(arr[j])) {
          return 1;
        }
      }
    }
    return 0;
  }
}