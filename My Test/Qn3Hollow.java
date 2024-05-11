/** Test Qn3: 11/05/2024
 * An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded and followed by 
the same number of non-zero elements. 
Write a function named isHollow that accepts an integer array and returns 1 if it is a hollow array, 
otherwise it returns 0. The function signature is
int isHollow(int[ ] a).
Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns true. isHollow ({1,2,0,0,0,3,4,5}) returns false. 
: isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns false. isHollow ({1,2, 0,0, 3,4}) returns false.
 */

public class Qn3Hollow {
    public static void main(String[] args) {

    int[] arr1 = {1,2,4,0,0,0,3,4,5};
    int[] arr2 = {1,2,0,0,0,3,4,5};
    int[] arr3 = {1,2,4,9, 0,0,0,3,4, 5};
    int[] arr4 = {1,2, 0,0, 3,4};
    int[] arr5 = {1,2, 0,0, 3,4, 0};

    System.out.println(isHollow(arr1)); // Output: true
    System.out.println(isHollow(arr2)); // Output: false
    System.out.println(isHollow(arr3)); // Output: false
    System.out.println(isHollow(arr4)); // Output: false
    System.out.println(isHollow(arr5)); // Output: false
  }

  public static int isHollow(int[] arr) {
    // Check if the array has at least 3 elements
    if (arr.length < 3) {
        return 0;
    }

    // Find the start and end index of the middle section of zeros
    int start = -1;
    int end = -1;
    for (int i = 0; i < arr.length - 2; i++) {
        if (arr[i] == 0 && arr[i + 1] == 0 && arr[i + 2] == 0) {
            start = i;
            break;
        }
    }
    for (int i = arr.length - 1; i >= 2; i--) {
        if (arr[i] == 0 && arr[i - 1] == 0 && arr[i - 2] == 0) {
            end = i;
            break;
        }
    }

    // Check if the middle section of zeros is surrounded by the same number of non-zero elements
    if (start != -1 && end != -1 && start != end) {
        int countBefore = 0;
        int countAfter = 0;

        // Count non-zero elements before and after the middle section of zeros
        for (int i = start - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                countBefore++;
            } else {
                break;
            }
        }
        for (int i = end + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                countAfter++;
            } else {
                break;
            }
        }

        // Check if the counts are the same
        if (countBefore == countAfter) {
            return 1; // Array is hollow
        }
    }

    return 0; // Array is not hollow
}

}