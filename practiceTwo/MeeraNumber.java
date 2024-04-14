/**
 * A Meera number is a number such that the number of nontrivial factors is a factor of the number. 
For example, 6 is a Meera number because 6 has two nontrivial factors : 2 and 3. 
(A nontrivial factor is a factor other than 1 and the number). Thus 6 has two nontrivial factors. 
Now, 2 is a factor of 6. Thus the number of nontrivial factors is a factor of 6. Hence 6 is a Meera number. 
Another Meera number is 30 because 30 has 2, 3, 5, 6, 10, 15 as nontrivial factors. Thus 30 has 6 nontrivial factors. 
Note that 6 is a factor of 30. So 30 is a Meera Number. However 21 is not a Meera number. 
The nontrivial factors of 21 are 3 and 7. Thus the number of nontrivial factors is 2. Note that 2 is not a factor of 21. 
Therefore, 21 is not a Meera number.
Write a function named isMeera that returns 1 if its integer argument is a Meera number, otherwise it returns 0.
The signature of the function is
int isMeera(int n)
*/

// step
// loop through the array and get factors
// Ignore 1 and the number itself
// check if the sum of the other factor is a similar to some number in the array

public class MeeraNumber {
  public static void main(String[] arg) {

    System.out.println(isMeeraNumber(6)); // Output: 1
    System.out.println(isMeeraNumber(30)); // Output: 1
    System.out.println(isMeeraNumber(21)); // Output: 0
    System.out.println(isMeeraNumber(15)); // Output: 0
    System.out.println(isMeeraNumber(3)); // Output: 0

  }
  public static int isMeeraNumber(int num) {
    if(num < 4) return 0;
    
    int factorsCount = 0;
    for(int i = 2; i < num/2; i++) {
      if(num % i == 0) {
        factorsCount++;
      }
    }

    if(num % factorsCount == 0) return 1;
    
    return 0;
  }
}