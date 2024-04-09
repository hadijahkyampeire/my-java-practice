/* Given a number, make sure all numbers are even numbers and in ascending order */
public class AllEvens {
    public static void main(String[] args) {
      System.out.println(isAllEvens(134));
      System.out.println(isAllEvens(2468));
      System.out.println(isAllEvens(8624));
    }

    public static int isAllEvens(int num1) {
      if(num1 < 1) {
        return num1 * -1;
      }
      int minimum = 10;
      while(num1 != 0) {
        int x = num1 % 10;
        if (x % 2 == 0 && x < minimum) {
          minimum = x;
          num1 = num1 / 10;
        } else {
          return 0;
        }
      }
      return 1;
    }
}


// 134
// 2468