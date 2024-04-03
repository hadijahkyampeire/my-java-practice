/*Given an int n, return the absolute difference between n and 21, 
except return double the absolute difference if n is over 21. */

public class AbsDiff {
  public static void main(String[] args) {
    System.out.println(diff21(19));
    System.out.println(diff21(44));
    System.out.println(diff21(10));
    System.out.println(diff21(58));
    System.out.println(diff21(-2));
  }
  public static int diff21(int n) {
    int absDiff = Math.abs(n - 21);
    if (n > 21) {
      return 2 * absDiff;
    }
    return absDiff;
  }
}
