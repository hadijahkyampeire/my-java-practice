/*A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a primeproduct, otherwise it returns 0. 
Recall that a prime number is a positive integer with no factors other than 1 and itself.
You may assume that there exists a function named isPrime(int m) that returns 1 if its m is a prime number.
You do not need to write isPrime. You are allowed to use this function.*/


public class IsPrimeProduct {
  public static void main(String[] args) {
    System.out.println(isPrimeProduct(22));
    System.out.println(isPrimeProduct(6));
    System.out.println(isPrimeProduct(12));
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

  public static int isPrimeProduct(int n) {
    for(int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0 && isPrime(i) == 1 && isPrime(n / i) == 1) {
        return 1;
      }
    }
    return 0;
  }
}

// if n = 6, i = 2, 6 % 2 = 0, 2 is prime, 6/2 = 3 which is prime
// if n = 12, i = 2, 12 % 2 = 0, 2 is a prime, 12/2 = 6 not a prime