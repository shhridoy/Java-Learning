/* 8. (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward. 
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. 
Write a program that reads in a five-digit integer and determines whether it’s a palindrome. 
If the number is not five digits long, display an error message and allow the user to enter a new value.
*/

import java.util.Scanner;

public class Problem8 {
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {
            System.out.print("Please Enter a number of 5 digit: ");
            int palindrome = sc.nextInt();
        
            // FIRST WAY
            String number = Integer.toString(palindrome);
        
            if (number.length() == 5) {
                String reverse = new StringBuilder(number).reverse().toString();

                if (number.equals(reverse)) {
                    print("This is a palindrome");
                } else {
                    print("This is not a palindrome");
                }

                // SECOND WAY
                if (isPalindrome(palindrome)) {
                    System.out.println("Number : " + palindrome + " is a palindrome");
                } else {
                    System.out.println("Number : " + palindrome + " is not a palindrome");
                }
                break;
            } 
        }
        
    }
    
    private static void print(String s){
        System.out.println(s);
    }
    
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means number is palindrome
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
    
}

/* OUTPUT:
Please Enter a number of 5 digit: 11611
This is a palindrome
Number : 11611 is a palindrome
*/
