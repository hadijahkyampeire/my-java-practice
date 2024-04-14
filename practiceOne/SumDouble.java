/* Given two int values, return their sum. Unless the two values are the same, then return double their sum.*/

public class SumDouble {
    public static void main(String[] args) {
      System.out.println(sumDouble(5, 5)); // Double their sum
      System.out.println(sumDouble(2, 3)); // just add them
    }

    public static int sumDouble(int num1, int num2) {
      int sum = num1 + num2;
      if (num1 == num2) {
        return 2 * sum;
      }
      return sum;
    }
}