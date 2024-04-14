/* A Bunker array is an array that contains the value 1 if and 
only if it contains a prime number. The array {7, 6, 10, 1} is a Bunker array 
because it contains a prime number (7) and also contains a 1. 

The array {7, 6, 10} is not a Bunker array because it contains a prime number (7) but does not contain a 1. 
The array {6, 10, 1} is not a Bunker array because it contains a 1 but does not contain a prime number.
It is okay if a Bunker array contains more than one value 1 and more than one prime, 
so the array {3, 7, 1, 8, 1} is a Bunker array (3 and 7 are the primes).

Write a function named isBunker that returns 1 if its array argument is a Bunker array and returns 0 otherwise.
You may assume the existence of a function named isPrime that returns 1 if its argument is a prime
and returns 0 otherwise. You do not have to write isPrime, you can just call it.
If you are programming in Java or C#, the function signature is
int isBunker(int [ ] a)
*/

// loop through the array and see if it contains a prime number and a 1
public class BunkerArray {
  public static void main(String[] arg) {
    int[] arr1 = {7, 6, 10, 1};
    int[] arr2 = {7, 6, 10};
    int[] arr3 = {6, 10, 1};
    int[] arr4 = {3, 7, 1, 8, 1};

    System.out.println(isBankerArray(arr1)); // Output: 1
    System.out.println(isBankerArray(arr2)); // Output: 0
    System.out.println(isBankerArray(arr3)); // Output: 0
    System.out.println(isBankerArray(arr4)); // Output: 1
  }
  public static int isPrime(int n) {
    if (n <= 1) return 0;
    if (n <= 3) return 1;
    if (n % 2 == 0 || n % 3 == 0) return 0;
    for(int i = 5; i * i <= n; i+=6) {
      if (n % i == 0 || n % (i + 2) == 0) {
        return 0;
      }
    }
    return 1;
  }

  public static int isBankerArray(int[] arr) {
    boolean foundOne = false;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] ==1) {
        foundOne = true;
      }
    }
    
    for(int j = 0; j < arr.length; j++) {
      if(isPrime(arr[j]) == 1 && foundOne && arr[j] != 1) {
        return 1;
      }
    }
    return 0;
  }
}
