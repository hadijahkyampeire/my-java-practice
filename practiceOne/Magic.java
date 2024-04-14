/* An array is defined to be a Magic array if the sum of the primes in the array is equal to the first
element of the array. If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9,
11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the
first element of the array. {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13
which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {8, 5, -5, 5, 3} is not a
Magic array because the sum of the primes is 5+5+3 = 13. Note that -5 is not a prime because prime
numbers are positive.
Write a function named isMagicArray that returns 1 if its integer array argument is a Magic array.
Otherwise it returns 0.
If you are writing in Java or C#, the function signature is
int isMagicArray (int[ ] a)

You may assume that a function named isPrime exists that returns 1 if its int argument is a prime,
otherwise it returns 0. You do not have to write this function! You are allowed to use it. */

public class Magic {
    public static void main(String[] args) {
      int[] arr1 = {21, 3, 7, 9, 11, 4, 6};
      int[] arr2 = {13, 4, 4, 4, 4};
      int[] arr3 = {10, 5, 5};
      int[] arr4 = {0, 6, 8, 20};
      int[] arr5 = {3};
      int[] arr6 = {8, 5, -5, 5, 3};
      
      System.out.println(isMagicArray(arr1)); // Output: 1
      System.out.println(isMagicArray(arr2)); // Output: 1
      System.out.println(isMagicArray(arr3)); // Output: 1
      System.out.println(isMagicArray(arr4)); // Output: 1
      System.out.println(isMagicArray(arr5)); // Output: 1
      System.out.println(isMagicArray(arr6)); // Output: 0
    }

    public static int isPrime(int num) {
      if (num <= 1) {
        return 0;
      }
      if (num <= 3) {
        return 1;
      }
      if (num % 2 == 0 || num % 3 == 0) {
        return 0;
      }
      for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0) {
            return 0;
        }
      }
      return 1;
    }
    public static int isMagicArray(int[] array) {
      if (array.length == 0) {
        return 0;
      }

      int sumOfPrimes = 0;

      for (int i = 0; i < array.length; i++) {
        if (isPrime(array[i]) == 1) {
          sumOfPrimes += array[i];
        }
      }
      if ((sumOfPrimes == array[0]) || (sumOfPrimes == 0 && array[0] == 0)) {
        
        return 1;
      }
      return 0;
    }
}