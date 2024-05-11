/**
 * An integer is defined to be an even subset of another integer n if every even factor of m is also a factor of n. 
 * For example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and these are both factors of 12. 
 * But 18 is not an even subset of 32 because 6 is not a factor of 32.
Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset of n, 
otherwise it returns 0.
 */

public class EvenSubset {
  public static void main(String[] args) {

    System.out.println(isEvenSubset(18, 12)); // Output: 1
    System.out.println(isEvenSubset(18, 32)); // Output: 0
  }

    public static int isEvenSubset(int m, int n) {  
      for (int i = 2; i < m; i += 2) { // if we want to check that all of them are subsets we stop at the number itself i<= m
        // Check if i is an even factor of m
        if (m % i == 0) {
            // Check if i is not a factor of n
            if (n % i != 0) {
                return 0; // i is an even factor of m but not of n, so m is not an even subset of n
            }
        }
      }
      return 1;
    } 
}