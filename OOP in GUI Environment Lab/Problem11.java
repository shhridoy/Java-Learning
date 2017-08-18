/* 11. (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 = 1 + 2 + 3. 
Write a program that includes a method isPerfect that determines if parameter number is a perfect number. 
Use this method to display all the perfect numbers between 1 and 1000. 
Display the factors of each perfect number to confirm that the number is indeed perfect. 
*/

import java.util.Scanner;

public class Problem11 {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Enter the number ");
        int number = input.nextInt ();
        if (isPerfect(number)){
            System.out.println("This is a perfect number.");
        } else {
            System.out.println("This is not a perfect number.");
        }
        
        System.out.println("\nThe perfect number between 1 to 1000\n");
        for (int num = 1; num <= 1000; num++) {
            if ( isPerfect(num) ) {
                System.out.println("The number " + num + " is a perfect number!");
            }
        }
        
    }
    
    public static Boolean isPerfect(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            return true;
        } else {
            return false;
        }

    }
}

/* OUTPUT:
Enter the number 
12
This is not a perfect number.

The perfect number between 1 to 1000

The number 6 is a perfect number!
The number 28 is a perfect number!
The number 496 is a perfect number!
*/
