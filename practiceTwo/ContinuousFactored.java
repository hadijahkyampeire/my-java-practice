/**
 * An integer is defined to be “continuous factored” if it can be expressed as 
the product of two or more continuous integers greater than 1. 
Examples of “continuous factored” integers are: 
6 = 2 * 3. 
60 = 3 * 4 * 5 
120 = 4 * 5 * 6 
90 = 9*10 
Examples of integers that are NOT “continuous factored” are: 99 = 9*11, 121=11*11, 2=2, 13=13 
Write a function named isContinuousFactored(int n) that returns 1 if n is continuous factored and 0 otherwise. 
*/

// steps
// loop through numbers from 2 to n
// initiate product to be 1 and then loop through the second time start at i+1
// break if the number is not completely divisible by i
// check if the product is equal to the number and return 1

public class ContinuousFactored {
  public static void main(String []args){
    System.out.println(isContinuousFactored(2));
    System.out.println(isContinuousFactored(6));
    System.out.println(isContinuousFactored(60));
    System.out.println(isContinuousFactored(120));
    System.out.println(isContinuousFactored(90));
    System.out.println(isContinuousFactored(99));
 }

    public static int isContinuousFactored(int n) {
      if(n < 2) return 0;

      for(int i=2; i<n; i++) {
        if(n % i== 0) {
        int product = i;
        for(int j = i+1; j < n; j++) {
          if(n%j!=0){
            break;
          }
          else{
            product*=j;
            if(product==n)
            return 1;
          } 
        } 
      } 
    }
    return 0;
     
    }
}

