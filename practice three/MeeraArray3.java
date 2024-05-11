/**
 * A Meera array is an array that contains the value 0 if and only if it contains a prime number. 
The array {7, 6, 0, 10, 1} is a Meera array because it contains a prime number (7) and also contains a 0. 
The array {6, 10, 1} is a Meera array because it contains no prime number and also contains no 0.
The array {7, 6, 10} is not a Meera array because it contains a prime number (7) but does not contain a 0. 
The array {6, 10, 0} is not a Meera array because it contains a 0 but does not contain a prime number.
It is okay if a Meera array contains more than one value 0 and more than one prime, so the array {3, 7, 0, 8, 0, 5} is a Meera array (3, 5 and 7 
are the primes and there are two zeros.).
Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 otherwise.
 */

public class MeeraArray3 {

  public static void main(String[] args) {

    int[] arr1 = {7, 6, 0, 10, 1};
    int[] arr2 = {6, 10, 1};
    int[] arr3 = {7, 6, 10};
    int[] arr4 = {6, 10, 0};

    System.out.println(isMeeraArray(arr1)); // Output: 1
    System.out.println(isMeeraArray(arr2)); // Output: 1
    System.out.println(isMeeraArray(arr3)); // Output: 0
    System.out.println(isMeeraArray(arr4)); // Output: 0
  }

    public static boolean isPrime(int n) {
      if(n <= 1) return false;
      if(n <=2) return true;
      if(n % 2 == 0 || n % 3 ==0) {
        return false;
      }

      for(int i = 5; i * i <= n; i+=6) {
        if(n % i != 0 || n % (i+2) != 0) {
          return false;
        }
      }
      return true;
    }

    public static int isMeeraArray(int[] arr) {
        boolean found0 = false;
        boolean foundPrime = false;
        for(int i = 0; i < arr.length; i++) {
          if(arr[i] == 0) {
            found0 = true;
          }

          if(isPrime(arr[i])) {
            foundPrime = true;
          }
        }

        if(foundPrime && found0 || !found0 && !foundPrime) {
          return 1;
        }
        return 0;
    }
}